package com.company;

import com.company.products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine.getHashMapBoard());
        System.out.println(vendingMachine);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice:");
            String input = scanner.nextLine();
            Command command = new Command();
            try {
                command = Converter.validateInput(input);
            } catch (ValidateException e) {
                System.out.println(e.getMessage());
            }
            ArrayList<Product> products = vendingMachine.getProduct(command);
            boolean flag = true;
            if (products.contains(null)) {
                List<Product> available = products.subList(0, products.indexOf(null));
                System.out.println("There is available only " + available.size() + "pcs of this product!!!");
                flag = false;
                if (available.size() > 0) {
                    System.out.println("If you want to pick it enter Yes else No");
                    String string = scanner.nextLine();
                    if (string.equals("Yes")) {
                        System.out.println(products);
                    } else if (string.equals("No")) {
                        vendingMachine.getHashMapBoard().get(command.getCategoryType()).get(command.getProductType()).addAll(available);
                    }
                }
            }
            if (flag) {
                System.out.println(products);
            }
        }
    }
}
