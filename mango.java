import java.util.*;
interface Mango {
    void show();
}


class Winter implements Mango {
    public void show() {
        System.out.println("Mango in Winter");
    }
}


class Summer implements Mango {
    public void show() {
        System.out.println("Mango in Summer");
    }
}


class Test {
    public static void main(String[] args) {
        Mango w = new Winter();
        Mango s = new Summer();

        w.show();
        s.show();
    }
}
