# Inheritance

## Question 1: Using switch
Complete the static method (function) `asciiValue` in the source file `ASCIINums.java`. The method must return the ASCII value of the given integer value. The given integer value **will** be a number between 0 and 9 (inclusive).

The test client for the method has been provided.

If you need a recap on ASCII values check out: https://hackerbytes.hackthedegree.com/2/core-concept/standard/what-is-ascii

## Question 2: Payment Processing System
You are designing a Payment Processing System. There are different types of payments such as **CreditCardPayment** and **SnapScan Payment**. Each payment type has common and specific features.

Your tasks:

1. Create an abstract class called `Payment` with the following:
    + A `protected double amount` attribute.
    + A constructor to initialise the amount.
    + An abstract method `processPayment()`.
2. Create a `CreditCardPayment` class that:
    + Extends the `Payment` class.
    + Includes additional attributes: cardNumber (`String`) and cardHolderName (`String`).
    + Implements the `processPayment()` method by printing a message that includes the payment amount, card number (masked, showing only the last 4 digits e.g. XXXX XXXX XXXX 5678), and card holder's name.
3. Create a `SnapScanPayment` class that:
    + Extends the `Payment` class.
    + Includes an additional attribute: qrCode (`String`).
    + Implements the `processPayment()` method by printing a message that includes the payment amount and the QR Code.
4. Write a `main` method to:
    + Create instances of `CreditCardPayment` and `SnapScanPayment` with appropriate values.
    + Add all the instances to a `Payment[]` array.
    + Iterate the indexes of the array and on each `Payment` object call the `processPayment()` method.

What are the benefits of using an abstract class like `Payment` in this scenario, and how does it promote code reusability?

## Question 3: Notification System
You are building a Notification System that can send messages via different communication channels such as **Email** and **SMS**.

Your tasks:
1. Create an interface called Notifier with the following:
    + A method `sendNotification(String message)`.
2. Create a class `EmailNotifier` that:
    + Implements the `Notifier` interface.
    + Has an additional attribute: `emailAddress` (String).
    + Implements the `sendNotification(String message)` method by printing a message saying the email has been sent to the given email address with the provided message content.
3. Create a class `SMSNotifier` that:
    + Implements the `Notifier` interface.
    + Has an additional attribute: `phoneNumber` (String).
    + Implements the `sendNotification(String message)` method by printing a message saying the SMS has been sent to the given phone number with the provided message content.
4. Write a `main` method to:
    + Create instances of `EmailNotifier` and `SMSNotifier` with appropriate values.
    + Use the `sendNotification()` method to send a sample message using both classes.

What are the advantages of using an interface like `Notifier` in this system, especially when adding new notification methods in the future?
