import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSum {

    @Test
    public void passTest(){
        Assert.assertEquals(true,true);
    }

    @Test
    public void failTest(){
        Assert.assertEquals(false,true);
    }
}
