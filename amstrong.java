import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,num=n;
        while(n>0){
            int r=n%10;
            sum+=r*r*r;
            n=n/10;
        }
        if(sum==num){
            System.out.print("Amstrong Number");
        }else{
            System.out.print("Not a Amstrong Number");
        }
    }
}
