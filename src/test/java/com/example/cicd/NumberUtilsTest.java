package com.example.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Zusaetzliche Tests fuer NumberUtils (Uebung 1).
 */
class NumberUtilsTest {

    @Test
    void isSpecial_multipleOfThree_returnsTrue() {
        assertTrue(NumberUtils.isSpecial(9));
    }

    @Test
    void isSpecial_nonSpecialNumber_returnsFalse() {
        assertFalse(NumberUtils.isSpecial(2));
    }

    @Test
    void isSpecial_specialLiterals_returnsTrue() {
        assertTrue(NumberUtils.isSpecial(13));
        assertTrue(NumberUtils.isSpecial(17));
    }
}
