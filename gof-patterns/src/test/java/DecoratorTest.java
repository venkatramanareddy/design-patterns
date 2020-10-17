import com.venkat.learn.gofpatterns.structural.decorator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void ShapeDecoratorTest(){
        Shape shape = new Circle();
        ShapeDecorator shapeDecorator = new ShapeDecorator(shape) {};
        shapeDecorator.Draw();
    }

    @Test
    public void RedShapeDecoratorTest(){
        Shape shape = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(shape);
        redShapeDecorator.Draw();
    }

    @Test
    public void BrownShapeDecoratorTest(){
        Shape shape = new Rectangle();
        BrownShapeDecorator brownShapeDecorator = new BrownShapeDecorator(shape);
        brownShapeDecorator.Draw();
    }
}
