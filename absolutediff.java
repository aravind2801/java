import java.util.*;
public class absolutediff {
    
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       int a[]=new int [n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       linear(n,a,k);
    }
    static void linear(int n,int a[],int k){
        for(int i=0;i<n;i++){
            if(a[i]==k){
                System.out.print(i);
                return;
            }

        }
        System.out.println("not found");
    }
}
