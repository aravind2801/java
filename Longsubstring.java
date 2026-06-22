import java.util.HashSet;
import java.util.*;

public class Longsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
    HashSet<Character> set=new HashSet<>();
        int max=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l));l++;
            }
            set.add(c);
            max=Math.max(max,i-l+1);
        }
        System.out.print(max);

    }
}
