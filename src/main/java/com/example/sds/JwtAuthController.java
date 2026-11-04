package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "JWT auth" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class JwtAuthController {
    @GetMapping("/demo/jwt-auth")
    public Map<String, String> demo() {
        return Map.of("concept", "JWT auth", "status", "scaffold - implement me");
    }
}
