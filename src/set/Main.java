package pro.sky.java.src.set;

import pro.sky.java.src.set.multiply.MultiplicationTable;
import pro.sky.java.src.set.passport.Passport;
import pro.sky.java.src.set.passport.PassportList;
import pro.sky.java.src.set.products.Product;
import pro.sky.java.src.set.products.ProductList;
import pro.sky.java.src.set.recept.Recipe;
import pro.sky.java.src.set.recept.RecipeList;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product bread = new Product("Хлеб", 30.2f, 2);
        Product milk = new Product("Молоко", 50, 1);
        ProductList productList = new ProductList();
        productList.addProducts(bread);
        productList.addProducts(milk);
        System.out.println(productList);
        bread.setBoughtCheck();
        System.out.println(productList);

        Recipe milkBread = new Recipe("Молочный хлеб", Set.of(bread, milk));
        Recipe milkBread2 = new Recipe("Молочный хлеб", Set.of(bread, milk));
        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(milkBread);
        milkBread.getRecipePrice();
        System.out.println(recipeList);
        numbersSetRemove();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);

        Passport den = new Passport(17109,"Petrov", "Den", null, LocalDate.now());
        Passport den1 = new Passport(53561,"Troynov", "Den", null, LocalDate.now());
        Passport den2 = new Passport(56434,"Sergeev", "Den", null, LocalDate.now());
        Passport den3 = new Passport(79543,"Ivanov", "Den", null, LocalDate.now());
//        Passport noname = new Passport(041234, null, null, null, LocalDate.now() );
        PassportList passportList = new PassportList();
        passportList.addOrUpdatePassport(den);
        passportList.addOrUpdatePassport(den1);
        passportList.addOrUpdatePassport(den2);
        passportList.addOrUpdatePassport(den3);
//        passportList.addOrUpdatePassport(noname);
        System.out.println(passportList);
        System.out.println(passportList.findByNumber(17109));
//        recipeList.addRecipe(milkBread2);
//
//
//
//
//        Product milk2 = new Product("Молоко", 100, 2);
//        productList.addProducts(milk2);
//        System.out.println(productList);


    }
    private static void numbersSetRemove() {
        Set<Integer> numbers = new HashSet<>(   );
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(0, 1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

}