public class NotesModify2 {
    public static void main(String[] args) {
        int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
        System.out.println(ages[5]);
        ages[5] = ages[5] + 1;
        System.out.println(ages[5]);
        System.out.println(ages[3]);
        ages[3] += 1;
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        ages[4]++;
        System.out.println(ages[4]);
    }
}
