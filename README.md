# Backend - AI Chatbot Application

## Overview
This is the backend service for the AI Chatbot application, built using **Java** and **Spring Boot**. It processes user queries and interacts with Gemini AI to generate responses.

## 📌 Technologies Used
- **Java**
- **Spring Boot**
  - `spring-boot-starter-web`
  - `spring-boot-starter-webflux`
- **Lombok**
- **Maven**

## 🚀 Setup Instructions

### 1️⃣ Clone the repository
```sh
git clone git@github.com:parshu-96/gemini-ai-chat-bot.git
```

### 2️⃣ Navigate to the backend project directory
```sh
cd gemini-ai-chat-bot
```

### 3️⃣ Build the project using Maven
```sh
mvn clean install
```

### 4️⃣ Run the Spring Boot application
```sh
mvn spring-boot:run
```

## 🔧 Configuring Environment Variables in IntelliJ IDEA
Set the following environment variables in IntelliJ IDEA:
```
GEMINI_API_URL=https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=
GEMINI_API_KEY=YOUR_SECRET_API_KEY
```
Replace `YOUR_SECRET_API_KEY` with your actual API key, but **do not expose it in public repositories**.

## 🔗 API Endpoints
| Method | Endpoint                 | Description |
|--------|-------------------------|-------------|
| **POST**   | `/api/qna/ask`          | Processes the user's question and returns a response. |
| **GET**    | `/metadata`             | Provides usage metadata like token counts. |

## 🔗 Frontend Repository Link
For the frontend source code, visit: [gemini-ai-chatbot-frontend](https://github.com/parshu-96/gemini-ai-chatbot-frontend#)

## 🚀 Deployment
- Can be deployed on a cloud platform like **AWS**, **Azure**, or a **VPS**.
- Use **Docker** for containerization if needed.

## 🤝 Contributing
1. **Fork** the repository.
2. **Create a new branch** for your feature or fix.
3. **Commit changes** and push to your branch.
4. **Open a Pull Request**.

## 📜 License
This project is licensed under the **MIT License**.

## 📞 Contact
For any questions, reach out via **parshuvmahindrakar@gmail.com**.

