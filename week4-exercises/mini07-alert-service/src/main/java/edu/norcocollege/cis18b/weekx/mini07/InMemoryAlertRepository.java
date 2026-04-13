package edu.norcocollege.cis18b.weekx.mini07;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAlertRepository implements AlertRepository {
    private final List<Alert> alerts = new ArrayList<>();

    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            
            if (alert.message().contains("fail")) {
                throw new RuntimeException("Simulated database failure");
            }

            alerts.add(alert);

        } catch (RuntimeException ex) {
            throw new AlertStorageException("Failed to save alert.", ex);
        }
    }

    public List<Alert> findAll() {
        return new ArrayList<>(alerts);
    }
}
