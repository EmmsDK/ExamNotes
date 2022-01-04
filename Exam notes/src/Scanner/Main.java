package Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);           // Create Scanner object

        System.out.println("Enter Username: ");

        String userName = myObj.nextLine();               // Read user input
        System.out.println("Username is: " + userName);   // Output user input
    }
}
