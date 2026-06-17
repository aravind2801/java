import java.util.Scanner;
public class SearchBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       int k=sc.nextInt();
      int res=Binary.Binary_Search(n,a,k);
      if(res==-1)
      System.out.print("Element Not Found");
      else
       System.out.printf("Element Found At %d",res);
    }
}
