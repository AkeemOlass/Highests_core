import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Highest_ScoreTest {
    //@Test
    Highest_Score test = new Highest_Score();
   int i = 0;
    public void h_score() throws Exception {
        while(i<=10){

            String s = "joe";
            Assert.assertEquals(8.0, test.H_score(s, 70, 0))
                    i++;
    }

}
}