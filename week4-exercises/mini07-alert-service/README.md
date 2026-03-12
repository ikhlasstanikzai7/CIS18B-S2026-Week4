# Mini-Assignment 7: Processing Alerts Through a Service Layer

## Objective
Combine validation, storage, and exception propagation in a service class.

## Problem Statement
An alert service should validate data, save it through a repository, and communicate errors clearly. In this assignment, you will connect the earlier pieces into a simple service layer.

## Requirements
Complete the classes so that:
- `AlertService.processAlert(Alert)` validates the alert
- it saves the alert through the repository
- it throws `InvalidAlertException` for invalid data
- it throws `AlertStorageException` for storage failures
- it may throw `AlertProcessingException` for unexpected problems
