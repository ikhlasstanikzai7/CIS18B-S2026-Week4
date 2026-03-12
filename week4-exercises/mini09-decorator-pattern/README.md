# Mini-Assignment 9: Decorator Pattern for Logging

## Objective
Add logging around alert handling without changing the core handler implementation.

## Problem Statement
Applications often need cross-cutting behavior such as logging or timing. In this assignment, you will use the Decorator pattern to wrap an alert handler and print messages before and after the real work happens.

## Requirements
Complete the classes so that:
- `AlertHandler` defines `handle(Alert alert)`
- `BasicAlertHandler` prints a simple handling message
- `LoggingAlertHandlerDecorator` logs before and after delegating to the wrapped handler
- `DecoratorApp` demonstrates the decorated handler
