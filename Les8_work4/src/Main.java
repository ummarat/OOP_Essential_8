/*Подивитися завдання 2. Перевизначити методи equals & hashCode у кожному класі.
* Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.*/

public class Main {
    public static void main(String[] args) {
        Device device11 = new Device("Argo", 32, "3456");
        Device device12 = new Device("Argo", 32, "3456");
        EthernetAdapter device1 = new EthernetAdapter("Kamelia", 560, "5678", 250, "try");
        Monitor device2 = new Monitor("Kamelia", 560, "5678", 45, 15);

        System.out.println(device11.equals(device12));
        System.out.println(device11.hashCode());
        System.out.println(device12.hashCode());
        System.out.println("--------------------");
        System.out.println(device1.equals(device2));
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());

    }
}