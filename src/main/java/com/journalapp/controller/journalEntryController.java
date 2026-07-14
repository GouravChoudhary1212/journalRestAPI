package com.journalapp.controller;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.jar.JarEntry;
import com.journalapp.entity.JournalEntry;

@RestController
@RequestMapping("/_journal")
public class journalEntryController {


    private Map<ObjectId, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getall(){
        return new ArrayList<>(journalEntries.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry ){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;

    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryById(@PathVariable long myid){
        return journalEntries.get(myid);
    }

    @DeleteMapping("id/{myid}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myid){
        return journalEntries.remove(myid);
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId id, @RequestBody JournalEntry myEntry ){
        return journalEntries.put(id,myEntry);

    }

}
