package printer;

import java.io.ByteArrayOutputStream;

public class Printer {

    public Printer(ByteArrayOutputStream out) {
        System.setOut(new java.io.PrintStream(out));
    }

    public void print(String message){
        System.out.print(message);
    }
}
