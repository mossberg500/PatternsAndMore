package ua.lov.letscodestreamapi.npe14;

public class HelpFull {
    public static void demo() {
        Main some = new Main();

        try {
            some.getChild().getEnd().getData();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}

class Main {
    private Child child = new Child();

    public Child getChild() {
        return child;
    }
}

class Child {
    private End end;

    public End getEnd() {
        return end;
    }
}

class End {
    private String data;

    public String getData() {
        return data;
    }
}
