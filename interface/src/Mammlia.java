public class MammalInt implements Animal{
public void eat(){
    System.out.println("Mammal Eats");
}
public void travel(){
    System.out.println("Mammal Travels");
}
public int numberOfLegs(){
    return 0;
}

    public static void main(String[] args) {
        MammalInt m=new MammalInt();
        m.eat();
        m.travel();
    }
}
