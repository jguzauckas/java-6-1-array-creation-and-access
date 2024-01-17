public class NotesModify3 {
    public static void main(String[] args) {
        Person person1 = new Person("Mr. G", 26);
        Person[] personArray = new Person[] {person1, new Person("John", 26)};
        System.out.println(personArray[1].getAge());
        personArray[1].setAge(30);
        System.out.println(personArray[1].getAge());
    }
}
