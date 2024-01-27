public class Main {
    public static void main(String[] args) {
        MyGenericClass myInt=new MyGenericClass(1);
        MyGenericClass myDouble=new MyGenericClass(3.14);
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());

    }
}