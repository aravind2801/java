import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       int a[]=new int [n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       bubble_as(a,n);
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
       System.out.println();
       bubble_ds(a,n);
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
    }
    static void bubble_as(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    static void bubble_ds(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
}
