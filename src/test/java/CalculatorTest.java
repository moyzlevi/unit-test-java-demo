import org.junit.jupiter.api.*;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void additionTest(){assertEquals(2,calculator.add(1,1));}

    @Test
    void subctractTest(){assertEquals(1,calculator.subtract(3,2));}

    @BeforeEach // O método deve ser executado antes de cada teste
    void setUp(){}

    @AfterEach // O método deve ser executado depois de cada teste
    void afterEach(){}

    @AfterAll // O método deve ser executado depois de todos os testes
    void afterAll(){}


}
