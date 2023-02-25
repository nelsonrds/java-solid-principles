package dev.nelson.Payment;

public class SMSAuth {
    private boolean authorized = false;

    public SMSAuth(){}

    public void verify_code(final String code) {
        System.out.println("Verifying the code: " + code);
        this.authorized = true;
    }

    public boolean isAuthorized() {
        return this.authorized;
    }
}
