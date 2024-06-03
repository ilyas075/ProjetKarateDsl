import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ApiTestRunner {
    @Test
    public  void testParallel(){

        //Pour lancer un seul test avec le nom de tag
        //Results results = Runner.path("classpath:features").tags("montag").parallel(1);

        Results results = Runner.path("classpath:features").parallel(1);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

}
