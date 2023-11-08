# Wanderlust Travel Planner

Welcome to the Wanderlust Travel Planner! This application is designed to help users manage their travel itineraries, destinations, and wallets effectively.

## Description

Wanderlust is a comprehensive travel management system created to assist users in organizing their travel plans efficiently. It offers the capability to create itineraries, add destinations, manage the user wallet, and track travel expenses seamlessly.

## Features

- **Itinerary Management**: Create, update, and delete itineraries.
- **Destination Tracking**: Add destinations to itineraries and manage their completion status.
- **Wallet Management**: Administer user wallets, add funds, and monitor expenses.

## Installation

To run the application locally, follow these steps:

1. Clone the repository.
2. Navigate to the project directory.
3. Execute `mvn clean install` to build the project.
4. Start the application using `java -jar wanderlust.jar`.

## API Endpoints

The Wanderlust application provides the following API endpoints:

- `/itinerary`: Manages itineraries.
- `/destination`: Handles destination management.
- `/wallet`: Manages user wallets and expenses.

The comprehensive API documentation can be accessed via Swagger UI or the API documentation file.

## Usage

To interact with the Wanderlust application, you can utilize the provided API endpoints using tools like Postman or cURL.

Example:
```bash
curl -X POST http://localhost:8080/wallet/add-money?email=user@example.com&amount=50.00
