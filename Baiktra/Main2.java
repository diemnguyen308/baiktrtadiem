package Baiktra;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kythuat kt1 = new Kythuat("BN1234","Diệm","30/08/2000","Gia Bình, Bắc Ninh","Engineer");
        Kythuat kt2 = new Kythuat("BN4567");
        System.out.print("Nhập họ và tên:");
        kt2.setName(scanner.nextLine());
        System.out.print("Nhập ngày tháng năm sinh dd/mm/yyyy:");
        kt2.setDob(scanner.nextLine());
        System.out.print("Nhập địa chỉ:");
        kt2.setAddress(scanner.nextLine());
        System.out.print("Nhập chuyên ngành:");
        kt2.setMajor(scanner.nextLine());
        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
    }
}
