import java.lang.Math;


public class Gravitational {
    public static void main(String[] args) {
        
        double M = (double) 1.99* Math.pow(10, 30);

        double m = (double) 6*Math.pow(10, 24);

        double G = (double) 6.67* Math.pow(10, -11);
        
        double d= (double) 1.49* Math.pow(10, 11);
        
        double Gravitational=(G*M*m)/(d*d);
        System.out.println("The Gravitational force between earth and the sun is:" +Gravitational);
        
    }
}
