import java.util.ArrayList;


public class S_Lesson_3_01 {    
    public static void main (){ 
    ArrayList<String> people = new ArrayList<String>();
    people.add("Vlad");
    people.add("Ivan");
    people.add(1,"Vasiliy");
    people.set(2,"Valeriy");
    System.out.println(people);
    people.remove(0);
    people.remove("Valeriy");
    System.out.println(people);
    // for(String name : people){
    //     System.out.println(" Hello " + name);
    System.out.println(people.size());
    if (people.contains("Vladg")){
        System.out.println(" Hello ");
        }
    else{
       System.out.println(" Нет такого имени в данном листе ");
        }
    }
}
    

