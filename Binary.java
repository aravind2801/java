import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       int a[]=new int [n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       int k=sc.nextInt();
      int res=Binary_Search(n,a,k);
      if(res==-1)
      System.out.print("Element Not Found");
      else
       System.out.printf("Element Found At %d",res);
    }
    static int Binary_Search(int n,int a[],int k){
        int l=0;
        int r=n-1;
        while (l<=r) {
            int mid=(l+r)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    }

