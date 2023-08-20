import java.util.*;
    public class S_Lesson_6_00 {
        class Main {
        // Метод сортировки
            public static <K, V> Map<K, V> sortByKeys (Map<K, V> unsortedMap)
            {
            return new TreeMap<>(unsortedMap);
            }

            public static void main(String[] args){

            Map<Integer, String> country = new HashMap<>();
    
            country.put(2, "New Delhi");
            country.put(5, "New York");
            country.put(10, "Washington D.C.");
            country.put(4, "Tokyo");
            country.put(1, "Beijing");

            System.out.println(country);
            country = sortByKeys(country);
            System.out.println(country);

        } 
    }
}