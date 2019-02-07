package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 through 4: ");
        String input = sc.nextLine();
        int number = Integer.parseInt(input);

        switch (number) {
            case 1:
            System.out.println("The number 1 is uno in Italian ");
            break;
            case 2:
                System.out.println("The number 2 is due in Italian ");
                        break;
            case 3:
                System.out.println("The number 3 is tre in Italian");
                        break;
            case 4:
                System.out.println("The number 4 is quattro in Italian");
                        break;
            default:
                System.out.println("No more numbers");

        }
    }
}
