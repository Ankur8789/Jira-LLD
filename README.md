
---

# Jira Low-Level Design (LLD)

A robust, modular implementation of a Task Management System (Jira) focusing on extensibility, separation of concerns, and efficient data retrieval. This project demonstrates a production-grade approach to handling complex entity relationships and business reporting.

## ### 📊 Interview Evaluation

**Current Rating: 8/10 (Strong Candidate)**

| Criteria | Score | Insights |
| --- | --- | --- |
| **Architectural Split** | 10/10 | Clean separation between Service, DAO, and Factory layers. |
| **Design Patterns** | 9/10 | Effective use of **Factory** and **Builder** patterns for object creation. |
| **Data Modeling** | 8/10 | Use of Lombok `@SuperBuilder` and  lookup logic via HashMaps. |
| **Requirement Fit** | 7/10 | Core requirements met; logic for "delayed" status is handled in the Service. |

---

## ### 🏗 Architecture Overview

The system follows a strict **Layered Architecture** to ensure that business logic, data persistence, and object creation remain decoupled.

### 1. Model Layer (Entities)

Plain Java Objects (POJOs) that represent the state of the application.

* **Sprint:** Manages a collection of tasks within a specific timeframe.
* **Task/Subtask:** The unit of work. Supports multiple types (Bug, Story, Feature) via inheritance.
* **User:** Represents the assignee for accountability.
* **Status (Enum):** Tracks progress (OPEN, IN_PROGRESS, CLOSED).

### 2. Service Layer (The Brain)

Handles all **Business Logic** and orchestrates interactions.

* Calculates "Delayed Tasks" by comparing current system time with task deadlines.
* Filters tasks based on assigned Users.
* Uses the Factory to generate objects, keeping the service logic type-agnostic.

### 3. DAO Layer (Persistence)

Handles **Data Storage** independently of business rules.

* Uses `HashMap` to simulate an in-memory database.
* Provides  search efficiency for Sprints and Tasks.
* Ensures that storage implementation details don't leak into the business logic.

### 4. Factory Layer (The Manufacturer)

Centralizes **Object Instantiation**.

* The `SubtaskFactory` encapsulates the `if-else` or `switch` logic required to create specific task types (Bug, Feature, Story), ensuring the system is "Open for Extension but Closed for Modification."

---

## ### 🛠 Design Decisions

* **Lombok SuperBuilder:** Used to handle inheritance in builders (e.g., from `Subtask` to `Bug`), preventing boilerplate code and maintaining clean constructors.
* **In-Memory Storage:** Chosen for interview speed and simplicity, while structured to be easily replaced by a database-backed DAO later.
* **Single Responsibility Principle (SRP):** Each class has one job: Models hold data, Services process data, and DAOs store data.

---

## ### 🚀 Future Roadmap

* **State Design Pattern:** To implement strict workflow rules (e.g., a task cannot move from "Closed" to "In Progress" directly).
* **Inverse Indexing:** Implementing a `Map<User, List<Task>>` in the DAO to optimize user-based search from  to .
* **Composite Pattern:** Refining the relationship between Tasks and Subtasks to allow for multi-level nesting.

---

