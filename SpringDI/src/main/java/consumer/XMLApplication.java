package consumer;

import services.MessageService;

/**
 * Created by alina on 12.06.17.
 */
public class XMLApplication {
    private MessageService service;

    //constructor-based dependency injection
//	public MyXMLApplication(MessageService svc) {
//		this.service = svc;
//	}

    //setter-based dependency injection
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean processMessage(String msg, String rec) {
        // some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);
    }
}
