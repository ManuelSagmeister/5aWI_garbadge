public class Tank {
    private int fuelAmount;

    public Tank (int fuelAmount){
        this.fuelAmount = fuelAmount;
    }

    public void turboBoost(){
        if(fuelAmount/10<=fuelAmount){
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }


    //---------------------getter--------------setter-------------------

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
