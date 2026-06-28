package Week_4.OOPS;


class Box {
    protected double length, breadth;

    public Box(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}


class Box3d extends Box {
    private double height;

    public Box3d(double l, double b, double h) {
        super(l, b);
        this.height = h;
    }

    public double volume() {
        return length * breadth * height;
    }
}


public class TestBox {
    public static void main(String[] args) {
        Box box = new Box(5, 4);
        System.out.println("Area of Box = " + box.area());

        Box3d box3d = new Box3d(5, 4, 3);
        System.out.println("Area of Box3d = " + box3d.area());
        System.out.println("Volume of Box3d = " + box3d.volume());
    }
}

