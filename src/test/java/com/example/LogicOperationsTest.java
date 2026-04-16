package com.example;



import org.junit.Test;
import static org.junit.Assert.*;

public class LogicOperationsTest {

    @Test
    public void testAnd() {
        assertTrue(LogicOperations.andOp(true, true));
        assertFalse(LogicOperations.andOp(true, false));
    }

    @Test
    public void testOr() {
        assertTrue(LogicOperations.orOp(true, false));
        assertFalse(LogicOperations.orOp(false, false));
    }

    @Test
    public void testNot() {
        assertTrue(LogicOperations.notOp(false));
        assertFalse(LogicOperations.notOp(true));
    }
}