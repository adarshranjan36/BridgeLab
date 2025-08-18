import java.util.Scanner;

public class Check {
    public static int checkPos(int n){
        if(n==0) return 0;
        else if(n<0) return -1;
        else return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int PosNeg=checkPos(n);
        System.out.println(PosNeg);
    }
}
