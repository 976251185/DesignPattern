/*
MealBuilder类，预设食物套餐
 */
package BuilderPattern;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickerBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
