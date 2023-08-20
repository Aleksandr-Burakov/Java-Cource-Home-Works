import java.util.*;


    class Phonebook{
        String Name;
        Phonebook(String name){
            Name = name;
        }
    } 

    class Subscriber{
        Integer IDSubscriberPhone;
        String SubscriberName;
        Subscriber(Integer IDsubscriberPhone, String subscriberName){
            IDSubscriberPhone = IDsubscriberPhone;
            SubscriberName = subscriberName;          
        }
    }  

    class Subscriber2{
        Integer IDSubscriberPhone2;
        String SubscriberName2;          
        Subscriber2(Integer IDsubscriberPhone2, String subscriberName2){
            IDSubscriberPhone2 = IDsubscriberPhone2;
            SubscriberName2 = subscriberName2;      
        }

    public class S_Lessons_6_02 {

        public static void main(){

            Map<Integer, LinkedList<Phonebook>> Phonebook = new HashMap<Integer, LinkedList<Phonebook>>();
            LinkedList<Phonebook> Phonebooks = new LinkedList<Phonebook>();
            Phonebooks.add(new Phonebook("Yellow Pages"));
            Phonebooks.add(new Phonebook("New Horisons"));
            Phonebook.put(1,Phonebooks);
 
            Map<Integer,LinkedList<Subscriber>> YellowPages = new HashMap<Integer, LinkedList<Subscriber>>();
            LinkedList<Subscriber> Subscribers = new LinkedList<Subscriber>();
            Map<Integer,LinkedList<Subscriber2>> NewHorisons = new HashMap<Integer, LinkedList<Subscriber2>>();
            LinkedList<Subscriber2> Subscribers2 = new LinkedList<Subscriber2>();
            YellowPages.put(1,Subscribers);
            NewHorisons.put(1,Subscribers2);

            Subscribers.add(new Subscriber(1, "Ivanov Ivan Ivanovich"));
            Subscribers.add(new Subscriber(3, "Ezaf Fit Bridg"));
            Subscribers.add(new Subscriber(2, "Keyn Ostin Flaur"));

            for(Map.Entry<Integer,LinkedList<Subscriber>> item : YellowPages.entrySet()){
                for(Subscriber itemSubscribers : item.getValue()){               
                    System.out.printf(" \n << ID Phone: %s, Name: %s. >>\n ", 
                    itemSubscribers.IDSubscriberPhone,
                    itemSubscribers.SubscriberName);                                
                }
            }

            Subscribers2.add(new Subscriber2(1, "Ivanov Ivan Ivanovich"));
            Subscribers2.add(new Subscriber2(3, "Ezaf Fit Bridg"));
            Subscribers2.add(new Subscriber2(2, "Keyn Ostin Flaur"));
        
            for(Map.Entry<Integer,LinkedList<Subscriber2>> item2 : NewHorisons.entrySet()){
                for(Subscriber2 itemSubscribers2 : item2.getValue()){               
                    System.out.printf(" \n << ID Phone: %s, Name: %s. >>\n ", 
                    itemSubscribers2.IDSubscriberPhone2,
                    itemSubscribers2.SubscriberName2);
                                     
                }
            }
        }
    }
}

