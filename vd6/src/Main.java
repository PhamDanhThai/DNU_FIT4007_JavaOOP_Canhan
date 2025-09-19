import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = scanner.nextInt();

        int lastDigit = Math.abs(n % 10);

        System.out.println("Chữ số cuối cùng của số " + n + " là: " + lastDigit);

        scanner.close();
    }
}
