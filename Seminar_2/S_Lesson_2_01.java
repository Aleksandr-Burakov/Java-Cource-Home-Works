import java.io.*;
import java.util.ArrayList;

public class S_Lesson_2_01 {
    public static void WriteFile (ArrayList<String> words){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Note1.txt"))){
            bw.write("Hello World");
            for (String item : words) {
                bw.append("\n"); 
                bw.append(item);    
            }          
        }   
        catch (Exception ex){
            System.out.println(" Error ");
        }
    }
    // public static void ReadFile (){
    //     try(BufferedReader br = new BufferedReader(new FileReader("Note1.txt"))){
    //         // Считывание файла по символам
    //         // while((c = br.read())!= -1) - Эта конструкция означает считывать пока файл не окажется пустым
    //         int c;
    //         while((c = br.read())!= -1) {
    //             System.out.print((char)c);
    //         }
    //         // Считывание файла по строкам
    //         // while((a = br.readLine())!= null) - Эта конструкция означает считывать пока файл не окажется пустым
    //         String a;
    //         while((a = br.readLine())!= null) {
    //             System.out.println(a);
    //         }
    //     }
    //          catch (Exception ex){
    //         System.out.println(" Error ");
    //     }
        
    // }
    public static ArrayList<String> ReadFile(){
        ArrayList<String> words = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader("Note1.txt"))){
            // Считывание файла по строкам
            // while((a = br.readLine())!= null) - Эта конструкция означает считывать пока файл не окажется пустым
            String a;
            while((a = br.readLine())!= null) {
                words.add(a);
            }
        }
             catch (Exception ex){
            System.out.println(" Error ");
        }
        return words;
    }
    public static void main(){
        ArrayList<String> words = ReadFile();
        System.out.println(words);
        words.set(1,"Hello Sanich");
        System.out.println(words);
        words.remove(1);
        System.out.println(words);
        WriteFile(words);
    }
}       

        // Если сначала создавать пустой лист то нужно сделать следующеее:
        // ArrayList<String> words = new ArrayList<String>();
        // words = ReadFile();
        // System.out.println(words);
        
        
        // Чтобы считать и вывести какуюто строку по индексу (от 0) используем .get
        // например 2 строку введем индекс (1) < words.get(1) >, и получим вторую строку из файла Note1.txt
        // ArrayList<String> words = ReadFile();
        // System.out.println(words.get(1));


        // Чтобы заменить строку используем .set
        // например заменить 2 строку введем (1) индекс,"что сохранять"  < words.set(1,"Hello Sanich") >
        // ArrayList<String> words = ReadFile();
        // System.out.println(words.get(1));
        // words.set(1,"Hello Sanich");
        // System.out.println(words.get(1));
        
        // Чтобы удалить строку используем .remove
    //     // например удалить 2 строку введем (1) индекс,"что сохранять"  < words.set(1,"Hello Sanich") >
    //     ArrayList<String> words = ReadFile();
    //     System.out.println(words); // Вывод начального списка
    //     System.out.println(words.get(1)); // Вывод строки под индексом (1) "Hello old !"
    //     words.set(1,"Hello Sanich"); // Замена по индексу (1) "Hello old !" на "Hello Sanich"
    //     System.out.println(words); // Вывод изменённого списка
    //     words.remove(1); // Удаление по индексу (1) из списка "Hello Sanich"
    //     System.out.println(words); // Вывод изменённого списка
//     }
// }

