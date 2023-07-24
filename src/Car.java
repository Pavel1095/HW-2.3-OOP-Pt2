public class Car extends MotorTransport {

            public Car(String modelName, int wheelCount) {
                super(modelName, wheelCount);
            }
                @Override
                public void transportService() {
                    updateTyre();
                    checkEngine();
                }
            }
