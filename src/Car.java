public class Car extends MotorTransport {

            public Car(String modelName, int wheelCount) {
                super(modelName, wheelCount);
            }
            public void updateTyre() {
                System.out.println("Меняем покрышку автомобиля");
            }
            public void checkEngine() {
                System.out.println("Проверяем двигатель автомобиля");
            }
                @Override
                public void transportService() {
                    updateTyre();
                    checkEngine();
                }
            }
