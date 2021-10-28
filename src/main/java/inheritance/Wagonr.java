package inheritance;

public class Wagonr extends Car{

    String sterio;

    public Wagonr(String steering, String engine, String tyre, String horn, String seat, String sterio, final String safety) {
        super(steering, engine, tyre, horn, seat, safety);
        this.sterio = sterio;
    }

   /* @Override
    public String toString() {
        return "Wagonr{" +"sterio='" + sterio + '\'' +
                ", steering='" + steering + '\'' +
                ", engine='" + engine + '\'' +
                ", tyre='" + tyre + '\'' +
                ", horn='" + horn + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }*/

    public void drive(String carName, String color){
        System.out.println("Driving the new " + carName + " of " + color + " !!!");
    }

    @Override
    public String toString() {
        return "Wagonr{" +
                "sterio='" + sterio + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car wagonr = new Wagonr("Wooden", "Four Stroke", "Alloy Wheels",
                "Hella Horn", "Leather", "SONY Sourround Sound", "new value");
        System.out.println("Output --> Parent -- Child " + wagonr.toString());
        Car car = new Car("Wooden", "Four Stroke", "Alloy Wheels",
                "Hella Horn", "Leather", "SONY Sourround Sound");
        System.out.println("Output --> parent -- parent " + car.toString()  + " final --> " + car.safety);

        wagonr.drive();

        String str = new String("Checking");
        System.out.println(str + new String("Checking"));
    }
}
