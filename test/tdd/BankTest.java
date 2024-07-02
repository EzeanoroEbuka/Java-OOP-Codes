package tdd;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank access = new Bank();

    @BeforeEach
    public void setUp(){
        access.addCustomer("kent beck","09032489848","1111");
        access.addCustomer("janet becky","07032489848","2222");
    }
    @Test
    public void testThatBankHasNoCustomerAccountYet() {
        assertEquals(0, access.checkNumberOfAccountInBank());
    }

    @Test
    public void testThatBankHasOny_1_CustomerAccount() {
        access.addCustomer("kent beck","09032489848","1111");
        assertEquals(1, access.checkNumberOfAccountInBank());
    }

    @Test
    public void testThatBankHasOny_2_to_3_CustomerAccount() {
        setUp();
        access.addCustomer("musa", "08033099848","3333");
        assertEquals(3, access.checkNumberOfAccountInBank());
    }

    @Test
    public void testThatAccountBalanceAtDefaultIsZero() {
        setUp();
        assertEquals(0, access.checkBalance("9032489848", "1111"));
    }

    @Test
    public void testThatDepositOf_5k_BalanceIs_5k() {
        setUp();
        access.deposit("9032489848", 5000);
        assertEquals(5000, access.checkBalance("9032489848", "1111"));
    }

    @Test
    public void testThatDepositOf_5k_twiceBalanceIs_10k() {
        setUp();
        access.deposit("9032489848", 5000);
        access.deposit("9032489848", 5000);
        assertEquals(10000, access.checkBalance("9032489848", "1111"));
    }

    @Test
    public void testThatWithdrawalOf_3k_fromAccountWith_10kBalanceIs_7k() {
        setUp();
        access.deposit("9032489848", 5000);
        access.deposit("9032489848", 5000);
        access.withdraw("9032489848", 3000, "1111");
        assertEquals(7000, access.checkBalance("9032489848", "1111"));
    }

    @Test
    public void testThatTranferOf_3k_FromAccountOf_5k_senderBalanceIs_2k_receiverBalanceIs_3k() {
        setUp();
        access.deposit("9032489848", 5000);
        access.transfer("9032489848", "7032489848", 3000, "1111");
        assertEquals(3000, access.checkBalance("7032489848", "2222"));
        assertEquals(2000, access.checkBalance("9032489848", "1111"));

    }

    @Test
    public void testThatCustomerAccountCanBeClosed(){
        setUp();
        access.addCustomer("musa", "08033099848","3333");
        assertEquals(3, access.checkNumberOfAccountInBank());
        access.closeAccount("8033099848","3333");
        assertEquals(2, access.checkNumberOfAccountInBank());
    }


    @Test
    public void testThatCustomerCanChangeAccountPin(){
        access.addCustomer("musa", "08033099848","3333");
        access.changePin("8033099848","3333", "2222");
        assertEquals(0, access.checkBalance("8033099848", "2222"));
    }
}
