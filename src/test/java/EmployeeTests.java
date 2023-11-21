import org.example.Employee;
import org.example.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {

    @Test
    public void testConstructorSetName(){
        var employee = new Employee("Eric");

        var expected = "Eric";
        var actual = employee.getName();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetSound(){
        var employee = new Employee("Eric");

        var expected = "Aaow!";
        var actual = employee.getSound();

        assertEquals(expected,actual);
    }


    @Test
    void testEatFood() {

        var employee = new Employee("Eric");

        var expected = "nom nom nom";
        var actual = employee.eatFood();

        assertEquals(expected,actual);
    }
}
