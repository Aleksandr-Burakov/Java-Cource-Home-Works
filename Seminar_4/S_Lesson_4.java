// дабовление по указанному индексу, по очереди через символ ' ~ ' тильда элементы в Лист 
// Например: Запустите программу, введите: text1~0 --> Результат --> [text1]
// введите: text2~1 --> Результат --> [text1, text2] и так далее.



import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class S_Lesson_4 {
    public static void main(){
        LinkedList<String> textList = new LinkedList<>();
        Scanner textIn = new Scanner(System.in);
       while (true){
        String text = textIn.nextLine();
        String[] textSplit = text.split("~");
        Integer num = Integer.parseInt(textSplit[1]);
        if (textSplit[0].equals("print")){
            System.out.println(textList.get(num));
            textList.remove(textList.get(num));
        } 
        else if (textSplit[0].equals("0")){
            break;
        }
        else {
            Collections.sort(textList);
            textList.add(num, textSplit[0]);
            System.out.println(textList);
        }
    }
       textIn.close();
    } 
}
