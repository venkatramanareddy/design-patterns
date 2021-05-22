import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.venkat.learn.gofpatterns.creational.factory.*;
import org.junit.runner.RunWith;

public class Factorytest {
    FruitFactory fruitFactory;
    @BeforeEach
    void CreateFactory(){
        fruitFactory = new FruitFactory();
    }

    @Test
    void NullTest(){
        assert(fruitFactory.getFruit(null) ==  null);
    }
    @Test
    void RandomTest(){
        assert (fruitFactory.getFruit("test") == null);
    }
    @Test
    void AppleTest(){
        IFruit fruit = fruitFactory.getFruit("apple");
        assert (fruit.color() == IFruit.color_code.RED);
    }
    @Test
    void BananaTest(){
        IFruit fruit = fruitFactory.getFruit("banana");
        assert (fruit.color() == IFruit.color_code.YELLOW);
    }
    @Test
    void GrapesTest(){
        IFruit fruit = fruitFactory.getFruit("grapes");
        assert (fruit.color() == IFruit.color_code.GREEN);
    }
}

