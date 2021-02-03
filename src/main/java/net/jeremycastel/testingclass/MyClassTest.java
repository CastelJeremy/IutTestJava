package net.jeremycastel.testingclass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyClassTest {
    @Test
    void testGetName() {
        MyClass mc = new MyClass("test");
        assertEquals("test", mc.getName());
    }

    @Test
    void testGetId() {
        MyClass mc = new MyClass("test");
        mc.setId(123);
        assertEquals(123, mc.getId());
    }
}
