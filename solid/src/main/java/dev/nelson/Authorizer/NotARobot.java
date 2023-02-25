package dev.nelson.Authorizer;

public class NotARobot implements Authorizer {
    private boolean authorized;

    public NotARobot() {
        this.authorized = false;
    }

    public void notARobot() {
        System.out.println("Are you a robot?");
        this.authorized = true;
    }

    @Override
    public boolean isAuthorized() {
        return this.authorized;
    }

}
