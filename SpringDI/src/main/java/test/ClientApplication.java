package test;

import Configuration.DIConfiguration;
import consumer.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by alina on 12.06.17.
 */
public class ClientApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class); //не находит его
        context.refresh();
        Application app = context.getBean(Application.class);

        app.processMessage("Hi Pankaj", "pankaj@abc.com");

        //close the context
        context.close();
    }
}
