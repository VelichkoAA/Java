/*Дан массив b (n) . Переписать в массив C(n) корни квадратные из поло-
жительных элементов массива b(n) (со сжатием., без пустых элементов внутри) За-
тем упорядочить методом «выбора и перестановки»по возрастанию новый массив.*/
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the array size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] a = new double[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)(Math.random() * 31) - 15);
        }
        System.out.println("Array before: ");
        System.out.println(Arrays.toString(a));
        // Перенос положительных чисел в другой массив
        int counter = 0;
        double[] arrEnd = new double[a.length];
        for (int i = 0; i < arrEnd.length; i++) {
            if (a[i] > 0) {
                arrEnd[counter] = Math.sqrt(a[i]); //извлечение корня
                counter++;
            }
        }
        // Сжатие массива
        arrEnd = Arrays.copyOf(arrEnd, counter);
        // Сортировка
        for (int left = 0; left < arrEnd.length; left++) {
            int minInd = left;
            for (int i = left; i < arrEnd.length; i++) {
                if (arrEnd[i] < arrEnd[minInd]) {
                    minInd = i;
                }
            }
            swap(arrEnd, left, minInd);
        }
        System.out.println("Array after: ");
        System.out.println(Arrays.toString(arrEnd));
    }

    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}