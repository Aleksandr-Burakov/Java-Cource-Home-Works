
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

//     import java.util.*;

//     class Phonebook{
//         String Name;
//         Phonebook(String name){
//             Name = name;
//         }
//     } 
//     class Subscriber{
//         String Country;
//         String SubscriberName;
//         Integer SubscriberPhone;
//         Integer SubscriberID;   
//         Subscriber(Integer subscriberID, String subscriberName,  Integer subscriberPhone, String country){
//             SubscriberID = subscriberID;
//             SubscriberName = subscriberName;
//             SubscriberPhone = subscriberPhone;
//             Country = country;      
//         }
//     }  
  

// public class S_Lesson_5_02 {

//         public static Subscriber AddSubscriber(){


//                     Scanner Country = new Scanner(System.in);
//                     System.out.println(" Введите ID абонента: ");
//                     Integer country = Country.nextInt();
        
                    
//                     Scanner Phone = new Scanner(System.in);
//                     System.out.println(" Введите телефон: ");
//                     Integer subscriberPhone = Phone.nextInt();  

//                     Scanner  ID = new Scanner(System.in);
//                     System.out.println(" Введите F.I.O : ");
//                     String subscriberID = ID.nextLine();

//                      Scanner  Name = new Scanner(System.in);
//                     System.out.println(" Введите Country : ");
//                     String subscriberName = Name.nextLine();


                    
        
//                     Subscriber temp = new Subscriber(country, subscriberID,  subscriberPhone,  subscriberName);
//                     Name.close();
//                     Country.close();
//                     ID.close();
//                     Phone.close();
                    
//                     return temp;
//         }
    
//         public static void main(){
//             Map<Integer, LinkedList<Phonebook>> Phonebook = new HashMap<Integer, LinkedList<Phonebook>>();
//             LinkedList<Phonebook> Phonebooks = new LinkedList<Phonebook>();
//             Phonebooks.add(new Phonebook("Yellow Pages"));
//             Map<Integer,LinkedList<Subscriber>> YellowPages = new HashMap<Integer, LinkedList<Subscriber>>();
//             LinkedList<Subscriber> Subscribers = new LinkedList<Subscriber>();
//             Subscribers.add(AddSubscriber());

//             // Subscribers.add(new Subscriber(1, "Ivanov Ivan Ivanovich", 123451, "Russia"));
//             // Subscribers.add(new Subscriber(2, "Ezaf Fit Bridg",134908, "Italy"));
//             // Subscribers.add(new Subscriber(3, "Keyn Ostin Flaur",779684, "Brasil"));
//             // Subscribers.add(new Subscriber(3, "Keyn Ostin Flaur",879684, "Brasil"));
//             Phonebook.put(1,Phonebooks);
//             YellowPages.put(1,Subscribers);

            

//             for(Map.Entry<Integer,LinkedList<Subscriber>> item : YellowPages.entrySet()){
//                 for(Subscriber itemSubscribers : item.getValue()){                  
//                     System.out.printf(" \n << ID Key: %s. Name: %s, Phone: %s, Country: %s. >>\n  ", 
//                     itemSubscribers.SubscriberID, 
//                     itemSubscribers.SubscriberName,
//                     itemSubscribers.SubscriberPhone,
//                     itemSubscribers.Country);     
//             }
//         }
//     }   
// }



