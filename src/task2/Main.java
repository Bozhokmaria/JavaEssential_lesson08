package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Price [] prices = new Price[2];


            for (int i = 0; i < prices.length; i++) {

            System.out.println("Product info ");
            String info = scanner.next();

            System.out.println("Shop info ");
            String shop = scanner.next();

            System.out.println("Product price ");
            double price = scanner.nextDouble();

            prices[i] = new Price(info, shop, price);
        }


             if (prices[0].getShop().charAt(0)>prices[1].getShop().charAt(0)) {
                 Price temp = prices[0];
                 prices[0] = prices[1];
                 prices[1] = temp;
             }

        for (Price p :prices) {
            System.out.println(p);
        }

        System.out.println("type shop name to see products there");
        String test = scanner.next();

        boolean consistShop = false;
        try {
    for (int i = 0; i < prices.length; i++) {
        if (test.equalsIgnoreCase(prices[i].getShop())) {
            System.out.println("product name - " + prices[i].getItem() + ", price " + prices[i].getPrice());
            consistShop = true;
        } else if (!consistShop){
            throw new IllegalArgumentException("Shop not exist");
        }
    }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
//Product info
//q
//Shop info
//q
//Product price
//12
//Product info
//a
//Shop info
//a
//Product price
//33
//Product a', shop='a', price=33.0 hrn
//Product q', shop='q', price=12.0 hrn
//type shop name to see products there
//a
//product name - a, price 33.0

//Product info
//q
//Shop info
//d
//Product price
//12
//Product info
//f
//Shop info
//a
//Product price
//44
//Product f', shop='a', price=44.0 hrn
//Product q', shop='d', price=12.0 hrn
//type shop name to see products there
//j
//Shop not exist