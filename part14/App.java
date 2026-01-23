package part14;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("part14/app.properties");
        props.load(fis);
        System.out.println(props.getProperty("app.name"));
        System.out.println(props.getProperty("db.url"));
        System.out.println(props.getProperty("db.username"));
    }
}
