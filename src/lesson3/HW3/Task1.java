package lesson3.HW3;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {

        Integer array1[] = {1, 2, 3, 4, 5, 6, 7};
        swap(array1,3,2);
    }


        public static void swap(Object[] arr, int n1, int n2){
            System.out.println("Исходный массив: "+Arrays.toString(arr));
            Object sw = arr[n1];
            arr[n1]=arr[n2];
            arr[n2]=sw;
            System.out.println("Результат замены: "+Arrays.toString(arr));

    }
}


