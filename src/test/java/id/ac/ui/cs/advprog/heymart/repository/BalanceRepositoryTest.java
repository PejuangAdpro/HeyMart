package id.ac.ui.cs.advprog.heymart.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import id.ac.ui.cs.advprog.heymart.model.User;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class BalanceRepositoryTest {

    @BeforeEach
    void setUp() {
    }

    BalanceRepository balanceRepository;


    @Test
    void TestIncrementUserBalance(){
        User user = new User(727L, "user", "pass", "test@gmail.com", "user");
        user.setBalance(0.0);
        balanceRepository.incrementUserBalance("user", 2.0);
        assertEquals(2.0, user.getBalance());

    }

}
