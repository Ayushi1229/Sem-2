package lab2;
import java.util.Scanner;
public class Lab2_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.println(area);
    }
}