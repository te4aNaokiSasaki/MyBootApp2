package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    
    @Test
    public void test_taro()
    {
    String greeting = "Taro desu!";
    HelloController helloController = new HelloController();
    String actual = helloController.taro();
    assertEquals(greeting,actual);
    }
    
}
