public class ComputerPrices {

    public static void main(String[] args) {


        Computer computer = new Computer(2020,2500, "Linux (on the to do list)");
        Computer computer2 = new Computer(2018,2500, "Linux (on the to do list)");
        //

        if (computer.comparePrice(computer2) == 1){
        System.out.println("computer1 is more expensive " + computer.price);}
        else if (computer.comparePrice(computer2) == -1) {
        System.out.println("computer2 is more expensive " + computer2.price);}
        else {
            System.out.println("The computer prices are equal");
        }


//        System.out.println("comparePrice = " + comparePrice);



    }

}
