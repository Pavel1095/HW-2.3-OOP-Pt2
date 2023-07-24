public class ServiceStation {
    public void check(Transport transport) {
        transport.transportService();
    }

    public void check(MotorTransport motorTransport) {
        motorTransport.transportService();
    }
}
