public class NotesInitialize3 {
    public static void main(String[] args) {
        int[] intArray = new int[] {5, 10, 15, 20}; // Length of 4
        double[] doubleArray = new double[] {5.2, 3.4, -16.5, 1005.7, 0.0}; // Length of 5
        boolean[] booleanArray = new boolean[] {true, false, false, true}; // Length of 4
        String[] stringArray = new String[] {"Hello, World!", "Mr. G", "John"}; // Length of 3
        Person person1 = new Person("Mr. G", 26);
        Person[] personArray = new Person[] {person1, new Person("John", 26)}; // Length of 2
    }
}
