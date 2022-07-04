/*Дан двумерный массив A, размером (nn)(или квадратная матрица A).
Найти сумму и количество положительных элементов параллели побочной диагона-
ли, расположенной под диагональю ( ниже побочной диагонали). Затем каждый эле-
мент побочной диагонали умножить на количество.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k, sum;
        k = 0;
        sum = 0;
        int[][] mas = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = ((int)(Math.random() * 31));
            }
        }
        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; j++) {
                if(i + j == n) {
                    if (mas[i][j] > 0) {
                        k++;
                        sum = sum + mas[i][j];
                    }
                }
            }
        }
        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Umnajaem elements pobochnoi na k");
        for(int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i + j + 1 == n) {
                    mas[i][j] = mas[i][j] * k;
                }
            }
        }
        System.out.println("New array");
        System.out.println(sum + "\n" + k);
        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}