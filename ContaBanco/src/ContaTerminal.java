import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Hello, welcome to the digital bank");
        System.out.println("==================================");

        System.out.println("Please, input your agency number!");
        int agencyNumber = new Scanner(System.in).nextInt();

        System.out.println("Now, input you account number!");
        String accountNumber = new Scanner(System.in).nextLine();

        System.out.println("We are already finishing, input your name!");
        String name = new Scanner(System.in).nextLine();

        System.out.println("And finally, input you initial balance!");
        double initialBalance = new Scanner(System.in).nextDouble();

        System.out.println("Hello " + name + ", thank you to create a new account in our bank, your agency is " + agencyNumber + ", account number" + accountNumber + " and your balance " + initialBalance + " is now available for withdrawal ");

    }
}