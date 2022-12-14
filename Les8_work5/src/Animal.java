import java.util.Objects;

public class Animal {
    private String name;
    private int old;
    private boolean tail;

    public Animal(String name, int old, boolean tail) {
        this.name = name;
        this.old = old;
        this.tail = tail;
    }

    @Override
    public String toString() {
        String v;
        if (tail == false) v = "ні";
        else v = "так";
        return "Ім'я: " + name + ", вік: " + old + ", хвіст: " + v;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        if (old != animal.old) return false;
        if (tail != animal.tail) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, tail);
    }

    /* інший спосіб перевизначення
        @Override
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tail ? 1 : 0);
        result = 31 * result + old;
        return result;
    }*/
}