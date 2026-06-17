import java.util.Scanner;
public class studrank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int stud=sc.nextInt();
        int sub=sc.nextInt();
        int m[]=new int[sub];
        String n[]=new String[stud];
        for(int i=0;i<stud;i++){
            System.out.printf("Enter the Marks for student%d :",i+1);
            int sum=0;
            for(int j=0;j<sub;j++){
                    sum+=sc.nextInt();
            }
            m[i]=sum;
        }
        for(int i=0;i<stud;i++){
            System.out.printf("Enter the names for student%d :",i+1);
            n[i] = sc.next();
        }
        for(int i=0;i<stud-1;i++){
            for(int j=0;j<stud-1-i;j++){
                if(m[j]<m[j+1]){
                    int t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                    String temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(int i=0;i<stud;i++){
            System.out.printf("Rank"+(i+1)+"---> "+m[i]+"-"+n[i]);
            System.out.println();
        }
    }
}
