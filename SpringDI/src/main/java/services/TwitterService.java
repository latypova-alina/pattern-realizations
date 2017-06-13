package services;

/**
 * Created by alina on 12.06.17.
 */
public class TwitterService implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
        return true;
    }
}
