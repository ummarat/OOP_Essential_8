/*Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal
 * з ім'ям String, int віком, хвостом Boolean. У класі перевизначити метод toString,
 * щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
 * У класі Animal перевизначити методи equals & hashCode.*/

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);
        System.out.println(animal);
    }
}
