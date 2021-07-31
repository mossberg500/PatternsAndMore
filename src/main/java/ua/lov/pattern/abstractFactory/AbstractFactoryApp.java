package ua.lov.pattern.abstractFactory;


public class AbstractFactoryApp {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        TouchPad t = factory.getTouchpad();

        m.click();
        k.print();
        k.println();
        t.track(10, 35);

    }
    public static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code" + lang);
        }
    }
}

interface Mouse {
    void click();
    void dblClick();
    void scroll(int direction);
}

interface Keyboard {
    void print();
    void println();
}

interface TouchPad {
    void track(int deltaX, int deltaY);
}

//Фабрика
interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchpad();
}

class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void dblClick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0)
            System.out.println("Скроллим вверх");
        else if(direction < 0)
            System.out.println("Скроллим вниз");
        else if(direction == 0)
            System.out.println("Стоим на месте");

    }
}

class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Печатаем строку");
    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с переводом на новую");
    }
}

class RuTouchPad implements TouchPad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Передвинулись на  " + s + " пикселей" );
    }
}

class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Mouse click");
    }

    @Override
    public void dblClick() {
        System.out.println("Mouse double click");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0)
            System.out.println("Scroll Up");
        else if(direction < 0)
            System.out.println("Scroll Down");
        else if(direction == 0)
            System.out.println("No scrolling");

    }
}

class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void println() {
        System.out.println("Print Line");
    }
}

class EnTouchPad implements TouchPad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moved + " + s + " pixels");
    }
}
//реализуем сразу три фабричных метода
//Две фабрики русская и английская
class RuDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPad getTouchpad() {
        return new RuTouchPad();
    }
}
//реализуем сразу три фабричных метода
class EnDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public TouchPad getTouchpad() {
        return new EnTouchPad();
    }
}
