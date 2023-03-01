package Bai3;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập văn bản: ");
        String input = scanner.nextLine();


        VanBan vanBan = new VanBan(input);
        int countWords = vanBan.countWords(input);
        String standardInput = vanBan.standard(input);
        String upperCaseInput = vanBan.upperCase(input);
        String lowerCaseInput = vanBan.lowerCase(input);
        String upperFirstCharInput = vanBan.upperFirstChar(input);


        System.out.println("Số từ trong văn bản: " + countWords);
        System.out.println("Văn bản chuẩn hóa: " + standardInput);
        System.out.println("Văn bản in hoa: " + upperCaseInput);
        System.out.println("Văn bản in thường: " + lowerCaseInput);
        System.out.println("Văn bản viết hoa chữ cái đầu tiên: " + upperFirstCharInput);
        System.out.println(vanBan.toString());
    }
}
