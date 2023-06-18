/*Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.*/

import java.util.Scanner;
public class Zadacia2 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                System.out.println("Введите число:");
                arr[i] = scanner.nextInt(); 
            }
        
            if (arr[0] == arr[1])
            {
                System.out.println("Нет последовательности");
                return;
            }
        boolean inCreases = arr[0] < arr[1];
            for (int i = 2; i < arr.length; i++)
            {
                if ((arr[i - 1] >= arr[i] && inCreases) ||
                        (arr[i - 1] <= arr[i] && !inCreases))
                {
                    System.out.println("Последовательности нет");
                    return;
                }
            }
        System.out.println(inCreases ? "Возрастает" : "Снижается");
    }
}


