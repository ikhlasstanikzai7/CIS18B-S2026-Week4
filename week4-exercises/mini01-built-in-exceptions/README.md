# Mini-Assignment 1: Handling Built-In Exceptions

## Objective
Practice catching common built-in exceptions and allowing the program to continue running.

## Problem Statement
A monitoring application processes numeric values and alert lists. Sometimes the program receives invalid numeric operations or tries to access invalid positions in an array. Your job is to make the program fail gracefully.

## Requirements
Complete `BuiltInExceptionDemo` so that it:
- attempts division by zero inside a `try` block
- catches `ArithmeticException`
- attempts to access an invalid array index inside a `try` block
- catches `ArrayIndexOutOfBoundsException`
- prints a helpful message for each problem
- prints `Program completed.` at the end

## Run
```bash
mvn compile
mvn exec:java
```
