package CodingPacakge;


public class Program_1 {
	public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
       Program_1 p=new Program_1();
       System.out.println("Addition Vlaue : " + p.add(10, 20));
       System.out.println("Addition Vlaue : " + p.sub(10, 20));
       System.out.println("Addition Vlaue : " + p.mul(10, 20));
       System.out.println("Division Value : " + p.div(10, 20));
       
    }
}
