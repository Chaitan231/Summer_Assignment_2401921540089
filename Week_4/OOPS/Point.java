package Week_4.OOPS;

class Point {
    private int x, y;

   
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) { this.x = x; this.y = y; }

    public void showPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

