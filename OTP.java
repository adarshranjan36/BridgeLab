public class OTP {
    public static int otpGenerate(){
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean isUnique(int[] otps){
        for(int i=0;i<otps.length;i++){
            if(otps[i]!=otps[0]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] otpList=new int[10];
        for(int i=0;i<10;i++){
            otpList[i]=otpGenerate();
            System.out.println(otpList[i]);
        }
        if(isUnique(otpList)){
            System.out.println("OTPs are Unique");
        }
        else{
            System.out.println("Not Unique");
        }
    }
}
