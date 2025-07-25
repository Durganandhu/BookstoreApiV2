# 📚 Bookstore API V2

A RESTful Bookstore API built using Spring Boot (Java) to manage books. This project supports basic CRUD operations and is designed for beginner-level API learning and practice.

---

## 📁 Project Structure


BookstoreApiV2/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/bookstore/api/
│ │ │ ├── controller/
│ │ │ │ └── BookController.java
│ │ │ ├── model/
│ │ │ │ └── Book.java
│ │ │ ├── repository/
│ │ │ │ └── BookRepository.java
│ │ │ └── BookstoreApiV2Application.java
│ │ └── resources/
│ │ └── application.properties
├── pom.xml
└── README.md ✅


---

## 🚀 How to Run the Project

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/BookstoreApiV2.git
cd BookstoreApiV2

2. Open in VS Code (or IntelliJ)
Make sure your environment has:

Java 17+

Maven

Spring Boot support


3. Run the Application
In VS Code Terminal:
./mvnw spring-boot:run

Or just run BookstoreApiV2Application.java as a Java application.

Spring Boot will start the server at:

http://localhost:8080


Using Postman to Test API
Add a Book
Method: POST
URL: http://localhost:8080/books
Body → raw → JSON
{
  "title": "Atomic Habits",
  "author": "James Clear",
  "price": 450.0
}
Click "Send" → You should see a response like:

{
  "id": 1,
  "title": "Atomic Habits",
  "author": "James Clear",
  "price": 450.0
}




View All Books
Method: GET
URL: http://localhost:8080/books

View Book by ID
Method: GET
URL: http://localhost:8080/books/1

Delete a Book
Method: DELETE
URL: http://localhost:8080/books/1

💾 Exporting & Saving Postman Collection
Open Postman.

Click on your collection → ... → Export → Collection v2.1

Save the .json file as:

BookstoreApiV2.postman_collection.json
Paste this file inside your project folder.

🧠 GitHub - Push Code to Repository
1. Create Repository on GitHub
Name: BookstoreApiV2

Keep it empty (no README)

2. Push Project from VS Code
git init
git add .
git commit -m "Initial commit - Bookstore API v2"
git branch -M main
git remote add origin https://github.com/your-username/BookstoreApiV2.git
git push -u origin main
(Replace your-username with your GitHub username)


👩‍💻 Author
S. Durganandhu











