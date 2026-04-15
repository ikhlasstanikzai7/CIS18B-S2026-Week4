\package edu.norcocollege.cis18b.weekx.mini08;

public class LogAlertObserver implements AlertObserver {

    public void onAlert(Alert alert) {
        System.out.println("Logging alert " + alert.id() + " with level " + alert.level());
    }
}
