# Distributed Search Engine – System Design

## 1. Overview
This project implements a distributed search engine where data and search
operations are spread across multiple nodes to achieve scalability,
fault tolerance, and low-latency query execution.

---

## 2. High-Level Architecture
The system consists of:
- Query Coordinator
- Multiple Search Nodes
- Distributed Inverted Index
- Ranking and Aggregation Engine

The coordinator receives user queries, forwards them to all search nodes
in parallel, aggregates results, ranks them, and returns the final response.

---

## 3. Components

### 3.1 Query Coordinator
Responsibilities:
- Accept search requests
- Dispatch queries to search nodes in parallel
- Handle node timeouts and failures
- Aggregate and rank results

---

### 3.2 Search Node
Responsibilities:
- Store a shard of the inverted index
- Index documents locally
- Execute search queries on local data
- Return ranked partial results

---

### 3.3 Inverted Index
- Maps terms to document IDs
- Stored locally on each search node
- Built during indexing phase

---

### 3.4 Ranking Engine
- Scores documents based on term frequency
- Returns top-N relevant documents per node

---

## 4. Data Flow

1. Documents are indexed and distributed across search nodes
2. User submits a search query
3. Coordinator sends query to all nodes
4. Nodes return partial ranked results
5. Coordinator merges and sorts results
6. Final results returned to user

---

## 5. Non-Goals
- Web crawling
- Advanced NLP
- Machine learning-based ranking
