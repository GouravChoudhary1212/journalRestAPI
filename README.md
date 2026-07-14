# 📓 Journal REST API

A REST API built with **Spring Boot** and **Java** to manage journal entries.

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-green)
![MongoDB](https://img.shields.io/badge/MongoDB-Database-brightgreen)
![Build](https://img.shields.io/badge/Build-Maven-orange)

![GitHub stars](https://img.shields.io/github/stars/GouravChoudhary1212/journalRestAPI?style=social)
![GitHub forks](https://img.shields.io/github/forks/GouravChoudhary1212/journalRestAPI?style=social)
![GitHub issues](https://img.shields.io/github/issues/GouravChoudhary1212/journalRestAPI)

---

## 🚀 Features
- Create, read, update, and delete journal entries
- Health check endpoint
- User management controller
- MongoDB integration for storing entries

---

## 🛠 Tech Stack
- **Java**
- **Spring Boot**
- **Maven**
- **MongoDB**

---
## 📡 API Response Example

### GET /journal

**Request:**
```http
GET http://localhost:8080/journal

[
  {
    "id": "64b7f9c2e4a1",
    "title": "My First Journal",
    "content": "Today I started learning Spring Boot!",
    "createdAt": "2026-07-14T10:30:00Z"
  },
  {
    "id": "64b7f9c2e4a2",
    "title": "Second Entry",
    "content": "Explored MongoDB integration.",
    "createdAt": "2026-07-14T11:00:00Z"
  }
]


## ⚡ Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/GouravChoudhary1212/journalRestAPI.git
