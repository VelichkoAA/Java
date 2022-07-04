import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String Login = str.nextLine();
        Scanner slr = new Scanner(System.in);
        int password = slr.nextInt();
        System.out.println(Login);
        System.out.println(password);
        if ((Login.equals("Alex") ) & (password == 2865137))
            System.out.println("You have been recognized. Welcome.");
        else System.out.println("Username and password not recognized. Access is denied.");
    }
}