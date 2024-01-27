public class Laptop implements Comparable<Laptop> {
    String name;
    int ram;
    int price;
    public Laptop(String name,int ram,int price){
        super();
        this.name=name;
        this.ram=ram;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getRam(){
        return ram;
    }
    public int CompareTo(Laptop o1){
        if(this.ram>o.getRam())
            return 1;
        else
            return -1;
    }
}
