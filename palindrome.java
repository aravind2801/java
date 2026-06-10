
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,num=n;
        while(n>0){
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==num){
            System.out.print("Palindrome");
        }else{
            System.out.print("not a Palindrome");
        }
    }
}
