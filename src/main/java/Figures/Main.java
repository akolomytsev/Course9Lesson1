package Figures;

public class Main {


    public static void main(String[] args) {
        Shape[] a = new Shape[] {new Shape(), new Triangle(), new Square(), new Circle()};
        for(int i = 0; i < a.length; i++) {
            a[i].showShape();
        }
    }

}
