// Q: Create a BankAccount class with accountNo and balance. 
//    Demonstrate that instance members are unique for each object and static members are shared.

public class Problem_61 {
    public static void main(String[] args) {
        // Creating first account
        BankAccount acc1 = new BankAccount();
        acc1.accountNo = 101;
        acc1.balance = 5000;

        // Creating second account
        BankAccount acc2 = new BankAccount();
        acc2.accountNo = 102;
        acc2.balance = 8000;

        // Static member (shared)
        BankAccount.bankName = "HDFC Bank";

        // Displaying details
        acc1.display();
        acc2.display();

        // Changing static member
        BankAccount.bankName = "SBI Bank";

        System.out.println("\nAfter changing bank name:");
        acc1.display();
        acc2.display();
    }
}

class BankAccount {
    int accountNo;       // Instance member (unique per object)
    int balance;         // Instance member (unique per object)
    static String bankName; // Static member (shared among all objects)

    void display() {
        System.out.println("Account No: " + accountNo + 
                           ", Balance: " + balance + 
                           ", Bank Name: " + bankName);
    }
}
