import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        // Kiểm tra tính hợp lệ của tam giác
        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;
            double s = perimeter / 2; // nửa chu vi

            // Công thức Heron tính diện tích
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Chu vi tam giác: " + perimeter);
            System.out.println("Diện tích tam giác: " + area);
        } else {
            System.out.println("Ba cạnh không tạo thành một tam giác hợp lệ.");
        }

        scanner.close();
    }
}
