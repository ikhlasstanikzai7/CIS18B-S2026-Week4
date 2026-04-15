package edu.norcocollege.cis18b.weekx.mini10;

public class AlertValidator {

    public void validate(Alert alert) throws InvalidAlertException {

        if (alert == null) {
            throw new InvalidAlertException("Alert is null");
        }

        if (alert.message() == null || alert.message().trim().isEmpty()) {
            throw new InvalidAlertException("Message is blank");
        }

        if (alert.level() == null) {
            throw new InvalidAlertException("Level is null");
        }
    }
}
