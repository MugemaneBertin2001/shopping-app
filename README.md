# Shopping App

This Java application demonstrates various functionalities related to shopping, including payment processing, order handling, and product management.

## Features

- **Singleton Pattern**: Utilizes the Singleton pattern for the `AuthManager` class to ensure only one instance is created.
- **Strategy Pattern**: Implements the Strategy pattern for payment processing with different payment methods such as credit card and PayPal.
- **Observer Pattern**: Demonstrates the Observer pattern for order processing with observers for inventory management and shipping.
- **Product Management**: Includes classes for managing different types of products, such as phones and laptops.

## How to Use

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment (e.g., IntelliJ IDEA, Eclipse).
3. Run the `./gradle run` command in your terminal to execute the application.
4. Follow the prompts in the console to interact with the different features of the app.

## Usage

- The `App` class contains the `main` method, which orchestrates the demonstration of various app features.
- Each method in the `App` class demonstrates a specific feature, such as singleton behavior, shopping cart functionality, order observers, and product details.

## Dependencies

- Java Development Kit (JDK) 8 or higher
- Gradle Build Tool

## Running Tests

- Run the `./gradle test` command in your terminal to execute all tests in the project.

## Contributors

- [MugemaneBertin2001](https://github.com/MugemaneBertin2001)

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.
