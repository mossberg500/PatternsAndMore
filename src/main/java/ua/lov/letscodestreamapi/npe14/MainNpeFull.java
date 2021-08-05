package ua.lov.letscodestreamapi.npe14;

public class MainNpeFull {
    public static void main(String[] args) {
        HelpFull.demo();
        System.out.println(String.format("%s, %s", jdk13("some"), jdk14("some")));
    }

    public static String jdk13(Object data) {
        if (data instanceof String) {
            String knownType = (String) data;
            return knownType.toLowerCase();
        }
        return null;
    }

    public static String jdk14(Object data) {
        if (data instanceof String) {
            String knownType = (String) data;
            return knownType.toLowerCase();
        }
        return null;
    }
}

