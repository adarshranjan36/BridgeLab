import java.util.Scanner;

public class Triangle {
    public static double rounds(double s1, double s2, double s3){
        double peri=s1+s2+s3;
        double dis=5000;
        return dis/peri;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();

        double round=rounds(s1, s2, s3);

        System.out.println(round);
    }
}
