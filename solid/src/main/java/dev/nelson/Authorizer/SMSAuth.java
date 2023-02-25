package dev.nelson.Authorizer;

public class SMSAuth implements Authorizer {
    private boolean authorized;

    public SMSAuth() {
        this.authorized = false;
    }

    public void verify_code(final String code) {
        System.out.println("Verifying the code: " + code);
        this.authorized = true;
    }

    @Override
    public boolean isAuthorized() {
        return this.authorized;
    }

}
