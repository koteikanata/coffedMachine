import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static int waterInStock = 400, milkInStock = 540, coffeeBeansInStock = 120,
            cupsInStock = 9, moneyInStock = 550;

    public static void main(String[] args) {
        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
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
                case "remaining":
                    remaining();
                    break;
            }
        } while (!action.equals("exit"));
    }

    private static void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selectedCoffee = scanner.nextLine();

        switch (selectedCoffee) {
            case "1": //espresso
                if (waterInStock > 249 && coffeeBeansInStock > 15) {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterInStock -= 250;
                    coffeeBeansInStock -= 16;
                    moneyInStock += 4;
                    cupsInStock -= 1;
                } else {
                    String ingredient = "";
                    if (waterInStock < 250) {
                        ingredient = "water";
                    } else {
                        ingredient = "coffee beans";
                    }
                    System.out.println("Sorry, not enough " + ingredient + "!");
                }
                break;
            case "2": // latte
                if (waterInStock > 349 && milkInStock > 74 && coffeeBeansInStock > 19) {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterInStock -= 350;
                    milkInStock -= 75;
                    coffeeBeansInStock -= 20;
                    moneyInStock += 7;
                    cupsInStock -= 1;
                } else {
                    String ingredient = "";
                    if (waterInStock < 350) {
                        ingredient = "water";
                    } else if (milkInStock < 75) {
                        ingredient = "milk";
                    } else {
                        ingredient = "coffee beans";
                    }
                    System.out.println("Sorry, not enough " + ingredient + "!");
                }
                break;
            case "3": //cappuccino
                if (waterInStock > 199 && milkInStock > 99 && coffeeBeansInStock > 11) {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterInStock -= 200;
                    milkInStock -= 100;
                    coffeeBeansInStock -= 12;
                    moneyInStock += 6;
                    cupsInStock -= 1;
                } else {
                    String ingredient = "";
                    if (waterInStock < 200) {
                        ingredient = "water";
                    } else if (milkInStock < 100) {
                        ingredient = "milk";
                    } else {
                        ingredient = "coffee beans";
                    }
                    System.out.println("Sorry, not enough " + ingredient + "!");
                }
                break;
            case "back":
                return;
        }
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
    }

    private static void take() {
        System.out.println("I gave you $" + moneyInStock);
        moneyInStock = 0;
    }


    private static void remaining() {
        System.out.println("The coffee machine has:\n" +
                waterInStock + " ml of water\n" +
                milkInStock + " ml of milk\n" +
                coffeeBeansInStock + " g of coffee beans\n" +
                cupsInStock + " disposable cups\n" +
                "$" + moneyInStock + " of money\n");
    }

}
