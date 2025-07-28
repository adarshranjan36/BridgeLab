import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        double total=h/2.54;
        int feet=(int)(total/12);
        double inch=total%12;

        System.out.println(" Your Height in cm is "+h+" while in feet is "+feet+" and inches is "+inch);
    }
}
