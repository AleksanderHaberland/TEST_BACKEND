package test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

public class WordTest extends TestCase {
    Word w = new Word("RADEK", "RADKE");

    @Before
    public void setUp(){
        // catch empty String like String a="";
        assertTrue(StringUtils.isNotBlank(w.getA()));
        assertTrue(StringUtils.isNotBlank(w.getB()));
    }
    @Test
    public void testTextLength(){
        assertEquals(w.getA().length(),w.getB().length());
    }
    @Test
    public void testIsTrue(){
        assertTrue(w.words(w.getA(), w.getB()));
    }
}