import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        int choice = 7;

        Piggybank myPiggybank = new Piggybank();

        while(choice != 0){

            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit.");

            System.out.println("Enter your choice: ");

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if(choice == 1){
                System.out.println(myPiggybank.getTotal());
            }

            if(choice == 2){
                myPiggybank.addPenny();
            }

            if(choice == 3){
                myPiggybank.addNickel();
            }

            if(choice == 4){
                myPiggybank.addDime();
            }

            if(choice == 5){
                myPiggybank.addQuarter();
            }

            if(choice == 6){

                int numPenny = input.nextInt();
                System.out.println("How many Pennies would you like to withdraw?");
                myPiggybank.takePenny(numPenny);

                int numNickel = input.nextInt();
                System.out.println("How many Nickels would you like to withdraw?");
                myPiggybank.takeNickel(numNickel);

                int numDime = input.nextInt();
                System.out.println("How many Dime would you like to withdraw?");
                myPiggybank.takeDime(numDime);

                int numQuarter = input.nextInt();
                System.out.println("How many Quarter would you like to withdraw?");
                myPiggybank.takeQuarter(numQuarter);
            }
        }
    }
}