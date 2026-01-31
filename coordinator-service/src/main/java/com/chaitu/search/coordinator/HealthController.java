package com.chaitu.search.coordinator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    private static final Logger logger =
            LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/health")
    public Map<String, Object> health() {
        logger.info("Health check endpoint called");

        Map<String, Object> response = new HashMap<>();
        response.put("service", "coordinator-service");
        response.put("status", "UP");
        response.put("timestamp", Instant.now().toString());

        return response;
    }
}
