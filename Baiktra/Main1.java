package Baiktra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Nhap ban kinh: ");
            radius = in.nextDouble();
            if (radius < 0){
                throw new RuntimeException("Error");
            }
            System.out.println(new Circle(radius));
        }
        catch(NumberFormatException e){
            System.out.println("Nhap ban kinh khong hop le");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
