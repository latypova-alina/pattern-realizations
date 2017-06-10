import java.util.Date;

/**
 * Created by alina on 10.06.17.
 */
public class FactoryMethod {
    public static void main (String[] args){
        //WatchMaker maker = new DigitalWatchMaker();
        WatchMaker maker = getMakerByName("Rome"); //а ниже код не меняется, в этом и гибкость
        Watch watch = maker.createWatch();
        watch.showTime();

    }
    public static WatchMaker getMakerByName(String name){
        if (name.equals("digital")){
            return new DigitalWatchMaker();
        }
        else if (name.equals("rome")){
            return new RomeWatchMaker();
        }
        throw new RuntimeException("Не поддерживается версия часов");
    }
}

interface Watch {

    void showTime();
}

class DigitalWatch implements Watch{

    public void showTime(){
        System.out.println(new Date());
    }
}
class RomeWatch implements Watch{
    public void showTime() {
        System.out.println("VXX");
    }
}
interface WatchMaker {
    Watch createWatch();
}
class DigitalWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
class RomeWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
