public abstract class Transport {
    private String modelName;
    private int wheelCount;

    public Transport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public abstract void transportService();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}