public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }
    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}

