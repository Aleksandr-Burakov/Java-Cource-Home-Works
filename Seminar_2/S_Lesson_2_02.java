import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class S_Lesson_2_02 {

    public static void WriteFile (String action){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Client.txt",false))){
            bw.write(action);                     
        }       
        catch(IOException ex){
            System.out.println(" Error ");
        }
    }
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите start, если хотите что-либо записать");
        boolean flag = false;
        while (true){
            String action = in.nextLine();
            if (Objects.equals(action,"start") || flag){
                flag = true;
                WriteFile(action);
                continue;
            }
        in.close();
        }        
    }
}
