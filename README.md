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


In the class PaymentProcessor if we add another method, for example sms authentication, we can just implement it in the sub classes and that's it.
The problem is that the credit card doesn't have two factor authentication, therefore the implementation will be empty or will throw an error.
- This will break the Interface Segragation principle, it states that instead of having a huge interface with multiple methods we should separate them into smaller ones.


Instead of creating a new interface to handle different cases, we can use composition instead.
- Interface Segregation variety using composition.
Create a new class that handls the authentication and remove the interface PaymentProcessorSms.

Now we have a problem, our paymentprocessors implementation classes are repending on a class and not on an abstraction/interface.
- This violates the dependency inversion principle.
To fix that we can create an interface and implement the method isAuthorized. This way we can add multiple authorization types.