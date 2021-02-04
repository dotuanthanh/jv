import java.util.Scanner;

public class tinhDienTich {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = height * width;
        System.out.println("area"+area);
    }
}
