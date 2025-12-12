public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1: ТОЧКИ ===");

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5.5, -3);
        Point p3 = new Point(10, 10);

        System.out.println("Точка 1: " + p1);
        System.out.println("Точка 2: " + p2);
        System.out.println("Точка 3: " + p3);

        System.out.println("\n=== ЗАДАНИЕ 3: ИМЕНА ===");

        Name n1 = new Name("Клеопатра", null, null);
        Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name n3 = new Name("Маяковский", "Владимир", null);

        System.out.println("Имя 1: " + n1);
        System.out.println("Имя 2: " + n2);
        System.out.println("Имя 3: " + n3);

        System.out.println("\n=== ЗАДАНИЕ 2: ЛИНИИ ===");

        Point L1start = new Point(1, 3);
        Point L1end = new Point(23, 8);
        Line line1 = new Line(L1start, L1end);

        Point L2start = new Point(5, 10);
        Point L2end = new Point(25, 10);
        Line line2 = new Line(L2start, L2end);

        Line line3 = new Line(L1start, L2end);

        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);

        L1start.setX(100);
        L1start.setY(100);
        L2end.setX(200);
        L2end.setY(200);

        System.out.println("\nПосле изменения L1 и L2:");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);

        line1.setStart(new Point(7, 7));
        line1.setEnd(new Point(8, 8));

        System.out.println("\nПосле изменения L1 без изменения L3:");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 3: " + line3);

        System.out.println("\n=== ЗАДАНИЕ 4: ГОРОДА ===");

        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addPath(B, 5);
        A.addPath(F, 1);
        F.addPath(B, 1);
        F.addPath(E, 2);
        E.addPath(D, 2);
        B.addPath(C, 3);
        C.addPath(D, 4);
        A.addPath(D, 6);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

        System.out.println("\n=== ЗАДАНИЕ 5: ДРОБИ ===");

        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);

        System.out.println("Дроби:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        System.out.println("\nОперации:");
        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.mul(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));

        System.out.println("\nС целыми числами:");
        System.out.println(f1 + " + 2 = " + f1.sum(2));
        System.out.println(f1 + " - 2 = " + f1.minus(2));
        System.out.println(f1 + " * 2 = " + f1.mul(2));
        System.out.println(f1 + " / 2 = " + f1.div(2));

        System.out.println("\nЦепочка вычислений:");
        Fraction result = f1.sum(f2).div(f3).minus(5);
        System.out.println("f1.sum(f2).div(f3).minus(5) = " + result);
        System.out.println("Подробно:");
        System.out.println("1. " + f1 + ".sum(" + f2 + ") = " + f1.sum(f2));
        System.out.println("2. .div(" + f3 + ") = " + f1.sum(f2).div(f3));
        System.out.println("3. .minus(5) = " + result);
    }
}