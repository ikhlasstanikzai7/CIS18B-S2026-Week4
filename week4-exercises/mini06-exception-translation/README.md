# Mini-Assignment 6: Exception Translation

## Objective
Catch a low-level exception and translate it into a domain-specific exception.

## Problem Statement
Low-level storage errors should not leak directly into the rest of the application. In this assignment, you will simulate a low-level failure in a repository and wrap it in `AlertStorageException`.

## Requirements
Complete the classes so that:
- `AlertRepository` declares a `save(Alert alert)` method
- `InMemoryAlertRepository.save(...)` simulates a low-level failure
- the low-level exception is caught and wrapped in `AlertStorageException`
- the original cause is preserved
- `RepositoryDemo` catches and prints the translated exception
