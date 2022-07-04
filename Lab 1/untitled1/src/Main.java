

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String name = str.nextLine();

        if (name != "") {
            System.out.println("\tHello, "+ name + "!");
        }
        else {
            System.out.println("\tHello, World!");
        }
    }
}