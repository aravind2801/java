import java.util.*;
public class firstUnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap <Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.get(c)==1){
                System.out.print(c);return;
            }
        };
    }
}
