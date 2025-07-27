public class Main {
    public static void main(String[] args) {

        ///Вывести 3-ю цифру 5ти-значного числа

        int a, b, c, d, e;
        a = (int) (Math.random() * (10 - 1) + 1);
        b = (int) (Math.random() * (10 - 1) + 1);
        c = (int) (Math.random() * (10 - 1) + 1);
        d = (int) (Math.random() * (10 - 1) + 1);
        e = (int) (Math.random() * (10 - 1) + 1);

        int num = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
        System.out.println("Number abcde=" + num + ";");
        int cal = num / 100;
        int res = cal % 10;
        System.out.println("3-rd number=" + res);
    }
}