/*Дан одномерный массив а(n), в котором находится единственный нуле-
вой элемент. Найти где он находится и вычислить сумму последующих за ним эле-
ментов. Выдать на экран номер элемента и сумму.*/
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int[] a;
         int n, nul, k;
         nul = 0;
         k = 0;
         Scanner in = new Scanner(System.in);
         System.out.print("Enter numbers of array:");
         n = in.nextInt();
         a = new int [n];
         for (int i = 0; i < n; i++){
             System.out.print("Enter a[" + i + "] = ");
             a[i] = in.nextInt();
             if (a[i] == 0){
                 nul = i;
                 System.out.println("Zero element =" + nul);

             }
         }
        for (int i = a.length - 1; i >= nul; i-=1) {
            k = k + a[i];
            System.out.println(a[i]);
        }
    System.out.println("Sum of elements:" + k);
    }
}