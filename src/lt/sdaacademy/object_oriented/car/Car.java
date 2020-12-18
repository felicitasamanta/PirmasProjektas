package lt.sdaacademy.object_oriented.car;

//zodelis private uzdraudzia pasiekti kintamuosius
public class Car {
    private String model; //null
    private double engine; //default 0.0
    private int numberOfDoors; // default 0
    private boolean isRunAndDrive; //default false

    //kuriamas konstruktorius; tai yra metodas, kuris priima parametrus
    Car(String m, double e, int n, boolean i) {
        model = m;
    }

    public Car(String model, int doors) {

    }


    public double getEngine() {
        return engine;

    }

    public String getModel() {
        return model;
    }

}

