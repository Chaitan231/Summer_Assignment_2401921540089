package Week_4.OOPS;


interface Test {
    int square(int x);
}


class Arithmetic implements Test {
    @Override
    public int square(int x) {
        return x * x;
    }
}


class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square of 5 = " + obj.square(5));
    }
}
