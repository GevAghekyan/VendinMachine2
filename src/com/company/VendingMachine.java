package com.company;

import com.company.products.*;
import com.company.types.CategoryType;
import com.company.types.ProductType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class VendingMachine {

    private HashMap<CategoryType, HashMap<ProductType, LinkedList<Product>>> hashMapBoard = new HashMap<>();

    public HashMap<CategoryType, HashMap<ProductType, LinkedList<Product>>> getHashMapBoard() {
        return hashMapBoard;
    }

    public VendingMachine() {
        LinkedList<Product> cocaColas = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            cocaColas.add(new CocaCola());
        }
        LinkedList<Product> fantas = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            fantas.add(new Fanta());
        }
        LinkedList<Product> sprites = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            sprites.add(new Sprite());
        }
        LinkedList<Product> marses = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            marses.add(new Mars());
        }
        LinkedList<Product> snickerses = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            snickerses.add(new Snickers());
        }
        LinkedList<Product> twixes = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            twixes.add(new Twix());
        }
        LinkedList<Product> layses = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            layses.add(new Lays());
        }
        LinkedList<Product> pringleses = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            pringleses.add(new Pringles());
        }
        LinkedList<Product> doritoses = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            doritoses.add(new Doritos());
        }
        HashMap<ProductType, LinkedList<Product>> drinks = new HashMap<>();
        drinks.put(ProductType.COCACOLA, cocaColas);
        drinks.put(ProductType.FANTA, fantas);
        drinks.put(ProductType.SPRITE, sprites);
        HashMap<ProductType, LinkedList<Product>> chocolates = new HashMap<>();
        chocolates.put(ProductType.MARS, marses);
        chocolates.put(ProductType.TWIX, twixes);
        chocolates.put(ProductType.SNICKERS, snickerses);
        HashMap<ProductType, LinkedList<Product>> chipses = new HashMap<>();
        chipses.put(ProductType.PRINGLES, pringleses);
        chipses.put(ProductType.DORITOS, doritoses);
        chipses.put(ProductType.LAYS, layses);
        this.hashMapBoard.put(CategoryType.DRINKS, drinks);
        this.hashMapBoard.put(CategoryType.CHOCOLATES, chocolates);
        this.hashMapBoard.put(CategoryType.CHIPS, chipses);
    }

    public ArrayList<Product> getProduct(Command command) {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < command.getQuantity(); i++) {
            Product product = hashMapBoard.get(command.getCategoryType()).get(command.getProductType()).pollFirst();
                products.add(product);
        }
        return products;
    }

}
