package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {
    public static void main(String[] args) {
        AlertValidator validator = new AlertValidator();

        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.WARNING);
        Alert invalidAlert = new Alert(2, "   ", null);

        // TODO: Validate the valid alert and print a success message.
        // TODO: Validate the invalid alert and print the exception message.
    }
}
