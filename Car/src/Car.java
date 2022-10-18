public class Car {
    private Engine engine;
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;


    //Methoden
    public Car(Engine engine, int fuelConsumption, Tank fuelAmount, String brand, String serialNumber){
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount.getFuelAmount();

    }


    public void attributes(){
        System.out.println("Horsepower: " + engine.getHorsePower() + '\n' + "Fuel Consumption: " + this.fuelConsumption + '\n' + "Fuel Amount: " + fuelAmount);
    }

    public void drive(int speed){

         if(speed >= 1 && speed < 25){
             fuelAmount = fuelAmount-fuelConsumption;
             System.out.println("I am driving slowly");

         }
         else if (speed >=25 && speed < 50){
             fuelAmount = fuelAmount-fuelConsumption;
             System.out.println("I am driving a little bit faster");

         }
         else if (speed >=50 && speed < 75){
             fuelAmount = fuelAmount-fuelConsumption;
             System.out.println("I am driving fast");

         }
         else if (speed >=75 && speed < 100){
             fuelAmount = fuelAmount-fuelConsumption;
             System.out.println("I am speed ;)");

         }
         else {
             System.out.println("Bitte geben Sie eine gültige Zahl ein Wertebereich 0-100");
         }
    }

    public void brake(){
        System.out.println("Ich bremse");
    }



    public void honk(int amountOfRepetitions){
        int a = amountOfRepetitions;
        for (int i = 0; i <= a; i++){
            System.out.println("tuut");
        }
    }


    //Getter Setter
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
