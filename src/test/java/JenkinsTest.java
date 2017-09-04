
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JenkinsTest {


    @Test
    public void jenkinsTest() {

        Evaluate evaluate = new Evaluate();
        int sum = evaluate.checkSum("1+2+3");
        assertEquals(9,sum);


    }

}
