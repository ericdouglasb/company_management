import org.example.employee.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {

    Employee employee;

    @BeforeEach
    public void init() {
        employee = new Employee("Eric");
    }
    @Test

    public void testConstructorSetName(){


        var expected = "Eric";
        var actual = employee.getName();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetSound(){

        var expected = "Aaow!";
        var actual = employee.getSound();

        assertEquals(expected,actual);
    }


    @Test
    void testEatFood() {

        var expected = "nom nom nom";
        var actual = employee.eatFood();

        assertEquals(expected,actual);
    }
}
