package edu.norcocollege.cis18b.weekx.mini08;

public class EmailAlertObserver implements AlertObserver {

    public void onAlert(Alert alert) {
        System.out.println("Sending email for alert " + alert.id() + ": " + alert.message());
    }
}
