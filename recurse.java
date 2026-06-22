import java.util.Scanner;

public class recurse {
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    print1(n);

}
static void print1(int n){
    if(n==0) return;
    System.out.print(n+" ");
    print2(n-1);
}
static void print2(int n){
    if(n==0) return;
    System.out.print(n+" ");
    print1(n-1);
    
}
}
