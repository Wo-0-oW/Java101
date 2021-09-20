public class StringConcat {
    public static void main(String[] args) {
        double distance, speed;
        distance = 2500;
        speed = 80;
        System.out.print("It would take a car ");
        System.out.print("running at " + speed + "km/h ");
        System.out.print((distance / 1000 / speed) * 60 * 60 + " sec.");
        System.out.print("to travel");
        System.out.print(distance / 1000 + " km.");
    }
}
