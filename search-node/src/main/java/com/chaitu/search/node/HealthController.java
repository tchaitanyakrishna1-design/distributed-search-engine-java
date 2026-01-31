package com.chaitu.search.node;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        return Map.of(
                "service", "search-node",
                "status", "UP",
                "timestamp", Instant.now().toString()
        );
    }
}
