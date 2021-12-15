import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ManualComputerTest {
    /*
     * It is possible to avoid Mockito Annotations and the MockitoExtension and dependence junit-mockito
     */

    Calculator calculator = mock(Calculator.class);

    Computer computer;

    @BeforeEach
    void setUp(){
        computer = new Computer(calculator);
    }

    @Test
    @DisplayName("Should return five when given five and five")
    void shouldReturnFiveWhenGivenFiveAndFive(){
        when(calculator.divide(10,2)).thenReturn(5.0);
        when(calculator.add(5,5)).thenReturn(10);

        assertEquals(5,computer.average(5,5));
        verify(calculator,times(1)).add(5,5);
    }

}

