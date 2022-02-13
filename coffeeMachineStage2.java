import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        amountOfIngredients();
    }

    public static void amountOfIngredients() {
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int mlOfWater = cups * 200;
        int mlOfMilk = cups * 50;
        int coffeeBeans = cups * 15;
        System.out.println("For " + cups + " cups of coffee you will need:\n" +
                mlOfWater + " ml of water\n" +
                mlOfMilk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans");
    }
}
