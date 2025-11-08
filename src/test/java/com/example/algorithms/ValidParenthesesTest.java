package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    void testValidSimple() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    void testInvalid() {
        assertFalse(ValidParentheses.isValid("(]"));
        assertFalse(ValidParentheses.isValid("([)]"));
        assertFalse(ValidParentheses.isValid("]"));
    }

    @Test
    void testEmpty() {
        assertTrue(ValidParentheses.isValid(""));
    }
}
