import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ansk0413 on 07.10.15.
 */


public class LuckyTest
{

    @Test
    public void addSimpleZero()
    {
        Assert.assertEquals("Zero validation is not correct" , 1,LuckyLevelsCalc.LuckyCount(0) );
    }

    @Test
    public void addNegativeValue()
    {
        Assert.assertEquals("Negative validation is not passed" , 0,LuckyLevelsCalc.LuckyCount(-56) );
    }

    @Test
    public void addUpValue()
    {
        Assert.assertEquals("Up Value validation is not passed" , 0,LuckyLevelsCalc.LuckyCount(28) );
    }

    @Test
    public void addValue()
    {

        Assert.assertEquals("Lucky Level = 2 validation is not passed" ,6,LuckyLevelsCalc.LuckyCount(2) );

    }



}
