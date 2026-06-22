public class OverLoading {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        OverLoading ss=new OverLoading();
        System.out.println(ss.sum(10,10));
        System.out.println(ss.sum(10,10,10));
    }
}
