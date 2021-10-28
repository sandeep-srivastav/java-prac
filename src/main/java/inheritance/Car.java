package inheritance;

public class Car {

    private String steering;
    private String engine;
    private String tyre;
    private String horn;
    private String seat;
    final String safety = "Air Bag";

    public Car(String steering, String engine, String tyre, String horn, String seat, final String safety){
        this.steering = steering;
        this.engine = engine;
        this.tyre = tyre;
        this.horn = horn;
        this.seat = seat;
    }


    void drive(){
       System.out.println("Drive the car !!!");
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getHorn() {
        return horn;
    }

    public void setHorn(String horn) {
        this.horn = horn;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", engine='" + engine + '\'' +
                ", tyre='" + tyre + '\'' +
                ", horn='" + horn + '\'' +
                ", seat='" + seat + '\'' +
                ", safety='" + safety + '\'' +
                '}';
    }
}
