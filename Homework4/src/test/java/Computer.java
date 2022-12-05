import java.util.Random;
import java.util.Scanner;

public class Computer {
//initializing the values
    int year;
    double price;
    String operationSystem;
// creating the constructor
    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
        System.out.println("year = " + year + " price = " + price + " operationSystem = " + operationSystem);
    }

    public int comparePrice(Computer computer2) {





       return Double.compare(this.price,computer2.price); // the if statement can be replaced with this expression




//        if (x > y) {
//            return 1;
//        }
//         else if (x < y) { return -1; }
//         else { return 0; }
//

    }



}
