package id.ac.ui.cs.advprog.heymart.service;

public interface BalanceService {
    double topUp(String username, double amount);
    double withdraw(Long id, double amount);
}
