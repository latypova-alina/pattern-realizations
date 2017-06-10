/**
 * Created by alina on 10.06.17.
 */
public class AbstractFactoryApp {
    public static void main (String[] args){
        DeviceFactory deviceFactory = getDeviceFactoryByLanguage("ru");
        Mouse m = deviceFactory.getMouse(); //все строки ниже не меняются, гибко гибко
        Keyboard k = deviceFactory.getKeyboard();

        m.click();
        k.print();

    }
    public static DeviceFactory getDeviceFactoryByLanguage(String lang){
        if (lang.equals("ru")){
            return new RuDeviceFactory();
        }
        else if (lang.equals("en")){
            return new EnDeviceFactory();
        }
        throw new RuntimeException("такой язык не поддерживается");
    }
}
interface Mouse{
    void click();
    void dbclick();
    void scroll(int direction);
}

interface Keyboard{
    void print();
    void println();
}

interface DeviceFactory{ //абстрактная фабрика
    Mouse getMouse();
    Keyboard getKeyboard();
}
class RuMouse implements Mouse{

    @Override
    public void click() {
        System.out.println("Щелчок");
    }

    @Override
    public void dbclick() {
        System.out.println("Двойной щелчок");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Скролим вверх");
        }
        else if (direction < 0){
            System.out.println("Скролим вниз");
        }
        else {
            System.out.println("Не скролим");
        }
    }
}
class RuKeyboard implements Keyboard{

    @Override
    public void print() {
        System.out.println("Печатаем строку");
    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с переводом строки");
    }
}
class EnMouse implements Mouse{

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void dbclick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Scroll up");
        }
        else if (direction < 0){
            System.out.println("Scroll down");
        }
        else {
            System.out.println("No scroll");
        }
    }
}
class EnKeyboard implements Keyboard{

    @Override
    public void print() {
        System.out.println("Print line");
    }

    @Override
    public void println() {
        System.out.println("Print new line");
    }
}

class RuDeviceFactory implements DeviceFactory{

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }
}
class EnDeviceFactory implements DeviceFactory{

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }
}



