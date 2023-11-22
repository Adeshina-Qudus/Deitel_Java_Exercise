package tdd;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertSame;

class GeoPoliticalZonesTest {

    @Test
    public void test(){
        String input = "Benue";
        GeoPoliticalZones output = GeoPoliticalZones.NORTH_CENTRAL;
        assertSame(output,GeoPoliticalZones.geoPoliticalResult(input));
    }
}