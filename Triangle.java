import java.util.Scanner;

public class Triangle {

        private int a;
        private int b;
        private int c;
        private double square;


        public Triangle (int a, int b, int c, double square){
            super();
            this.a = a;
            this.b = b;
            this.c = c;
            this.square = square;
        }
        public Triangle () {
            super();
        }

    public void inputSideA (){
     Scanner sc = new Scanner (System.in);
     System.out.println("Input side a: ");
     a = sc.nextInt();

 }
    public void inputSideB (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input side b: ");
        b = sc.nextInt();
    }
    public void inputSideC (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input side c: ");
        c = sc.nextInt();
    }



    public void squareCalculate () {
        square = Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }

    public double getSquare() {
        inputSideA();
        inputSideB();
        inputSideC();
        squareCalculate();
        return square;
    }

    public void info(){
        System.out.println("Square of triangle = " + square);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", square=" + square +
                '}';
    }
}
