package foo.bar;

/**
 * Created by etc on 20.03.2015.
 */
public class Poem {

    String text_poem;

    public Poem(String text_poem) {
        this.text_poem = text_poem;
    }

    public Poem(){}



    public void recite(){
        System.out.println("reciting cool poem");
        System.out.println(text_poem);
    }

}
