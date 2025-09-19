import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chu vi hình chữ nhật: " + perimeter);
        System.out.println("Diện tích hình chữ nhật: " + area);

        scanner.close();
    }
}
