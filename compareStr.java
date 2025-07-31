import java.util.Scanner;

public class compareStr {
    public static boolean compareStrings(String str1, String str2){
        if(str1.length()!=str2.length()) return false;

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean result=compareStrings(str1, str2);
        //boolean equals = str1.equals(str2);
        if(result){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
