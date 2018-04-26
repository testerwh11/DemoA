package com.wh.maven.First;


/**
 * Unit test for simple App.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
    
    @Test
    public void testSay(){
        App app=new App();
        String content=app.say("hello maven");
        assertEquals("hello maven",content);
    }
}

