public class Lab02 {
    public static void main(String[] args) {
        AirPurifier a1 = new AirPurifier("Hatari-1234", "32315125", 53.42);
        a1.checkStatus();
        a1.powerOn();
        a1.setFanSpeed(4);
        a1.checkStatus();
        a1.sensorPM(73.38);
        a1.checkStatus();
        a1.powerOff();
        a1.checkStatus();

        AirPurifier.bestSellerModel();
        AirPurifier.listAllModel();
    }
}
