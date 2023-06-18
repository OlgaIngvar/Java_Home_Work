/*Дана последовательность N целых чисел. Найти сумму простых чисел.*/

import java.util.Scanner;
public class Zadacia1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, sum=0;
        int count = 0;
        int counter = 0;
        System.out.println("Введите простые числа, которые нужно сложить");
        a = scanner.nextInt();

        for(int i = 2; counter < a; i++)
        {
            count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count== 2 )
            {
                sum= sum + i;
                counter++;
            } 
        }
        System.out.print(sum + " ");
    }
}

