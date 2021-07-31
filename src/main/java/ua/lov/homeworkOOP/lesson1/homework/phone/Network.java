package ua.lov.homeworkOOP.lesson1.homework.phone;

public class Network {
    private String name;
    private Phone[] phones = new Phone[0];

    public Network(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPhone(Phone phone) {

        if (getPhoneIntoNet(phone) != -1) {
            System.out.println(" Телефон " + phone.getNumber()+ " уже в сети  "+ name);
            return false;
        }
        Phone[] temp = new Phone[phones.length+1];
        System.arraycopy(phones,0,temp,0,phones.length);
        temp[temp.length-1] = phone;
        phones = temp;
        System.out.println(" регистрация " + phone.getNumber() + " прошла успешно ");
        return  true;
    }

    //Ищем телефон в Net
    private int getPhoneIntoNet(Phone phone) {
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getNumber() == phone.getNumber()) {
                System.out.println("Телефон в сети");
                return i;

            }
        }
        return -1;
    }

    //Ищем номер в Net
    public Phone getPhoneByNumber(String number) {

        for (Phone x : phones) {
            System.out.println(x.getNumber() + "  info    " + number );
            if (x.getNumber() == number) {
                System.out.println("Телефон " + x.toString() + " есть в сети");
                return x;
            }
        }
        System.out.println( number + " Не зарегистрироан в мобильной сети - " + name);
        return null;
    }

    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
               '}';
    }
}
