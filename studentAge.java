import java.util.Scanner;

public class studentAge {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>18){
                System.out.println("The student with the age "+arr[i]+" can vote.");
            }
            else{
                System.out.println("The student with the age "+arr[i]+" cannot vote.");
            }
        }
        
    }
}
