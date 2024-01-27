import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Laptop> laptopList=new ArrayList<>();
        laptopList.add(new Laptop("HCL",16,800));
        laptopList.add(new Laptop("Apple",14,100));
        laptopList.add(new Laptop("dell",12,900));
        Collections.sort(laptopList);
        for(Laptop lap: laptopList ){
            System.out.println(lap.getRam());
        }
    }
}
