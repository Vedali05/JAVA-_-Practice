public class method2 {
    static void m1(){
        System.out.println("m1()");
    }
    static int m2(int a){
        System.out.println("m2()");
        return a;
    }

    public static void main(String[] args){
        m1();
        m2(20);
    }
}
