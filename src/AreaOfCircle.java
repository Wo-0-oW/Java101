public class AreaOfCircle {
    public static void main(String[] args) {
        double area, r;
        String s1 = "The Area of a circle with ";
        String s2 = " r = ";
        String s3 = " is ";
        String s4;
        area = Math.PI * Math.pow(r, 2);
        s4 = s1.concat(s2);
        System.out.println(s4 + area);


    }
}
