# Mini-Assignment 8: Observer Pattern for Notifications

## Objective
Notify multiple listeners when a new alert is processed.

## Problem Statement
One alert can trigger several actions: an email notification, a log entry, or a text message. In this assignment, you will use the Observer pattern so the system can notify multiple listeners without tightly coupling them to the service.

## Requirements
Complete the classes so that:
- `AlertObserver` defines `onAlert(Alert alert)`
- at least two concrete observers print different messages
- `AlertService` stores observers and notifies them after successful processing
