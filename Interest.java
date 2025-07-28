import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Principal=sc.nextInt();
        int Rate=sc.nextInt();
        int Time=sc.nextInt();

        int SI=(Principal * Rate * Time) / 100;
        System.out.println(SI);
    }
}
