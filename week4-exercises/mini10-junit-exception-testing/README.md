# Mini-Assignment 10: Unit Testing Exception Behavior

## Objective
Use JUnit to verify both successful and failing exception scenarios.

## Problem Statement
Good testing covers valid inputs and failure cases. In this assignment, you will complete the validator and service code, then finish the test suite so that exception behavior is verified automatically.

## Requirements
Complete the production code and tests so that:
- a valid alert does not throw
- a blank message throws `InvalidAlertException`
- a null level throws `InvalidAlertException`
- a successful alert is stored
- a failing repository causes `AlertStorageException`

## Run
```bash
mvn test
```
