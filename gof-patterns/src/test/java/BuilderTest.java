import com.venkat.learn.gofpatterns.creational.builder.Meal;
import com.venkat.learn.gofpatterns.creational.builder.MealBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    MealBuilder mealBuilder;

    @BeforeEach
    public void initializeTest(){
        mealBuilder = new MealBuilder();
    }

    @Test
    public void vegMealTest(){
        Meal meal = mealBuilder.prepareVegCombo();
        assert (meal != null);
        assert (meal.getCost() == 20);
        assert (meal.getItemNames().equalsIgnoreCase ("Veg Pizza,"));
    }

    @Test
    public void nonVegMealTest(){
        Meal meal = mealBuilder.prepareNonVegCombo();
        assert (meal != null);
        assert (meal.getCost() == 22.5f);
        assert (meal.getItemNames().equalsIgnoreCase("Non Veg Pizza,"));
    }
}
