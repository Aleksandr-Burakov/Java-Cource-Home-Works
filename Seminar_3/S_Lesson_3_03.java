import java.util.Scanner;

class Calculator {
            public int calculate(char op, int a, int b) {
                switch (op) {
                    case '+':
                        return add(a, b);
                    case '-':
                        return minus(a, b);
                    case '*':
                        return mult(a, b);
                    case '/':
                        return divide(a, b);
                    default:
                        throw new IllegalArgumentException("Некорректный оператор: " + op);
                }
            }       
            private int divide(int a, int b) {
                if (b != 0) return a / b;
                return -1;
            }  
            private int mult(int a, int b) {
                return a * b;
            }
            private int minus(int a, int b) {
                return a - b;
            }
            private int add(int a, int b) {
                return a + b;
            }
        public class S_Lesson_3_03 {
    public static void main(){
                
                // int a = 0;
                // char op = ' ';
                // int b = 0;
        
                // if (args.length == 0) {
                    Scanner books = new Scanner (System.in);
                    System.out.println("Введите 1 число");
                    int a = books.nextInt();
                    System.out.println("Введите Оператора");
                    char op = ' ';
                    op = '+';
                    System.out.println("Введите 2 число");
                    int b = books.nextInt();
                    books.close();
                    // a = 3;
                    // op = '+';
                    // b = 7;
                // } else {
                //     a = Integer.parseInt(args[0]);
                //     op = args[1].charAt(0);
                //     b = Integer.parseInt(args[2]);
                // }
        
                Calculator calculator = new Calculator();
                int result = calculator.calculate(op, a, b);
                System.out.println(result);
        }
    }
}    
