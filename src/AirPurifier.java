public class AirPurifier {
    String model;
    String serial;
    double pmLevel;
    boolean power = false;
    int fanSpeed; // Level 1-5 but Level 0 is power off.
    static String[] allModel = new String[]{"Hatari-1234", "Hatari-3310", "Hatari-XY"};

    AirPurifier(String model, String serial, double pmLevel){
        this.model = model;
        this.serial = serial;
        this.pmLevel = pmLevel;
    }

    void checkStatus(){
        if(!power){
            System.out.println("The air purifier is off.");
            System.out.println("");
        }else{
            System.out.println("///////////////////////////////////////////");
            System.out.println("Model: " + model + ".   " + "Serial: " + serial);
            System.out.println("PMLevel: " + pmLevel);
            System.out.println("FanSpeed: " + fanSpeed);
            System.out.println("///////////////////////////////////////////");
            System.out.println("");
        }
    }

    void powerOn(){
        power = true;
        fanSpeed = 3 ;
    }

    void powerOff(){ power = false; }

    void setFanSpeed(int FanSpeed){
        if(FanSpeed > 0 && FanSpeed <= 5){
            fanSpeed = FanSpeed;
        }else if(FanSpeed == 0){
            power = false;
        }else{
            System.out.println("error set fan speed.");
            System.out.println("");
        }
    }

    void sensorPM(double PMLevel){
        pmLevel = PMLevel;
    }

    static void bestSellerModel(){
        System.out.println("Best seller model is Hatari-3310");;
        System.out.println("");
    }

    static void listAllModel(){
        System.out.print("All name model : ");
        for(String allModel : allModel){
            System.out.print(allModel + " ");
        }
        System.out.println("");
    }
}
