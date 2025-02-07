package org.example.HomeWork4.Task2;

public class Vector2D {
    private double x;
    private double y;

    // Конструктор по умолчанию (нулевой вектор)
    public Vector2D() {
        this(0, 0);
    }

    // Конструктор с координатами
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Сложение векторов (создание нового объекта)
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // Сложение векторов (изменяет текущий вектор)
    public void add2(Vector2D other) {
        this.x += other.x;
        this.y += other.y;
    }

    // Вычитание векторов (создание нового объекта)
    public Vector2D sub(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    // Вычитание векторов (изменяет текущий вектор)
    public void sub2(Vector2D other) {
        this.x -= other.x;
        this.y -= other.y;
    }

    // Умножение вектора на число (создание нового объекта)
    public Vector2D mult(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    // Умножение вектора на число (изменяет текущий вектор)
    public void mult2(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    // Длина вектора
    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    // Скалярное произведение векторов
    public double scalarProduct(Vector2D other) {
        return this.x * other.x + this.y * other.y;
    }

    // Косинус угла между векторами
    public double cos(Vector2D other) {
        double lengthProduct = this.length() * other.length();
        if (lengthProduct == 0) {
            throw new ArithmeticException("Невозможно вычислить косинус угла для нулевого вектора");
        }
        return scalarProduct(other) / lengthProduct;
    }

    // Сравнение векторов
    public boolean equals(Vector2D other) {
        return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0;
    }

    // Строковое представление
    @Override
    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }

    // Тестирование класса
    public static void main(String[] args) {
        try {
            Vector2D v1 = new Vector2D(3, 4);
            Vector2D v2 = new Vector2D(1, 2);

            System.out.println("v1: " + v1);
            System.out.println("v2: " + v2);
            System.out.println("v1 + v2: " + v1.add(v2));
            System.out.println("v1 - v2: " + v1.sub(v2));
            System.out.println("v1 * 2: " + v1.mult(2));
            System.out.println("Длина v1: " + v1.length());
            System.out.println("Скалярное произведение v1 и v2: " + v1.scalarProduct(v2));
            System.out.println("Косинус угла между v1 и v2: " + v1.cos(v2));
            System.out.println("v1 == v2: " + v1.equals(v2));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
