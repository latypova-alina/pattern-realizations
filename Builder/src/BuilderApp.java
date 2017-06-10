/**
 * Created by alina on 10.06.17.
 */
public class BuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mersedes")
                .buildSpeed(300)
                .buildTrans(Transmission.AUTO)
                .build();
    }
}

enum Transmission{
    MANUAL, AUTO
}

class Car{
    String make;
    Transmission transmission;
    int maxspeed;
    public void setMake(String make){this.make = make;}
    public void setTransmission(Transmission transmission){this.transmission = transmission;}
    public void setMaxspeed(int maxspeed){this.maxspeed = maxspeed;}
}

class CarBuilder{
    String m;  //ставим какое-то значение
    Transmission t;
    int s;

    CarBuilder buildMake(String m){
        this.m = m;
        return this;
    }
    CarBuilder buildTrans(Transmission t){
        this.t = t;
        return this;
    }
    CarBuilder buildSpeed(int s){
        this.s = s;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setMake(m);
        car.setMaxspeed(s);
        car.setTransmission(t);
        return car;
    }
}
