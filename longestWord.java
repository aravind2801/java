import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),res="";int index=0;
        String a[]=new String[s.length()/2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                res+=s.charAt(i);
            }else{
            a[index++]=res;
            res="";
        }
    }
    a[index++]=res;
    String min=a[0],max=a[0];
    for(int i=1;i<index;i++){
        if(max.length()<a[i].length()){
            max=a[i];
        }if(min.length()>a[i].length()){
            min=a[i];
        }
    }
    System.out.println("Longest Substring:"+max);
     System.out.println("Shortest Substring:"+min);
    }
}
