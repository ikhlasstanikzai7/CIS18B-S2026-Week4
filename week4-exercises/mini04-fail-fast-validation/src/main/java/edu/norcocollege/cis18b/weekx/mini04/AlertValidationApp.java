package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {

    public static void main(String[] args) {
        AlertValidator validator = new AlertValidator();

        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.WARNING);
        Alert invalidAlert = new Alert(2, "   ", null);

        // Checking valid alert
        try {
            validator.validate(validAlert);
            System.out.println("Valid alert processed successfully.");
        } catch (InvalidAlertException e) {
            System.out.println("Invalid alert: " + e.getMessage());
        }

        // Checking invalid alert
        try {
            validator.validate(invalidAlert);
            System.out.println("Valid alert processed successfully.");
        } catch (InvalidAlertException e) {
            System.out.println("Invalid alert: " + e.getMessage());
        }
    }
}
