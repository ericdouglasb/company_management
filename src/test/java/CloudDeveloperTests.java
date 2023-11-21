import org.example.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {

    @Test
    public void testFixWebsite(){

        var cloudDeveloper = new CloudDeveloper("Eric", "java");
        var website = new Website(false); // working = false
        cloudDeveloper.fixWebsite(website);

        var expected = true;
        var actual = website.isWorking();

        assertEquals(expected,actual);


    }

}
