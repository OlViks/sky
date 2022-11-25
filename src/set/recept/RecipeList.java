package pro.sky.java.src.set.recept;

import pro.sky.java.src.set.products.Product;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {

    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe (Recipe recipe) {
        if (recipe == null) {
            return;
        }
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт есть!");
        }else {
            this.recipes.add(recipe);
        }
    }

    @Override
    public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Список рецептов: ").append('\n');
            for (Recipe recipe : this.recipes) {
                stringBuilder.append(recipe).append('\n');
            }
            return stringBuilder.toString();
    }
}
