
import java.util.Scanner;
public class Task1Thiangle {
    public void triangleNumber(int num){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = iScanner.nextInt();
//        int n = 5;
        int result;
        result = n * (n+1) / 2;
        System.out.println("Триугольное число, числа " + n + " являестся " + result);
        iScanner.close();
    }
}
