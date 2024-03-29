package Lecture_13;

public class Audi implements  Car{
    private Engine engine;
    private Steering steering;
    private Brake brake;
    public Audi(){
        this.engine=new PetrolEngine();
        this.steering=new PowerSteering();
        this.brake=new ABSBrakes();



    }
    public Audi(Engine engine, Steering steering, Brake brake) {
        this.engine = engine;
        this.steering = steering;
        this.brake = brake;
    }

    public Audi(Engine engine, Brake brake) {
        this(engine, new PowerSteering(), brake);
    }
    @Override
    public void start() {
         engine.start();
    }

    @Override
    public void stop() {
          engine.stop();
    }

    @Override
    public void brake() {
        brake.brake();

    }

    @Override
    public void steer(String direction) {
         steering.steer(direction);
    }

    @Override
    public void changeSteering(Steering steering) {
        this.steering=steering;
    }

    @Override
    public void changeEngine(Engine engine) {
        this.engine=engine;
    }

    @Override
    public void changeBrake(Brake brake) {
        this.brake=brake;

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }
}
