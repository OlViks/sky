package set;

import set.products.Product;
import set.recept.Recipe;
import set.recept.RecipeList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Product, Integer> productList = new HashMap<>();
        Product bread = new Product("Хлеб", 30.2f, 2);
        Product milk = new Product("Молоко", 50, 1);
        productList.put(milk, 1);
        productList.put(bread, 1);
        System.out.println(productList);
        bread.setBoughtCheck();
        milk.setBoughtCheck();
        System.out.println(productList);
        Map<Product, Integer> list = new HashMap<>();
        list.put(bread, 2);
        list.put(milk, 1);
        RecipeList recipeList = new RecipeList();
        Recipe milkBread = new Recipe("Молочный хлеб", Set.of(bread, milk));
        recipeList.addRecipe(milkBread);
        System.out.println(recipeList);
//        System.out.println(milkBread.getRecipePrice());
//        recipeList.addRecipe(milkBread2);
//        Product milk2 = new Product("Молоко", 100, 2);
//        productList.addProducts(milk2);
//        System.out.println(productList);

        HashMap<String, String> phone = new HashMap<>();
        phone.put("Антон Антонов", "8-921-111-11-11");
        phone.put("Виталий Витальев", "8-921-222-22-22");
        phone.put("Борис Борисов", "8-921-333-33-33");
        phone.put("Герман Германов", "8-921-444-44-44");
        phone.put("Демьян Демьянов", "8-921-555-55-55");
        phone.put("Елисей Елисеев", "8-921-666-66-66");
        phone.put("Жора Жориков", "8-921-777-77-77");
        phone.put("Зинаида Зинаидова", "8-921-888-88-88");
        phone.put("Иван Иванов", "8-921-999-99-99");
        phone.put("Йва Йванова", "8-900-000-00-00");
        phone.put("Констанитин Констанитнов", "8-900-111-11-11");
        phone.put("Леонид Леонидов", "8-900-222-22-22");
        phone.put("Михаил Михаилов", "8-900-333-33-33");
        phone.put("Николай Николаев", "8-900-444-44-44");
        phone.put("Ольга Ольгавна", "8-900-555-55-55");
        phone.put("Петр Петоров", "8-900-666-66-66");
        phone.put("Роман Романов", "8-900-777-77-77");
        phone.put("Сегрей Сергеев", "8-900-888-88-88");
        phone.put("Тимур Тимуров", "8-900-999-99-99");
        phone.put("Ульяна Ульянова", "8-921-321-48-87");


        System.out.println(phone.values());
        System.out.println(phone.get("Ольга Ольгавна"));
        System.out.println(phone.get("Сегрей Сергеев"));

        System.out.println();
        System.out.println();


        HashMap<String, List<Integer>> map = new HashMap<>();
        HashMap<String, Integer> listMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(4);
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
            list1.get(i).add((int) (Math.random() * 10));
            list1.get(i).add((int) (Math.random() * 10));
            list1.get(i).add((int) (Math.random() * 10));
            map.put("str" + i, list1.get(i));
            System.out.println("str" + "->" + list1.get(i));
            listMap.put("str" + i, list1.get(i).get(0) +
                    list1.get(i).get(1) + list1.get(i).get(2));
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("str" + i + "->" + listMap.get("str"
                    + i));
        }


        System.out.println();


    }
}