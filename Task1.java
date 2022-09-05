import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n для нахождения n-го треугольного числа: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int tn=0;
        // tn = (n + 1) * n / 2;        
        for (int i = 0; i <= n; i++) {
            tn+=i;
        }
        System.out.println(String.format("Треугольное число Т%d=%d",n,tn));
    }

}
