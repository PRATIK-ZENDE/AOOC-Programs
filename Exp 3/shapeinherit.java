abstract class shape {
    int dim1, dim2;

    shape(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();

}

class Rectangle extends shape{
    Rectangle(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("Rectangle Area: " + (dim1 * dim2));
    }
}

class Triangle extends shape {
    Triangle(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("Triangle Area: " + (0.5 * dim1 * dim2));
    }
}
public class shapeinherit{
	public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);

        r.area();
        t.area();
    }
}
