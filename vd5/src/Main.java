import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên tính đến năm 2025: ");
        int age = scanner.nextInt();

        int birthYear = 2025 - age;

        System.out.println("Năm sinh của sinh viên là: " + birthYear);

        scanner.close();
    }
}
