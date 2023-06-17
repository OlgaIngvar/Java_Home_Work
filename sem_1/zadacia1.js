/*Дана последовательность целых чисел, оканчивающаяся нулем. 
Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class Zadacia1 {
    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
 
        return list.toArray(new Integer[0]);
    }
 
    public static void main(String[] args)
    {
        int count = 0;
        Integer[] nums = {20, -30, 40, -40};
        Integer[] newList = {};
        
        for (int i = 1; i < nums.length; i++) 
        {
            if ((nums[i] < 0) && (nums[i-1] > 0)); 
            {
                newList.append(nums[i-1]);
            }
        };
        
        for (int i = 0; i < newList.length; i++) 
        {
            int sum = 0;
            sum +=  newList[i];
            System.out.print(sum);
        };
    }
}