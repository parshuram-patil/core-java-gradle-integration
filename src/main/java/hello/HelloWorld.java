package hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) throws IOException {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

		readFile();
	}

	private static void readFile() throws IOException {
		System.out.println("\n ************ Reading File ************ ");
		InputStream stream = HelloWorld.class.getResourceAsStream("/source.txt");
        
		/*System.out.println(stream != null);
        stream = HelloWorld.class.getClassLoader().getResourceAsStream("source.txt");
        System.out.println(stream != null);*/
		
		StringWriter writer = new StringWriter();
		IOUtils.copy(stream, writer, "UTF-8");
		System.out.println("Content ---> " + writer.toString());
		
	}
}
