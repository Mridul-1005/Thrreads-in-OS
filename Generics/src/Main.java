public class Main {
    public static void main(String[] args) {
        Integer[] intArray={1,2,3};
        Double[] doubleArray={1.1,2.2,3.3};
        displayArray(intArray);
        displayArray(doubleArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
    }
    public static<Thing> void displayArray(Thing[] array){
        for(Thing x: array) {
            System.out.println(" " + x);
        }
    }
    public static<Thing> Thing getFirst(Thing[] array){
        return array[0];
    }
}