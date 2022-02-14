package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        amountOfIngredients();
    }

    public static void amountOfIngredients() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int mlOfWaterHas = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlOfMilkHas = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeansHas = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        int mlOfWater = cups * 200;
        int mlOfMilk = cups * 50;
        int coffeeBeans = cups * 15;
        int canMake = Math.min(mlOfMilkHas / 50, Math.min(mlOfWaterHas / 200, coffeeBeansHas / 15));

        if (mlOfWaterHas >= mlOfWater && mlOfMilkHas >= mlOfMilk && coffeeBeansHas >= coffeeBeans && (canMake - cups == 0)) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (canMake > 0 && canMake - cups > 0) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (canMake - cups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + canMake + " cup(s) of coffee");
        }
    }
}
