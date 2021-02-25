package main;




public class PiAproximation {
    static class Dot {
        public double x;
        public double y;

        Dot(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double dist(){
            return this.x *this.x + this.y * this.y;
        }
        @Override
        public String toString() {
            return "Dot{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args) {


        int circle = 0;
        int total = 0;
        for (int i = 1;i < 1000000; i++) {
            ++total;
            double y = Math.random() * 2 - 1;
            double x = Math.random() * 2 - 1;
            Dot dot = new Dot(x, y);

            if (dot.dist() < 1){
                ++circle;
            }
            double pi = (double) circle / (double) total;
            System.out.println(4*pi);
        }


    }

}