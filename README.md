# Wanderlust Application

Welcome to the Wanderlust application! This application is a travel management system designed to help users organize their travel plans effectively.

## Description

Wanderlust helps users manage their travel itineraries, destinations, and wallets. It offers various functionalities such as creating itineraries, adding destinations, tracking expenses, and managing the user wallet.

## Features
- ** User Management**: Register, Retrieve, Update, Delete User Features.
- **Itinerary Management**: Create, update, and delete itineraries.
- **Destination Tracking**: Add destinations to itineraries and manage their completion status.
- **Wallet Management**: Manage user wallet, add money, and track expenses.

## Installation

To install and run the application locally, follow these steps:

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean install` to build the project.
4. Start the application by running `java -jar wanderlust.jar`.

## API Endpoints

The Wanderlust application provides the following API endpoints:
-`users`: Manages user
- `/itineraries`: Manages itineraries.
- `/destinations`: Handles destination management.
- `/wallet`: Manages user wallets and expenses.

For detailed API documentation, refer to Swagger UI or the API documentation file.

## Usage

Interact with the Wanderlust application by using tools like Postman or cURL to access the provided API endpoints.

Example:
```bash
curl -X POST http://localhost:8080/wallet/addMoney/johndoe@example.com/50.00
