import org.example.employee.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {
CloudDeveloper cloudDeveloper;
@BeforeEach
public void init(){
    cloudDeveloper = new CloudDeveloper("Eric", "java");
}

@Test
    public void testFixWebsite(){


        var website = new Website(false); // working = false
        cloudDeveloper.fixWebsite(website);

        var expected = true;
        var actual = website.isWorking();

        assertEquals(expected,actual);


    }

}
