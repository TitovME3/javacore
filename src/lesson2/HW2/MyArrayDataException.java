package lesson2.HW2;

public class MyArrayDataException extends Throwable {
    MyArrayDataException(String msg){
        System.out.println( "Введите целое число '\n" +msg);
    }
}
