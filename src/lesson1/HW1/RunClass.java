package lesson1.HW1;


public class RunClass {
    public static void main(String[] args) {

        Participant[] team = new Participant[4];
        team[0] = new Participant(" Ivanov Ivan", 200);
        team[1] = new Participant(" Fedorov fedor", 300);
        team[2] = new Participant(" Semenov Semen", 200);
        team[3] = new Participant(" Olgova Olga", 150);

        Course course = new Course(250);
        String result = course.doIt(team);
        System.out.println(result);

        }

}

