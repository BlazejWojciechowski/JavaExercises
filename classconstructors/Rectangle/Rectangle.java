package Zadania.KlasyKonstruktory;

public class Rectangle {
    private double lenght;
    private double width;

    /**
      Konstruktor
      @param len Długość prostokąta
      @param w Szerokość prostokąta
     */
    public Rectangle(double len, double w) {
        lenght = len;
        width = w;
    }
    /**
     Metoda setLenght zapisuje wartość
     w polu lenght.
     @param len Wartość zapisywana w polu lenght
     */
    public void setLenght(double len) {
        lenght = len;
    }
    /**
     Metoda setWidth zapisuje wartość
     w polu width.
     @param w Wartość zapisywana w polu lenght
     */
    public void setWidth(double w) {
        width = w;
    }

    /**
     Metoda getLenght zwraca długość
    obiektu typu Rectangle.
    @return Wartość z pola lenght
    */
    public double getLenght() {
        return lenght;
    }

    /**
     Metoda getWidth zwraca szerokość
     obiektu typu Rectangle.
     @return Wartość z pola width
     */
    public double getWidth() {
        return width;
    }
    /**
     Metoda getArea zwraca powierzchnię
     obiektu typu Rectangle.
     @return Iloczyn pól lenght i width.
     */
    public double getArea() {
        return lenght * width;
    }
}
