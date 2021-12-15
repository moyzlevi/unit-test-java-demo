import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AnnotationComputerTest {

    /*
    * It is possible to use Mockito Annotations with JUnit5 without the dependence
    * We just need to trigger the MockitoAnnotations.openMocks(this) method
    */

    @Mock
    Calculator calculator;
    @InjectMocks
    Computer computer;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
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

