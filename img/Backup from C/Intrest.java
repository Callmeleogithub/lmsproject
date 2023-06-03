import java.util.Scanner;
public class Intrest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Princial amount:");
        System.out.println("Enter the rate:");
        System.out.println("Enter the time:");
        float P= scanner.nextFloat();
        float R= scanner.nextFloat();
        float T= scanner.nextFloat();
        float interest=(P*T*R)/100;
        float amount=P+interest;
        System.out.println("The Simple Intrest calculated is:" +interest);
        System.out.println("The Total Amount calculated is:" +amount);
        scanner.close();
    }
}
