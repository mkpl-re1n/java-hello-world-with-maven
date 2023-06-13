package hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        ("Hello, World!", greeter.sayHello());
    }
}
