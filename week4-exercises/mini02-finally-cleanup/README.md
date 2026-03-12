# Mini-Assignment 2: Cleaning Up with finally

## Objective
Use `finally` to perform cleanup logic whether an operation succeeds or fails.

## Problem Statement
Monitoring software often opens files, network connections, or streams that must be closed no matter what happens. In this assignment, you will simulate a failing alert stream and guarantee cleanup with `finally`.

## Requirements
Complete `FinallyDemo` so that it:
- prints that the alert stream is opening
- throws a simulated exception
- catches the exception and prints its message
- uses `finally` to print that the stream is closing

## Run
```bash
mvn compile
mvn exec:java
```
