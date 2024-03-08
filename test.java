import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class test {
    public static void main(String[] args) {
        generateICSFile();
    }

    public static void generateICSFile() {
        System.out.println("das ist ein Test");
        try {
            FileWriter writer = new FileWriter("event.ics");

            writer.write("BEGIN:VCALENDAR\n");
            writer.write("VERSION:2.0\n");
            writer.write("PRODID:-//Your Company//Your App//EN\n");



            writer.write("BEGIN:VEVENT\n");
            writer.write("UID:" + UUID.randomUUID() + "\n");
            writer.write("DTSTAMP:20230917T120000Z\n");
            writer.write("DTSTART:20230917T130000Z\n");
            writer.write("DTEND:20230917T140000Z\n");
            writer.write("SUMMARY:Sample Event\n");
            writer.write("LOCATION:Sample Location\n");
            writer.write("DESCRIPTION:This is a sample event description.\n");
            writer.write("END:VEVENT\n");

            writer.write("END:VCALENDAR\n");


            writer.write("BEGIN:VCALENDAR\n");
            writer.write("VERSION:2.0\n");
            writer.write("PRODID:-//Your Company//Your App//EN\n");

            writer.write("BEGIN:VEVENT\n");
            writer.write("UID:" + UUID.randomUUID() + "\n");
            writer.write("DTSTAMP:20230919T120000Z\n");
            writer.write("DTSTART:20230919T130000Z\n");
            writer.write("DTEND:20230919T140000Z\n");
            writer.write("SUMMARY:Sample Event2\n");
            writer.write("LOCATION:Sample Location2\n");
            writer.write("DESCRIPTION:This is a sample event description.2\n");
            writer.write("END:VEVENT\n");

            writer.write("END:VCALENDAR\n");

            writer.close();
            System.out.println("ICS file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
