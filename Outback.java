public class Outback {
    private int gas;
    private String color;
    private boolean isWilderness;
    private int eyesightcounter = 5;
    public Outback(int gas, String color){
        this.gas = gas;
        isWilderness = false;
        this.color = color;
    }
    public Outback(int gas, String color, boolean isWilderness){
        this.gas = gas;
        this.isWilderness = isWilderness;
        this.color = color;

    }
    public void drive(int distance, boolean isIncline){

    }
    public void display(int x, int y){
        
    }
    public String eyesightbreak() {
        if (eyesightcounter == 0) {
            return "You have used all your Eyesight emergency brakiung.";
        } else {
            eyesightcounter--;
            return "You used the Eyesight emergency brake. You have " + eyesightcounter + " Eyesight emergency brakes left";
        }
    }
    public void fillUp(int gas){
        this.gas += gas;
    }
    public int getGas(){
        return gas;
    }
    public boolean getIsWilderness(){
        return isWilderness;
    }
    public String getColor(){
        return color;
    }
}
