import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        calc.setNum1(num1);

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        calc.setNum2(num2);

        scanner.nextLine(); 

        System.out.println("Введите название операции: SUM, MINUS, MULTIPLY");
        String op = scanner.nextLine();
        System.out.println(calc.getResult(op));
        scanner.close();
    }
}
