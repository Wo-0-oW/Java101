public class MathMethods {

    /*

Math.abs(<a numeric value>);
returns the absolute value of the input value.

Math.round(<a numeric value>);
returns the integer nearest to the input value.

Math.ceil(<a numeric value>);
returns the smallest integer that is bigger than or equal to the input value.

Math.floor(<a numeric value>);
returns the biggest integer that is smaller than or equal to the input value.

Math.exp(<a numeric value>);
returns the exponential of the input value.

Math.max(<a numeric value>,<a numeric value>);
returns the bigger between the two input values.

Math.min(<a numeric value>,<a numeric value>);
returns the smaller between the two input values.

Math.pow(<a numeric value>,<a numeric value>);
returns the value of the first value raised to the power of the second value.

Math.sqrt(<a numeric value>);
returns the square root of the input value.

Math.sin(<a numeric value>);
returns the trigonometric sine value of the input value in radian.

Math.cos(<a numeric value>);
returns the trigonometric cosine value of the input value in radian.

Math.tan(<a numeric value>);
returns the trigonometric tangent value of the input value in radian.

*/
    public static void main(String[] args) {
        double a= 2.8, b = 3.1, c = 6.0;
        System.out.println("a+b \t\t= " + (a+b));
        System.out.println("|a| \t\t= " + Math.abs(a));
        System.out.println("round(a) \t= " + Math.round(a));
        System.out.println("ceil(a) \t= " + Math.ceil(a));
        System.out.println("floor(a) \t= " + Math.floor(a));
        System.out.println("exp(a) \t\t= " + Math.exp(a));
        System.out.println("max of a and b \t= " + Math.max(a,b));
        System.out.println("min of a and b \t= " + Math.min(a,b));
        System.out.println("2^c \t\t= "+Math.pow(2,c));




    }
}
