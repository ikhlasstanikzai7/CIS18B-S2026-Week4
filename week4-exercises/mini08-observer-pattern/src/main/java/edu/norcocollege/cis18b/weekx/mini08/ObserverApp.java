package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {

    public static void main(String[] args) {

        AlertService service = new AlertService();

        EmailAlertObserver email = new EmailAlertObserver();
        LogAlertObserver log = new LogAlertObserver();

        service.addObserver(email);
        service.addObserver(log);

        Alert alert = new Alert(1, "Server is down", AlertLevel.CRITICAL);

        service.processAlert(alert);
    }
}
