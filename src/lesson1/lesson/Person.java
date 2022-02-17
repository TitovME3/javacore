package lesson1.lesson;

public class Person {

    private String name;
    public int canEatCalories;

    public Person(String name, int canEatCalories){
        this.name = name;
        this.canEatCalories = canEatCalories;
    }
     public String getName(){
        return name;
     }

    public int getCanEatCalories() {
        return canEatCalories;
    }
}
