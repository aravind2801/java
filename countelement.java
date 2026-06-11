    import java.util.Scanner;

public class countelement {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a[]=new int [n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
      count(a,n);
    }
    static void count(int a[],int n){
        int c=0,c1=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                c++;
            }else{ c1++;}
        }
        System.out.println("Even_count="+c);
        System.out.println("Odd_count="+c1);
    }
}


