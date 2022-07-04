/*Определить матрицу (двумерный массив) и ее заполнить случайными значени-
ями. Построить вектор В, которой возвращает – среднее арифметическое положительных элементов в каждом столбце
матрицы*/
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> vec = new ArrayList<>();
        int n=5;
        int k = 0;
        int sum=0;
        int arif = 0;
        int[][] mat= new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j=0; j<n; j++ ) {
                mat[i][j] = new Random().nextInt(20)-10;
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        for (int j=0; j<n; j++) {
            k = 0;
            arif = 0;
            sum=0;
            for (int i=0; i<n; i++) {
                if (mat[i][j]>0) {
                    k++;
                    sum+=mat[i][j];
                    arif = sum / k;
                }
            }
            vec.add(arif);
        }
        System.out.println();
        for (int i: vec) {
            System.out.print(i+"\t");
        }
    }
}