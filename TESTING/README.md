# Abstraction in Java

Abstraction is a fundamental concept in Object-Oriented Programming (OOP) that focuses on hiding the internal implementation details of a system and exposing only the necessary functionality to the user. It helps in managing complexity by ignoring irrelevant details.

In Java, abstraction is achieved using:
1.  **Abstract Classes** (0 to 100% abstraction)
2.  **Interfaces** (100% abstraction)

## Use Cases of Abstraction

1.  **Hiding Implementation Details (Security & Simplicity)**
    *   **Use Case:** When you want to provide a simple interface to a complex system. For example, a car driver knows how to use the steering wheel and pedals (interface) but doesn't need to know how the engine combustion works internally (implementation).
    *   **Benefit:** Increases security by hiding sensitive logic and makes the system easier to use.

2.  **Code Reusability and Template Design**
    *   **Use Case:** When multiple classes share common behaviors but have specific implementations. You can define a template in an abstract class and let subclasses fill in the details.
    *   **Benefit:** Reduces code duplication.

3.  **Loose Coupling**
    *   **Use Case:** When you want to decouple the definition of a service from its implementation. This allows you to switch implementations without changing the code that uses the service.
    *   **Benefit:** Makes the system more flexible and easier to maintain.

4.  **Focusing on "What" instead of "How"**
    *   **Use Case:** Designing a system at a high level before diving into details. You define *what* a system should do (interfaces) before deciding *how* it will do it.

---

## Examples

### 1. Abstract Class Example: Banking System

In a banking system, `Bank` can be an abstract class because "Bank" is a general concept. Specific banks like `SBI` or `HDFC` will have their own interest rates.

```java
abstract class Bank {
    // Abstract method (does not have a body)
    abstract int getRateOfInterest();

    // Concrete method
    void commonService() {
        System.out.println("Provides generic banking services.");
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class TestBank {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
        
        b = new HDFC();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
    }
}
```

### 2. Interface Example: Payment Processing

An e-commerce application might support multiple payment methods. The application code should work with a generic `PaymentProcessor` interface, not specific implementations like `CreditCard` or `PayPal`.

```java
interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        // The type is the interface, the instance is the specific implementation
        PaymentProcessor payment = new CreditCardPayment();
        payment.processPayment(100.00);

        // Switching implementation is easy
        payment = new PayPalPayment();
        payment.processPayment(50.50);
    }
}
```
