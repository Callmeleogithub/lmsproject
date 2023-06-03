import java.util.Scanner;
public class InchToCm {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length in Inch:");
        double heightIn=scanner.nextDouble();
        double heightCm=heightIn*2.54;
        System.out.println("The required height in cm is:"+heightCm);
        scanner.close();
    }
}
