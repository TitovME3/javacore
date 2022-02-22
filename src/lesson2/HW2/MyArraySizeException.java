package lesson2.HW2;

public class MyArraySizeException extends Throwable {
    MyArraySizeException(String msg){
        System.out.println("Ошибка размерности массива.\n"+""+msg);
    }

}
