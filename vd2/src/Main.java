import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Chu vi hình tròn: " + circumference);
        System.out.println("Diện tích hình tròn: " + area);

        scanner.close();
    }
}
