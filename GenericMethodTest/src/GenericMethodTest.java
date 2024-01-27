public class GenericMethodTest {
    public static < E > void printArray(E[] inputArray) {
        for(E element: inputArray) {
            System.out.printf("%s",element);

        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] intArray={1, 2, 3, 4, 5};
        Double[] doubleArray={1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray={'H', 'O', 'M', 'E'};
        System.out.println("Array IntegerArray Contains:");
        printArray(intArray);

        System.out.println("Array DoubleArray Contains:");
        printArray(doubleArray);

        System.out.println("Array CharacterArray Contains:");
        printArray(charArray);

    }
}
