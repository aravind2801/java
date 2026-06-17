
import java.util.Scanner;
class practice {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String pass=sc.nextLine();int c1=0,c2=0,c3=0,c4=0;
       if(pass.length()>=8){
          for(int i=0;i<pass.length();i++){
            char c=pass.charAt(i);
            if(c>='a'&&c<='z') c1++;
            else if(c>='A'&&c<='Z') c2++;
            else if(c>='0'&&c<='9') c3++;
            else
                c4++;
          }
          if(c1==0||c2==0||c3==0||c4==0){
            
          if(c1==0){
            System.out.println("Not Valid.");
            System.out.println("The Password Must Contains LowerCase Letters.");return;
          }if(c2==0){
            System.out.println("Not Valid.");
            System.out.println("The Password Must Contains UpperCase Letters.");return;
          }if(c3==0){
            System.out.println("Not Valid.");
            System.out.println("The Password Must Contains  Numerical Numbers.");;return;
          }if(c4==0){
            System.out.println("Not Valid.");
            System.out.println("The Password Must Contains any Special Characters.");;return;
          }
        }else{
            System.out.println("Strong Password Accepted.");
          }
       }
       else{
        System.out.println("Not Valid Password. ");
        System.out.println("Password Must Contain Minimum 8 character:");
       }
    }

}