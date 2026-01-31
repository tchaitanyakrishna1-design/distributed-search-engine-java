# System Architecture

## High-Level Architecture Diagram

```mermaid
graph TD
    User[User / Client]
    Coordinator[Query Coordinator Service]
    Node1[Search Node 1]
    Node2[Search Node 2]
    Node3[Search Node 3]

    User --> Coordinator
    Coordinator --> Node1
    Coordinator --> Node2
    Coordinator --> Node3

    Node1 --> Coordinator
    Node2 --> Coordinator
    Node3 --> Coordinator
