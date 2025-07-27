public class Main {
    public static void main(String[] args) {

///Вывести последнюю цифру числа

        int a, b, c;
        a = (int) (Math.random() * (10 - 1) + 1);
        b = (int) (Math.random() * (10 - 1) + 1);
        c = (int) (Math.random() * (10 - 1) + 1);

        System.out.println("Число = " + a + b + c + "; a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("Третья цифра = " + c);

            int x = 354;
            System.out.println(x - 350);


                int d = 347;
                System.out.println(d % 10);

///Найти сумму цифр ab + cd числа abcd

        int a1, b1, c1, d1, ab, cd;
        a1 = (int) (Math.random() * (10 - 1) + 1);
        b1 = (int) (Math.random() * (10 - 1) + 1);
        c1 = (int) (Math.random() * (10 - 1) + 1);
        d1 = (int) (Math.random() * (10 - 1) + 1);

        System.out.println("Number abcd = " + a1 + b1 + c1 + d1 + ";");
        System.out.println("ab  = " + a1 + b1 + "; cd= " + c1 + d1 + ";");
        ab = a1 * 10 + b1;
        cd = c1 * 10 + d1;
        int sum = ab + cd;
        System.out.println("Sum ab + cd = " + sum);


        int abcd;
        abcd = (int) (Math.random() * 9000) + 1000;

        System.out.println("Number abcd = " + abcd + ";");
        int f = abcd / 100;
        int s = abcd % 100;
        int res1 = f + s;
        System.out.println("Num ab=" + f + "; num bc=" + s + "; sum ab+cd=" + res1);

///Вывести 3-ю цифру 5ти-значного числа

        int a2, b2, c2, d2, e2;
        a2 = (int) (Math.random() * (10 - 1) + 1);
        b2 = (int) (Math.random() * (10 - 1) + 1);
        c2 = (int) (Math.random() * (10 - 1) + 1);
        d2 = (int) (Math.random() * (10 - 1) + 1);
        e2 = (int) (Math.random() * (10 - 1) + 1);

        int num = a2 * 10000 + b2 * 1000 + c2 * 100 + d2 * 10 + e2;
        System.out.println("Number abcde=" + num + ";");
        int cal = num / 100;
        int res2 = cal % 10;
        System.out.println("3-rd number=" + res2);

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