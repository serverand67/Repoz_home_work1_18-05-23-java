// ДЗ 2 семинар от 18.05.23
// 2. n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class Task2Factorial {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.print("Введите число ");
            int number = iScanner.nextInt();
            iScanner.close();
            int factorial = 1;
            for(int i = 1; i <= number; i++){
                factorial *= i;
            }
        System.out.println("Факториалом числа " + number + " являестся " + factorial);         
    }
}

