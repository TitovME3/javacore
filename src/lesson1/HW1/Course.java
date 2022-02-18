package lesson1.HW1;

public class Course {
    String name;
    String result;
    private int run;


    public Course(int run){
        this.run = run;
    }
    public String doIt(Participant[] team){
        result = "Команда "+ "'Black'"+ '\n';
        for (Participant participant : team){
            result += "Участник :"+ participant.getName()+ ""+'\n';
            int value = participant.getRun();
            testRun(value);
        }
        return result;
    }
    private void testRun(int value){
        if(value<run) result += "Пробежал" + '\n';
    }
}


