import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int fren=(n*9/5)+32;
        System.out.println(fren);
    }
}
