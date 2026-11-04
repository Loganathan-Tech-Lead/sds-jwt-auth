# 10. JWT auth

**Category:** Edge and traffic  |  **Status:** Scaffold - implement the TODOs

Short-lived signed tokens verified with JWKS (RS256).

## Sequence
```mermaid
sequenceDiagram
    participant Client
    participant Auth
    participant Gateway
    Client->>Auth: POST /oauth/token
    Auth->>Client: 200 access_token
    Client->>Gateway: GET /orders Bearer
    Gateway->>Client: 401 invalid_token when expired
```

## Run
```bash
# no infrastructure needed
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
