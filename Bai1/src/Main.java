import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên a
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        // Nhập số nguyên b
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        // Tính toán
        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        // In kết quả
        System.out.println("Tổng a + b = " + sum);
        System.out.println("Hiệu a - b = " + difference);
        System.out.println("Tích a * b = " + product);

        // Kiểm tra b khác 0 để tránh lỗi chia cho 0
        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Thương a / b = " + quotient);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        scanner.close();
    }
}
