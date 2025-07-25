# RESTful Bookstore API 📚

This project is a Spring Boot-based RESTful API for managing a bookstore. It allows users to add, retrieve, update, and delete books from a virtual library.

---

## 🚀 Features

- Add new books with title, author, and price
- Get all books or a specific book by ID
- Update book details
- Delete books
- In-memory data using H2 (can be extended to MySQL/PostgreSQL)
- Postman collection included for testing

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA
- H2 Database (In-memory)
- Postman (for testing)
- Git & GitHub (for version control)

---

## 📂 Project Structure

src/
├── main/
│ ├── java/com/example/bookstore/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ └── BookstoreApplication.java
│ └── resources/
│ ├── application.properties
│ └── data.sql (optional for preloading books)
└── test/


---

## 📦 API Endpoints

| Method | Endpoint       | Description            |
|--------|----------------|------------------------|
| GET    | `/books`       | Get all books          |
| GET    | `/books/{id}`  | Get a book by ID       |
| POST   | `/books`       | Add a new book         |
| PUT    | `/books/{id}`  | Update a book          |
| DELETE | `/books/{id}`  | Delete a book          |

---

## 🧪 How to Test with Postman

1. **Start the Spring Boot app**  
   Run `BookstoreApplication.java`

2. **Open Postman**  
   Send a POST request to:
http://localhost:8080/books


Use this JSON in body (raw → JSON):
```json
{
  "title": "Atomic Habits",
  "author": "James Clear",
  "price": 450.0
}
Try other endpoints similarly (GET, PUT, DELETE)




🗃️ Postman Collection
The postman/ folder includes:

Bookstore-Collection.json — import this into Postman




💾 How to Run
Clone the repo:

git clone https://github.com/your-username/RESTful-Bookstore-API.git
cd RESTful-Bookstore-API
Run the project:

In VS Code or IntelliJ: Run BookstoreApplication.java

Or with terminal:

./mvnw spring-boot:run



☁️ Future Enhancements
Connect to MySQL

Add Swagger documentation

Add user authentication (JWT)

Book search/filter/pagination



🤝 Contributing
Feel free to fork and improve this API. PRs are welcome!



🧑‍💻 Author
S. Durganandhu
BTech ECE | Aspiring Java Backend Developer
Made with 💙 and caffeine ☕


📜 License
This project is licensed under the MIT License.
