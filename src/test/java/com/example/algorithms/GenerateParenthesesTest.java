package com.example.algorithms;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    @Test
    void testGenerateParenthesisN0() {
        List<String> res = GenerateParentheses.generateParenthesis(0);
        assertEquals(List.of(""), res);
    }

    @Test
    void testGenerateParenthesisN1() {
        List<String> res = GenerateParentheses.generateParenthesis(1);
        assertEquals(List.of("()"), res);
    }

    @Test
    void testGenerateParenthesisN3() {
        List<String> res = GenerateParentheses.generateParenthesis(3);
        // 预期 5 种： "((()))","(()())","(())()","()(())","()()()"
        assertTrue(res.contains("((()))"));
        assertTrue(res.contains("(()())"));
        assertTrue(res.contains("(())()"));
        assertTrue(res.contains("()(())"));
        assertTrue(res.contains("()()()"));
        assertEquals(5, res.size());
    }

    @Test
    void testGenerateParenthesisInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> GenerateParentheses.generateParenthesis(-1));
    }
}
