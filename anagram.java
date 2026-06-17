import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String  s2=sc.nextLine();int flag=0;
       if(s1.length()==s2.length()){
       for(int i=0;i<s1.length();i++){
        for(int j=0;j<s1.length();j++){
             if(s1.charAt(i)==s2.charAt(j)){
                flag++;break;
             }
        }
       }
       if(flag==s1.length()){
        System.out.print("Pangram");
       }else{
        System.out.print("Not a Pangram");
       }
       }
    else{
    System.out.print("Not a Pangram");
}
    }
}
