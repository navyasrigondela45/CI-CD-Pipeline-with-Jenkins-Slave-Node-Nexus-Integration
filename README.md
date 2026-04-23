# 🚀 CI/CD Pipeline using Jenkins, Slave Node & Nexus

This project demonstrates a complete CI/CD pipeline setup using Jenkins with a master-slave architecture, integrated with Nexus for artifact management and SMTP for build notifications.

---

## 📌 Project Overview

This pipeline automates the process of:
- Fetching source code from GitHub
- Building the application using Maven
- Creating artifacts (WAR file)
- Uploading artifacts to Nexus Repository
- Sending email notifications based on build status

---

## 🏗️ Architecture

- **Jenkins Master** – Orchestrates pipeline
- **Jenkins Slave Node** – Executes build jobs
- **Nexus Repository** – Stores build artifacts
- **SMTP Server** – Sends email notifications

---

## ⚙️ Tools & Technologies Used

- Jenkins (Pipeline as Code)
- Maven
- Nexus Repository Manager
- Git & GitHub
- Java
- SMTP (Email Notifications)

---

## 🔄 Pipeline Workflow

1. Pull code from GitHub repository
2. Compile and build using Maven
3. Generate WAR file
4. Upload artifact to Nexus
5. Send email notification:
   - ✅ Success
   - ❌ Failure
   - ⚠️ Aborted

---

## 📸 Output Snapshots

> Screenshots are attached for reference:

- Jenkins Pipeline Execution
  <img width="1735" height="837" alt="image" src="https://github.com/user-attachments/assets/6a228972-f4a4-402a-9227-15b99ca24235" />
  
- Successful Build Console Output
  <img width="1907" height="681" alt="image" src="https://github.com/user-attachments/assets/0d6cee0a-d93c-4213-97db-80c0234ab89d" />

- Tomcat hosted application
  
  
- Nexus Artifact Upload
- Email Notifications (Success/Failure)

---

## 📂 Project Structure

```
.
├── Jenkinsfile
├── pom.xml
├── src/
└── README.md
```

---

## ✨ Key Highlights

- Implemented **Pipeline as Code**
- Configured **Distributed Builds using Slave Node**
- Integrated **Artifact Repository (Nexus)**
- Automated **Email Notifications via SMTP**
- Demonstrated both **Success and Failure Scenarios**

---

## 📬 Notifications Setup

SMTP configured in Jenkins to trigger emails for:
- Build Success
- Build Failure
- Build Aborted

---

## 🎯 Learning Outcomes

- Hands-on experience with CI/CD pipeline design
- Understanding of Jenkins master-slave architecture
- Artifact lifecycle management using Nexus
- Real-time build monitoring and alerting

---

## 🔗 Connect with Me

- GitHub: https://github.com/navyasrigondela45
- LinkedIn: www.linkedin.com/in/navya-sri-gondela-a60091258

---

## ⭐ Conclusion

This project simulates a real-world CI/CD workflow used in production environments, showcasing automation, scalability, and integration of multiple DevOps tools.
