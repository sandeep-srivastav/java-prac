/*
package inheritance;

public class Alto  extends Wagonr implements InheritClass, InterfaceOne {

    String dasboard;


    public Alto(String steering, String engine, String tyre, String horn, String seat, String sterio, String dasboard) {
        super(steering, engine, tyre, horn, seat, sterio);
        this.dasboard = dasboard;
    }

    */
/*@Override
    public String toString() {
        return "Alto{" +
                "dasboard='" + dasboard + '\'' +
                ", sterio='" + sterio + '\'' +
                ", steering='" + steering + '\'' +
                ", engine='" + engine + '\'' +
                ", tyre='" + tyre + '\'' +
                ", horn='" + horn + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
*//*


    @Override
    public String toString() {
        return "Alto{" +
                "dasboard='" + dasboard + '\'' +
                '}';
    }

    public void drive(String carName){
        System.out.println("driving the new  " + carName + " Car !!!");
    }

    public static void main(String[] args) {
        Alto alto = new Alto("Wooden", "Four Stroke", "Alloy Wheels",
                "Hella Horn", "Leather", "SONY Sourround Sound", "Wodden Colour");
        System.out.println("The features are --> " + alto.toString());
        alto.drive();
        alto.drive("WagonR", "White");
        alto.drive("Alto");
    }
}
*/
