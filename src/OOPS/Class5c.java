package OOPS;

public class Class5c {
    public static void main(String[] args) {
        CDplayer cd = new CDplayer();
        Car car = new Car(); 
        ElectricEngine eCar = new ElectricEngine();
        PowerEngine pCar = new PowerEngine();

        NiceCar niceCar = new NiceCar(car);
        niceCar.brake();

        NiceCar niceCar1 = new NiceCar(eCar);
        niceCar1.upGradeYourEngine(pCar);
        niceCar1.acc();

        NiceCar niceCar2 = new NiceCar(pCar, cd);
        niceCar2.acc();
        niceCar2.musicOn();
    }
}

class NiceCar {
    private Engine engine;
    private Media player;

    NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void brake() {
        engine.brake();
    }
    NiceCar(Engine engine, Media player) {
        this.engine = engine;
        this.player = player;
    }

    public void musicOn() {
        player.start();
    }
    public void musicOFF() {
        player.stop();
    }

    public void upGradeYourEngine(Engine to) {
        this.engine = to;
        System.out.println("upgraded engine");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("starting the electric motor");
    }

    @Override
    public void stop() {
        System.out.println("stopping the electric motor");
    }

    @Override
    public void acc() {
        System.out.println("accelerating with electric power");
    }

    @Override
    public void brake() {
        System.out.println("braking the electric car");
    }
}
class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("starting the power engine");
    }

    @Override
    public void stop() {
        System.out.println("stopping the Power engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerating with power engine");
    }

    @Override
    public void brake() {
        System.out.println("braking the power engine");
    }
}

class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("starting the media");
    }

    @Override
    public void stop() {
        System.out.println("stoping the media");
    }

}
class Car implements Engine, Media {
    @Override 
    public void start() {
        System.out.println("i start engine like a normal car");
    }
    @Override 
    public void stop() {
        System.out.println("i stop engin like a normal car");
    }
    @Override 
    public void acc() {
        System.out.println("i accelerate like a normal car");
    }
    @Override 
    public void brake() {
        System.out.println("i brake like a normal car");
    }
}

interface Engine extends Brake {
    static final int PRICE = 78000;
    void start();
    void stop();
    void acc();
}

interface Brake {
    void brake();
}

interface Media {
    void start();
    void stop();
}

