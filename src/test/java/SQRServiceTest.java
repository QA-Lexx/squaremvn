import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void calcSqrtTest() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSqrtEqualTest() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSqrtUnequalTest() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}