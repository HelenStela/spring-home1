package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class Entertainer {

    public Entertainer() {
    }


    Collection<Performer> performers;

    Collection<Performer> getPerformers(){
        return performers;
    }

    public void setPerformers(Collection<Performer> performers1){
        this.performers = performers1;
    }

    public void call(String bean_name, ApplicationContext context) {
        Performer performer = (Performer) context.getBean(bean_name);
        performer.perform();
    }

    public void callAll(){
        for (Performer performer: performers){
            performer.perform();
        }
    }
}
