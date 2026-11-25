public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("202510621", "Khabab", 20, 75.0, 60.0, 85.0);
        s1.displayInformation();

        System.out.println("----------------------------");

        Student s2 = new Student("202510621", "khabab", 22, 99, 99.9, 90);
        s2.displayInformation();
    }
}