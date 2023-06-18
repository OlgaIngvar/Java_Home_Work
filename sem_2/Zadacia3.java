/*Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.*/

import java.util.Scanner;;

public class Zadacia3 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
            for (int i = 0; i < n; i++)
                {
                    System.out.println("Введите число. Пусть: 2 из них будут из двух цифр, и хотя бы одни со знаком минус : ");
                    arr[i] = scanner.nextInt(); 
                }
        
            for (int i = 0; i < n; i++) {
                if(arr[i] / 100 == 0 ) {
                    count = count + i;
                }
            }
            System.out.println("Сумма индексов двузначных элементов массива = " + count);

            System.out.println("До изменения: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            } 
            System.out.println();
            System.out.println("После изменения: ");
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    arr[i] = count;
                }
            System.out.print(arr[i] + " ");
            } 
    }
}


