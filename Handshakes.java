import java.util.Scanner;

public class Handshakes {
    public static int possible(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int combination=possible(n);
        System.out.println(combination);
    }
}
