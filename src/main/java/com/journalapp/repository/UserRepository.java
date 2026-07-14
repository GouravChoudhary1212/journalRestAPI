package com.journalapp.repository;

import com.journalapp.entity.JournalEntry;
import com.journalapp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository< User,ObjectId> {


    List<User> id(ObjectId id);
}
