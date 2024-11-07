package com.gmail.axelwerimport java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Util {
    // Функція для видалення всіх входжень заданого числа з масиву
    public static int[] removeAllOccurrences(int[] array, int number) {
        List<Integer> resultList = new ArrayList<>();

        // Проходимо по масиву та додаємо всі елементи, що не дорівнюють заданому числу
        for (int num : array) {
            if (num != number) {
                resultList.add(num);
            }
        }

        // Перетворюємо результат в масив
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
