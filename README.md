# java-solid-principles
Implementing Java Solid Principles

Initialy we have a Order Class tha handls the orders and the payments.
- This breaks the Single Responsability principle.
To fix this we need to create another class, for example: ProcessPayment and inject the order into this new class.

The class ProcessPayment contains the logic to do the payment, but if we want to implement another payment method we have to modify this class.
- Here we violating the open/closed principle.
To fix that we should create a class/interface and implement the payments, in this case credit and debit payment.

The method pay in the class PaymentProcessor has a securitycode input, this is a problem because the paypalpaymentprocessor doesn't need a security code.
- This is violating the Liskov Substitution principle.
To fix this we can add to the constructor of each paymentprocessors types the different input type, in this case security code for both credit and debit and e-mail for paypal
