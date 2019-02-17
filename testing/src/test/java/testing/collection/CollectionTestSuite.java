package testing.collection;

import org.junit.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("test for empty list");
        Assert.assertEquals(0, oddNumbersExterminator.exterminate(emptyList).size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> normalList = new ArrayList<>();
        normalList.add(4);
        normalList.add(7);
        normalList.add(8);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("test for normal list");
        Assert.assertEquals(2, oddNumbersExterminator.exterminate(normalList).size());
    }
}
