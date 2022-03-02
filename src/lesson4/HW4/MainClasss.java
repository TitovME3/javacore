package lesson4.HW4;

public class MainClasss {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();


        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");
        pb.add("Sidorov", "987");
        pb.add("Petrov", "987");

        System.out.println(pb.get("Petrov"));

    }

}
