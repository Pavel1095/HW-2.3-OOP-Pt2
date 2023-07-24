public class Bicycle extends Transport {

        public String modelName;
        public int wheelsCount;

    public Bicycle(String modelName, int wheelCount) {
                super(modelName, wheelCount);
            }
            @Override
            public void transportService() {
                updateTyre();
            }
        }
