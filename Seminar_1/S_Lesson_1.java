import java.util.Random;
import java.util.Scanner;

public class S_Lesson_1 {
     public static void main (){
        Scanner in = new Scanner (System.in);
        int countNum = 3;
        Random random = new Random();
        Integer num = random.nextInt(1, 10);
        System.out.println("Игра, угадай число.");
        System.out.println("У Вас " + countNum + " попытки! " );
        System.out.println(+ num + " Введите число: ");    
        for (int i = 1; i <= countNum; i++) {          
            Integer number = in.nextInt();            
            if(number == num){
                System.out.println(" Ура!!! Вы угадали у вас осталось: < " + (countNum - i) + " > попытка !!! Загаданное число: < " + num +" >");
                break;
            } 
            else {                                          
                System.out.println(" Вы не угадали, у вас осталось: " + (countNum - i) + " попыток ");
            }
                   
        } 
        in.close();       
    }   
}
