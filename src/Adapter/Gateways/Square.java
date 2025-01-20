package Adapter.Gateways;

public class Square {
    public void charge(String phoneNumber, double amount) {
        System.out.println("Processing Square payment for phone " + phoneNumber + " of amount " + amount);
    }
}

