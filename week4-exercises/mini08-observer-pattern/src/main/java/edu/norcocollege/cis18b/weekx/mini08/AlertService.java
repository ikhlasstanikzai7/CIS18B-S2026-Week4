package edu.norcocollege.cis18b.weekx.mini08;

import java.util.ArrayList;
import java.util.List;

public class AlertService {

    private List<AlertObserver> observers = new ArrayList<>();

    public void addObserver(AlertObserver observer) {
        observers.add(observer);
    }

    public void processAlert(Alert alert) {
        System.out.println("Processing alert: " + alert.message());

        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).onAlert(alert);
        }
    }
}
