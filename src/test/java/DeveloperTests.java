import org.example.employee.Developer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {
    @Test
    public void testGetSound(){
        var developer = new Developer("Eric","java");

        var expected = "whoop whoop!";
        var actual = developer.getSound();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetProgrammingLanguage(){
        var developer = new Developer("Eric","java");

        var expected = "java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expected,actual);
    }
}
