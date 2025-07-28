import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int wid=sc.nextInt();
        int Peri=2*(len+wid);
        System.out.println(Peri);
    }
}
