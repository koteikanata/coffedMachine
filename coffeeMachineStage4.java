
import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static int waterInStock = 400, milkInStock = 540, coffeeBeansInStock = 120,
            cupsInStock = 9, moneyInStock = 550;

    public static void main(String[] args) {
        machineInStock();
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
    }

    private static void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, " +
                "2 - latte, " +
                "3 - cappuccino:");
        int selectedCoffee = scanner.nextInt();
        switch (selectedCoffee) {
            case 1:
                waterInStock -= 250;
                coffeeBeansInStock -= 16;
                moneyInStock += 4;
                break;
            case 2:
                waterInStock -= 350;
                milkInStock -= 75;
                coffeeBeansInStock -= 20;
                moneyInStock += 7;
                break;
            case 3:
                waterInStock -= 200;
                milkInStock -= 100;
                coffeeBeansInStock -= 12;
                moneyInStock += 6;
                break;
        }
        cupsInStock -= 1;
        machineInStock();
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        waterInStock += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milkInStock += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeansInStock += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cupsInStock += scanner.nextInt();
        System.out.println("");

        machineInStock();
    }

    private static void take() {
        System.out.println("I gave you $" + moneyInStock);
        moneyInStock = 0;
        System.out.println("");
        machineInStock();
    }

    private static void machineInStock() {
        System.out.println("The coffee machine has:\n" +
                waterInStock + " ml of water\n" +
                milkInStock + " ml of milk\n" +
                coffeeBeansInStock + " g of coffee beans\n" +
                cupsInStock + " disposable cups\n" +
                "$" + moneyInStock + " of money\n");
    }

}
