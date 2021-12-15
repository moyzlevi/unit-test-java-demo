import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void additionTest(){assertEquals(2,calculator.add(1,1));}

    @Test
    void subctractTest(){assertEquals(1,calculator.subtract(3,2));}

    @BeforeAll // This method should be executed before all tests
    void beforeAll(){}

    @BeforeEach // This method should be executed before each test
    void setUp(){}

    @AfterEach // This method should be executed after each test
    void afterEach(){}

    @AfterAll // This method should be executed after all tests
    void afterAll(){}




}
