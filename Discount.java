import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int dis=sc.nextInt();

        int discount=(fee*dis)/100;
        int finalFee=fee-discount;
        System.out.println("The discount amount is INR "+discount+"and final discounted fee is INR "+finalFee);
    }
    
}
