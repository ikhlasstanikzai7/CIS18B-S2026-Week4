# Mini-Assignment 4: Fail-Fast Validation

## Objective
Validate data early so invalid objects do not travel deeper into the application.

## Problem Statement
A good alerting system should reject invalid alerts immediately. In this assignment, you will separate validation from processing and use fail-fast logic.

## Requirements
Complete the classes so that:
- `AlertValidator.validate(Alert)` throws `InvalidAlertException` if the alert is null
- it also throws if the message is blank
- it also throws if the level is null
- valid alerts pass without exception
- `AlertValidationApp` demonstrates one valid and one invalid alert
