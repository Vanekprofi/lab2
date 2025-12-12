public class Fraction {
    private final int numerator;     // числитель
    private final int denominator;   // знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Строковое представление: "a/b"
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // ---------------- Операции ----------------

    // Сложение с Дробью
    public Fraction sum(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    // Сложение с целым числом
    public Fraction sum(int value) {
        return new Fraction(this.numerator + value * this.denominator, this.denominator);
    }

    // Вычитание с Дробью
    public Fraction minus(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    // Вычитание с целым числом
    public Fraction minus(int value) {
        return new Fraction(this.numerator - value * this.denominator, this.denominator);
    }

    // Умножение на Дробь
    public Fraction mul(Fraction other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    // Умножение на число
    public Fraction mul(int value) {
        return new Fraction(this.numerator * value, this.denominator);
    }

    // Деление на Дробь
    public Fraction div(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль!");
        }
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction(num, den);
    }

    // Деление на число
    public Fraction div(int value) {
        if (value == 0) throw new IllegalArgumentException("Деление на ноль!");
        return new Fraction(this.numerator, this.denominator * value);
    }
}