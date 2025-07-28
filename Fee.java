public class Fee {
    public static void main(String[] args) {
        int fees = 125000;
        int disPer = 10;
        int dis = (fees * disPer) / 100;

        int finalFee = fees - dis;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + finalFee);

    }

}
