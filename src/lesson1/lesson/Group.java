package lesson1.lesson;

public class Group {
    private String name;
    private Person[] peoples;

    public Group(String name, Person[] peoples){
        this.name = name;
        this.peoples = peoples;
    }
    public String getName(){
        return name;
    }
    public Person[] getPeoples(){
        return peoples;
    }
}
