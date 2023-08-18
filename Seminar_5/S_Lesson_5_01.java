import java.util.*;

    class Student{
        String Titles;
        Integer ClassRoom;
        Student(String title, Integer classroom){
            Titles = title;
            ClassRoom = classroom;
        }
    }
    class Teachers{
        String Name;
        Teachers(String name){
            Name = name;
        }
    }  
    public class S_Lesson_5_01 {
        public static Student AddStudent() {
            Scanner title = new Scanner(System.in);
            System.out.println(" Введите имя ученика: ");
            String name = title.nextLine();

            Scanner classroom = new Scanner(System.in);
            System.out.println(" Введите номер класса: ");
            Integer c = classroom.nextInt();  

            Student temp = new Student(name, c);
            title.close();
            classroom.close();
            return temp;
        }  
        public static void main(String[] args){
            Map<Teachers,LinkedList<Student>> school = new HashMap<>();
            LinkedList<Student> students1 = new LinkedList<Student>();
            students1.add(AddStudent());
            school.put(new Teachers("Marina Petrovna"), students1);

            for(Map.Entry<Teachers, LinkedList<Student>> item : school.entrySet()){
                for(Student x : item.getValue()){
                    System.out.printf("Key = %s, Valuse = %s, Class = %s.", item.getKey().Name, x.Titles, x.ClassRoom);
            }
        }
    }
}     


