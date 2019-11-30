
package accountuser;

import java.util.Date;


public class AccountUser {

   
    public static void main(String[] args) {
        
        Date now;
        now = new Date();
        String nowString = now.toString();
        System.out.println(nowString);
        
        Account a = new Account("Singh");
        a.deposit(20000);
        a.withDraw(5000);
        System.out.println(a.getBalance());
        a.withDraw(5000);
        System.out.println(a.toString());
        a.getBalance();

        
        Account b = new Account("Harkanwal Singh");
        
        int n = Account.getNumberOfAccounts();
        System.out.println(n + "accounts created");
    }
    
}
