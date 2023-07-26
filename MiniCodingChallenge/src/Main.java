import java.util.*;

public class Main {
    public static void main(String[] args) {

        Business b = new Business(2, "Darius", 200, 10000, 5000);
        Current c = new Current(1, "Tanvi", 10000, 15);
        Saver a = new Saver(3, "Stephen", 60000, 4);
        Business d = new Business(5, "Shiyan", 10000, 1, 15000);

        HashSet<BankAccount> accountsS = new HashSet<>(4);
        accountsS.add(a);
        accountsS.add(b);
        accountsS.add(c);
        accountsS.add(d);

        Iterator<BankAccount> iter = accountsS.iterator();
         while(iter.hasNext()) {
             BankAccount aux = iter.next();
             System.out.println(aux);
             System.out.println(aux instanceof BankAccount);
         }
         c.withdraw(8000);

         }
    }
