package lesson1.lesson;

public class Restoran {
    String result;
    private int breakfast;
    private int dinner;
    private int lunch;

    public Restoran(int breakfast, int dinner, int lunch){
        this.breakfast = breakfast;
        this.dinner = dinner;
        this.lunch = lunch;
    }
    public String doIt(Group group){
        result = "Группа номер: " + group.getName() + "" + '\n';
        for (Person person: group.getPeoples()){
            result += "Имя клиента: " + person.getName() + "" + '\n';
            int value = person.getCanEatCalories();
            testBreakfast(value)
                    .testDinner(value)
                    .testLunch(value);
        }

            return result;

    }
    private Restoran testBreakfast(int value){
        if (value < breakfast) result += "Завтрак - наелся" + '\n';
        return this;
    }

    private Restoran testDinner(int value){
        if(value < dinner) result += "Обед - наелся" + '\n';
        return this;
    }

    private Restoran testLunch(int value){
        if (value < lunch) result += "Ужин - наелся" + '\n';
        return this;
    }
}
