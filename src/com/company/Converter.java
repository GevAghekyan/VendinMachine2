package com.company;

import com.company.types.CategoryType;
import com.company.types.ProductType;

public class Converter {

    public static Command convertInputToCommand(String input) {
        Command command = new Command();
        String[] split = input.split(":");
        command.setQuantity(Integer.parseInt(split[2]));
        if (split[0].equals("A")) {
            command.setCategoryType(CategoryType.DRINKS);
            if (split[1].equals("1")) {
                command.setProductType(ProductType.COCACOLA);
            } else if (split[1].equals("2")) {
                command.setProductType(ProductType.FANTA);
            } else if (split[1].equals("3")) {
                command.setProductType(ProductType.SPRITE);
            }
        } else if (split[0].equals("B")) {
            command.setCategoryType(CategoryType.CHOCOLATES);
            if (split[1].equals("1")) {
                command.setProductType(ProductType.MARS);
            } else if (split[1].equals("2")) {
                command.setProductType(ProductType.SNICKERS);
            } else if (split[1].equals("3")) {
                command.setProductType(ProductType.TWIX);
            }
        } else if (split[0].equals("C")) {
            command.setCategoryType(CategoryType.CHIPS);
            if (split[1].equals("1")) {
                command.setProductType(ProductType.LAYS);
            } else if (split[1].equals("2")) {
                command.setProductType(ProductType.PRINGLES);
            } else if (split[1].equals("3")) {
                command.setProductType(ProductType.DORITOS);
            }

        }
        return command;
    }
}
