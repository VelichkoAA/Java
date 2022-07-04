import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N = 0;
        Scanner str = new Scanner(System.in);
        String param = str.nextLine();
        while (param != ""){
            param = str.nextLine();
            N++;
        }
        if (N > 0) System.out.println("You entered" + "\t" + N + "\tparameters");

        else  System.out.println("You didn't pass parameters");
    }
}