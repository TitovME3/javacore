package lesson2.HW2;

import static java.lang.Integer.valueOf;

public class Array {

    public static void main(String[] args) {

        String[][] stringArr1 = new String[][] {
                {"5", "0", "5", "4"},
                {"7", "4", "3", "4"},
                {"8", "2", "5", "6"},
                {"1", "2", "4", "7"}
        };
        String[][] stringArr2 = new String[][] {
                {"5", "6", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"2", "2", "4", "8"}
        };
        String[][] stringArr3 = new String[][] {
                {"5", "4", "3", "4"},
                {"1", "5", "3", "4"},
                {"1", "2", "5", "6"},
                {"3", "2", "8", "6"}
        };

        try {
            System.out.println("Сумма элементов массива = " + Sum(stringArr1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива = " + Sum(stringArr2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива = " + Sum(stringArr3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    public static int Sum (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Размер массива должна быть %dх%d.", arrDim,arrDim));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В ячейке [%d][%d] массива задано не целое число (%s)", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }

}
