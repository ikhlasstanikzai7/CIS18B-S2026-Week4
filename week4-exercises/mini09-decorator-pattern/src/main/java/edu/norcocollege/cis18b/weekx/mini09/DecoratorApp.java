package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {

    public static void main(String[] args) {

        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);

        // Create basic handler
        AlertHandler basic = new BasicAlertHandler();

        // Wrap with logging decorator
        AlertHandler loggingHandler = new LoggingAlertHandlerDecorator(basic);

        // Handle alert
        loggingHandler.handle(alert);
    }
}
