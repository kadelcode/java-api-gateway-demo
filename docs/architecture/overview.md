# Architecture Overview

## Introduction

This project demonstrates a simple microservices architecture consisting of an API Gateway, a Service Discovery server, and three backend services.

## Components

- API Gateway
- Eureka Discovery Server
- User Service
- Product Service
- Order Service

## High-Level Architecture

```mermaid
A[Client];
B[API Gateway];
C[Eureka Server];
D[User];
E[Product];
F[Order];

A --> B
B --> C
C --> D
C --> E
C --> F
```

## Request Flow

1. Client sends a request to the Gateway.
2. Gateway queries Eureka.
3. Eureka returns the service location.
4. Gateway forwards the request.
5. Service processes the request.
6. Response is returned to the client.

## Future Enhancements

- JWT Authentication
- Rate Limiting
- Circuit Breaker
- Docker
- Centralized Configuration
