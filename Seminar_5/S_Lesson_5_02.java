
    import java.util.*;

    class Phonebook{
        String Name;
        Phonebook(String name){
            Name = name;
        }
    } 
    class Subscriber{
        Integer SubscriberID;
        String SubscriberName;
        Integer SubscriberPhone;
        String Country;   
        Subscriber(Integer subscriberID, String subscriberName, Integer subscriberPhone, String country){
            SubscriberID = subscriberID;
            SubscriberName = subscriberName;
            SubscriberPhone = subscriberPhone;
            Country = country;      
        }
    }  
      
public class S_Lesson_5_02 {
        public static void main(){
            Map<Integer, LinkedList<Phonebook>> Phonebook = new HashMap<Integer, LinkedList<Phonebook>>();
            LinkedList<Phonebook> Phonebooks = new LinkedList<Phonebook>();
            Phonebooks.add(new Phonebook("Yellow Pages"));
            Map<Integer,LinkedList<Subscriber>> YellowPages = new HashMap<Integer, LinkedList<Subscriber>>();
            LinkedList<Subscriber> Subscribers = new LinkedList<Subscriber>();
            Subscribers.add(new Subscriber(1, "Ivanov Ivan Ivanovich", 123451, "Russia"));
            Subscribers.add(new Subscriber(2, "Ezaf Fit Bridg",134908, "Italy"));
            Subscribers.add(new Subscriber(3, "Keyn Ostin Flaur",879684, "Brasil"));
            Phonebook.put(1,Phonebooks);
            YellowPages.put(1,Subscribers);

            for(Map.Entry<Integer,LinkedList<Subscriber>> item : YellowPages.entrySet()){
                for(Subscriber itemSubscribers : item.getValue()){                  
                    System.out.printf(" \n << ID Key: %s. Name: %s, Phone: %s, Country: %s. >>\n  ", 
                    itemSubscribers.SubscriberID, 
                    itemSubscribers.SubscriberName,
                    itemSubscribers.SubscriberPhone,
                    itemSubscribers.Country);     
            }
        }
    }   
}

    //     }
    // }

