package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import consumer.XMLApplication;

/**
 * Created by alina on 12.06.17.
 */
public class ClientXMLApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        XMLApplication app = context.getBean(XMLApplication.class);

        app.processMessage("Hi Pankaj", "pankaj@abc.com");

        // close the context
        context.close();
    }

}
