import java.util.Scanner;

public class Trigo {
    public static double[] calculateTrigo(double angle){
        double r=Math.toRadians(angle);

        double sine=Math.sin(r);
        double cosine=Math.cos(r);
        double tangent=Math.tan(r);

        return new double[] {sine,cosine,tangent};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();

        double[] result = calculateTrigo(angle);

        System.out.printf("Sine(%.2f°)   = %.4f\n", angle, result[0]);
        System.out.printf("Cosine(%.2f°)   = %.4f\n", angle, result[1]);
        System.out.printf("Tangent(%.2f°)   = %.4f\n", angle, result[2]);
    }
}
