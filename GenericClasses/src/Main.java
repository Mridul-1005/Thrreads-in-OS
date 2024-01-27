public class Main {
    public static void main(String[] args) {
       MyGenericClass<Integer>myInt=new MyGenericClass<>(1);
       MyGenericClass<Double>myDouble=new MyGenericClass<>(5.34);

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
    }
}