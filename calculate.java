import java.util.Scanner;

public class calculate {
    public static double calculateSI(double principle, double rate, double time){
        return (principle*rate*time)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        double intrest= calculateSI(principle, rate, time);

        System.out.println("The Simple Interest is "+intrest+" for Principal "+principle+" Rate of Interest "+rate+" and Time "+time);
    }
}
