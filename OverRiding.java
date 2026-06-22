public class OverRiding{
    public static void main(String[] args) {
    int a=300,b=20;
    B s=new B();
    System.out.println(s.sum(a,b));
    }
}
class A{
 int sum(int a,int b){
    return a+b;
 }
}
class B extends A{
 int sum(int a,int b){
    return a-b;
    }
}
