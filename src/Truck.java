public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}

