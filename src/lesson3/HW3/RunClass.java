package lesson3.HW3;

public class RunClass {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 200; i++) {
            appleBox1.addFruit(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            appleBox2.addFruit(new Apple());
        }
        for (int i = 0; i < 20; i++) {
            orangeBox1.addFruit(new Orange());
        }
        System.out.println("Масса первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Масса второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения 1й коробки с яблоками и коробки с апельсинами: "+appleBox1.compare(orangeBox1));
        System.out.println("***********");
        System.out.println("Пересыпаем из второй коробки в первую:");
        appleBox2.pourOverTo(appleBox1);
        System.out.println(">"+"Масса первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println(">"+"Масса второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println(">"+"Масса коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения 1й коробки с яблоками и коробки с апельсинами: "+appleBox1.compare(orangeBox1));
    }

}