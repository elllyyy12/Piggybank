public class Piggybank {
    
    private int pennies = 0;
    private int nickels = 0;
    private int dimes = 0;
    private int quarters = 0;

    public String getTotal(){

        int totalCash = (pennies + (nickels * 5) + (dimes * 10) + (quarters * 25));

        return "Pennies: " + pennies + "\nNickels: " + nickels + "\nDimes: " + dimes + "\nQuarters: " + quarters + "\nTotal: " +totalCash + "Cents";
    }

    public void addPenny(){
        pennies++;
    }

    public void addNickel(){
        nickels++;
    }

    public void addDime(){
        dimes++;
    }

    public void addQuarter(){
        quarters++;
    }

    public void takePenny(int num){

        for(int i = num; pennies > 0 && i > 0; i--){
            pennies--;
        }
    }

    public void takeNickel(int num){

        for(int i = num; nickels > 0 && i > 0; i--){
            nickels--;
        }
    }

    public void takeDime(int num){

        for(int i = num; dimes > 0 && i > 0; i--){
            dimes--;
        }
    }

    public void takeQuarter(int num){

        for(int i = num; quarters > 0 && i > 0; i--){
            quarters--;
        }
    }

}
