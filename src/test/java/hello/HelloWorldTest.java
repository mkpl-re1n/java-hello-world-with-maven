package hello;
import org.joda.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello, World!", greeter.sayHello());
    }
}

