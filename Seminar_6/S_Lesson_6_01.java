
import java.util.*;
import java.util.HashMap;
import java.util.Map;

     public class S_Lesson_6_01 {
        public static <K, V> Map<K, V> sortByKeys (Map<K, V> unsortedMap)
        {
            return new TreeMap<>(unsortedMap);
        }

        public static void main(String[] args){
       
          Map<Integer, String> Subscribers = new HashMap<Integer, String>();
            Subscribers.put(74456, "Ivanov Ivan Ivanovich");
            Subscribers.put(5245, "Ezaf Fit Bridg");
            Subscribers.put(4134, "Keyn Ostin Flaur");

            Subscribers = sortByKeys(Subscribers);
            for(Map.Entry<Integer, String > item : Subscribers.entrySet()){    
                System.out.printf(" \n << ID Phone: %s, Name: %s. >> \n ", item.getKey(), item.getValue()); 
              
        }
    }
}

