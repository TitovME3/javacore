package lesson4.HW4;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        String[] words = {"Лес", "Трава", "Путь", "Лес", "Круть", "Квартал", "Лес", "Адрес", "Класс",};

        Map<String, Integer> map = new HashMap<>();
        System.out.println("Считаем сколько раз встречается каждое слово :");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map + "'\n") ;

        System.out.println("Выписываем уникальные слова :");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
    }


}