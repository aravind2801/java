 class parent {
    void method3(){
        System.out.println("Parent");
    }
}
class child1 extends parent{
void method1(){
    System.out.print("Child1");
}
}
class child2 extends parent{
void method2(){
    System.out.print("Child2");
}
}
public class hirarchical{
    public static void main(String arg[]){
        child2 s=new child2();
        s.method2();
        s.method3();
        child1 ss=new child1();
        ss.method1();
        ss.method3();
    }
}
