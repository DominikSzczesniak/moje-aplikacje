package testy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    void OnePlusOneShouldEqualTwo(){
        Addition addition = new Addition();
        assertEquals(2, addition.add(1, 1));
    }

}