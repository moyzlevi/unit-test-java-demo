import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockitoExtensionComputerTest {

   /* It is possible to use Mockito Annotatios with JUnit5 with the dependence
    * testImplementation 'org.mockito:mockito-junit-jupiter:4.1.0'
    */
    @Mock
    Calculator calculator;
    @InjectMocks
    Computer computer;


    @Test
    @DisplayName("Should return five when given five and five")
    void shouldReturnFiveWhenGivenFiveAndFive(){
        when(calculator.divide(10,2)).thenReturn(5.0);
        when(calculator.add(5,5)).thenReturn(10);

        assertEquals(5,computer.average(5,5));
        verify(calculator,times(1)).add(5,5);
    }

}

