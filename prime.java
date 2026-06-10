import java.util.Scanner;
public class prime {
 public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=2;i<n;i++){
        if(n%i==0){
            System.out.print("Not a Prime Number");
            return;
        }
    }
    System.out.print("Prime Number");
 }
}