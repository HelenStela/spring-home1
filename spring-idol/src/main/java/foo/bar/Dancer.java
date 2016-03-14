package foo.bar;

import foo.bar.Performer;

public class Dancer implements Performer {
    public Dancer() {
        System.out.println("La la la la La LA LAAAA");
    }

    public void dance(){
        System.out.println("tuc tuc tuc");
    }

    public void perform(){
        System.out.println("Dancer is coming...");
    }
}
