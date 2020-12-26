import com.venkat.learn.gofpatterns.structural.bridge.*;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    public void TetrahedronTest(){
        Shape shape = new Tetrahedron();
        assert (shape.getName().equals("Tetrahedron"));
    }
    @Test
    public void CylinderTest(){
        Shape shape = new Cylinder();
        assert (shape.getName().equals("Cylinder"));
    }
    @Test
    public void RedTetrahedron(){
        Shape shape = new Tetrahedron();
        shape.color = new RedBrush();
        assert(shape.getName().equals("RedTetrahedron"));
    }
    @Test
    public void BlueCylinder(){
        Shape shape = new Cylinder();
        shape.color = new BlueBrush();
        assert(shape.getName().equals("BlueCylinder"));
    }
}
