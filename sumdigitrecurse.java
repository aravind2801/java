import java.util.Scanner;

public class sumdigitrecurse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        System.out.print(digit(n,sum));
    }
    static int digit(int n,int sum){
        if(n==0){
            return 0;
        }
        return sum+digit(n/10,sum);
    }
}
