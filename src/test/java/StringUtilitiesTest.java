import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class StringUtilitiesTest {

    @Test(expected = IllegalArgumentException.class)
    public void nullInput() {
        StringUtilities.reverse(null);
    }

    @RunWith(Parameterized.class)
    public static class ParameterizedTestCases {
        private String input;
        private String output;

        @Parameterized.Parameters(name = "{index}: input: {0} , expected output ==> {1}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"ABCD", "DCBA"},
                    {"a", "a"},
                    {"", ""}
            });
        }

        public ParameterizedTestCases(String input, String output) {
            this.input = input;
            this.output = output;
        }

        @Test
        public void testingValidInputs() {
            String reverse = StringUtilities.reverse(input);
            Assert.assertEquals(reverse, output);
        }
    }
}