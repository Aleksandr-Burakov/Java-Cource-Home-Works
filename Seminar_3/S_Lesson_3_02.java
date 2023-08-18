//  import java.util.ArrayList;
// class People{
//     String Name;
//     Integer Age;
//     }
// public class S_Lesson_3_1 {
//     public static void main (){
//         People p1 = new People();
//         p1.Name = "Vlad";
//         p1.Age = 30;
//         People p2 = new People(); 
//         p2.Name = "Vasiliy";
//         p2.Age = 45;
//         ArrayList<People> people = new ArrayList<People>();
//         people.add(p1);
//         people.add(p2);
//         // System.out.println(people);
//         for(People p : people){
//             System.out.println("Hello, " + p.Name + " Возраст: " + p.Age);
//         }
//     }
// }    


// Или можно немного упростить код
     

import java.util.ArrayList;
class People{
    String Name;
    Integer Age;
    // People(String name, Integer age ){
    //     Name = name;
    //     Age = age;
     People(String Name, Integer Age ){
        this.Name = Name;
        this.Age = Age;
    }
    }
public class S_Lesson_3_02 {
    public static void main (){
        People p1 = new People("Vlad", 30);
        People p2 = new People("Vasiliy", 45); 
        ArrayList<People> people = new ArrayList<People>();
        people.add(p1);
        people.add(p2);
        // System.out.println(people);
        for(People p : people){
            System.out.println("Hello, " + p.Name + " Возраст: " + p.Age);
        }
    }
}    