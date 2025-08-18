import java.util.Scanner;

public class RemainderAndQuotient {
    public static int[] findRemainderAndQuotient(int n1, int n2){
        int rem=n1%n2;
        int quo=n1/n2;
        return new int[]{rem,quo};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();

        int[] result=findRemainderAndQuotient(n1, n2);

        System.out.println("Remainder "+result[0]);
        System.out.println("Quotient "+result[1]);
    }
}
