package printer;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrinterTest {

    private Printer printer;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        printer = new Printer(out);
    }

    @Test
    public void printsMessage() throws Exception {
        printer.print("foo bar");
        assertThat(out.toString(), is("foo bar"));
    }
}