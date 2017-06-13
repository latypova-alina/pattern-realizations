package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import services.EmailService;
import services.MessageService;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alina on 12.06.17.
 */

@Configuration
@ComponentScan(value={"consumer"})
public class DIConfiguration {
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}
