# Mini-Assignment 3: Creating and Throwing a Custom Exception

## Objective
Create a custom checked exception that represents invalid alert data.

## Problem Statement
Generic exceptions do not always communicate the real problem. In an alerting system, invalid alert data should be reported with a meaningful domain-specific exception.

## Requirements
Complete the classes in this folder so that:
- `Alert` stores `id`, `message`, and `level`
- `AlertLevel` is an enum
- `InvalidAlertException` extends `Exception`
- `AlertValidatorDemo.validateAlert(...)` throws `InvalidAlertException` when:
  - message is null or blank
  - level is null
- `main` demonstrates the exception handling
