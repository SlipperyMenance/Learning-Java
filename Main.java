public class Main {
    public static void main(String[] args) {

        ///Вывести длину отрезка, проходящей через две точки

        int x1, y1, x2, y2;
        x1 = (int) (Math.random() * (10 - 1) + 1);
        y1 = (int) (Math.random() * (10 - 1) + 1);
        x2 = (int) (Math.random() * (10 - 1) + 1);
        y2 = (int) (Math.random() * (10 - 1) + 1);

        System.out.println("Dot1 (" + x1 + ";" + y1 + ");");
        System.out.println("Dot2 (" + x2 + ";" + y2 + ");");

        //Длина отрезка AB = √[(x₂ - x₁)² + (y₂ - y₁)²]

        double lenght = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Lengt AB=" + lenght);
    }
}