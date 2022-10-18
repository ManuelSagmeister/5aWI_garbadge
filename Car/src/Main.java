public class Main {
    public static void main(String[] args){

        Engine e1 = new Engine(600, Engine.TYPE.GAS);
        Tank t1 = new Tank(1000);
        Car c1 = new Car(e1,10, t1, "Audi", "A1234");
        //c1.brand = "Audi";
        //c1.fuelConsumption = 7;
        //c1.serialNumber = "A1234";
        //c1.fuelAmount = 70;

        c1.drive(10);
        c1.attributes();
    }
}