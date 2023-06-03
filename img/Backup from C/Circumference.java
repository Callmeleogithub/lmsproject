import java.util.Scanner;
public class Circumference{
public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    final double PI=3.1415;
    System.out.println("Enter the radius of the circle:");
    double r=scanner.nextInt();
    double area = PI*r*r;
    double circum=2*PI*r;
    System.out.println("The area of the circle is:" +area);
    System.out.println("The circumference of the circle is:" +circum);
    scanner.close();
}
}
