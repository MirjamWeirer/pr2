package einheit1;

import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account("Mirjam","AT55-3454-9000-0000-4000","BXYT5565");
        Account account2 = new Account("Jasmin", "AT55-4545-7797-0000-3453", "BXYT3453");
        Account account3 = new Account("Martin","AT55-7797-8999-0000-4564", "BXYT5678");

        /*ArrayList<Account> myAccountList = new ArrayList<>();
        myAccountList.add(account1);
        myAccountList.add(account2);
        myAccountList.add(account3);
        */
        Account accounts[] = new Account[3];
        accounts[0]=account1;
        accounts[1]=account2;
        accounts[2]=account3;
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }
        account1.add(500.50);
        account2.add(1000);
        account3.add(300);
        account2.deposit(300);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getBalance());
        }


    }
}
