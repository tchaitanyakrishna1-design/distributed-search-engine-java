package com.chaitu.search.coordinator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ClusterHealthController {

    private final RestTemplate restTemplate;

    public ClusterHealthController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/cluster/health")
    public Map<String, Object> clusterHealth() {

        Map searchNodeHealth =
                restTemplate.getForObject(
                        "http://localhost:8081/health",
                        Map.class
                );

        return Map.of(
                "coordinator", "UP",
                "search-node", searchNodeHealth
        );
    }
}
