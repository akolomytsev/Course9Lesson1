package Cars;

public abstract class Lorry extends Car implements Stopable, Moveable {

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
}
