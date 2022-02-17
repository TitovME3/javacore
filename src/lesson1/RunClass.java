package lesson1;

public class RunClass {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Имя 1" , 150);
        person[1] = new Person("name 2" , 150);
        person[2] = new Person("name 3", 150);
        person[3] = new Person("name4", 150);
        Group group = new Group("Group 1", person);

        Restoran restoran = new Restoran(200,200,200);
        String result = restoran.doIt(group);
        System.out.println(result);
    }
}
