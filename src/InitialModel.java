import java.util.*;

public class InitialModel {
    public static void main(String[] args) {

        int waterNeeded = 200;
        int milkNeeded =  50;
        int coffeeNeeded = 15;

        Scanner sc = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: > ");
        int waterMl = sc.nextInt();

        System.out.print("Write how many ml of milk the coffee machine has: > ");
        int milkMl = sc.nextInt();

        System.out.print("Write how many grams of coffee beans the coffee machine has: > ");
        int coffeeGram = sc.nextInt();

        int w1 = (waterMl / waterNeeded);
        int m1 = (milkMl / milkNeeded);
        int c1 = (coffeeGram / coffeeNeeded);
        int yard = Math.min(w1, m1);
        int measure = Math.min(yard, c1);

        System.out.print("Write how many cups of coffee you will need: > ");
        int cupOfCoffee = sc.nextInt();
        System.out.println();

        if(waterMl == 0 && milkMl == 0 && coffeeGram == 0 && cupOfCoffee == 0){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(waterMl == 0 && milkMl == 0 && coffeeGram == 0 && cupOfCoffee > 0){
            System.out.println("No, I can make only "+0+" cups(s) of coffee");
        }else if(((cupOfCoffee * waterNeeded) < waterMl) && cupOfCoffee == measure){
            System.out.println("Yes, I can make that amount of coffee");
        }else if((waterMl > (cupOfCoffee * waterNeeded) && milkMl > (cupOfCoffee * milkNeeded) && coffeeGram > (cupOfCoffee * coffeeNeeded)) || cupOfCoffee < measure){
            int wMore = waterMl / waterNeeded;
            int mMore= milkMl / milkNeeded;
            int cMore = coffeeGram / coffeeNeeded;

            int mini = Math.min(wMore, mMore);
            int mini2 = Math.min(mini, cMore);

            int more = mini2 - cupOfCoffee;
            System.out.println("Yes, I can make that amount of coffee (and even "+more+" more than that)");
        }else if((waterMl < (cupOfCoffee * waterMl) || milkMl < (cupOfCoffee * milkMl) || coffeeGram < (cupOfCoffee * coffeeGram)) && cupOfCoffee > measure){
            int w = waterMl / waterNeeded;
            int m = milkMl / milkNeeded;
            int c = coffeeGram / coffeeNeeded;

            int minimum = Math.min(w, m);
            int minimum2 = Math.min(minimum, c);

            System.out.println("No, I can make only "+minimum2+" cup(s) of coffee");
        }else if((cupOfCoffee * waterMl) > waterMl && (cupOfCoffee * milkMl) > milkMl && (cupOfCoffee * coffeeGram) > coffeeGram){
            int waterMin = waterNeeded * cupOfCoffee;
            int milkMin = milkNeeded * cupOfCoffee;
            int coffeeMin = coffeeNeeded * cupOfCoffee;

            int minimumQunatity = Math.min(waterMin, milkMin);
            int minQ = Math.min(minimumQunatity, coffeeMin);

            if(waterMin == minQ){
                int waterMore = (waterMl - (waterNeeded * cupOfCoffee))/waterNeeded;
                System.out.println("Yes, I can make that amount of coffee (and even "+waterMore+" more than that)");
            }else if(milkMin == minQ){
                int milkMore = (milkMl - (milkNeeded * cupOfCoffee))/milkNeeded;
                System.out.println("Yes, I can make that amount of coffee (and even "+milkMore+" more than that)");
            }else{
                int coffeeMore = (coffeeGram - (coffeeNeeded * cupOfCoffee))/coffeeNeeded;
                System.out.println("Yes, I can make that amount of coffee (and even "+coffeeMore+" more than that)");
            }
        }else{
            System.out.println("Do Nothing Coffee Machine - No Coffee to Vend");
        }
        System.out.println();
        /*System.out.println("For "+cupOfCoffee+" cups of coffee you will requested:");
        System.out.println(cupOfCoffee * 200+"ml of water to make of your Coffee");
        System.out.println(cupOfCoffee * 50+"ml of milk to make of your Coffee");
        System.out.println(cupOfCoffee * 15+"g of coffee beans to make of your Coffee");*/
    }
}

