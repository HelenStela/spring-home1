package foo.bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Elena on 29.02.2016.
 */
@Configuration
public class IdolConfig {
    @Bean
    public Poem poem(){
        return new Poem();
    }

    @Bean
    public Performer juggler5(){
        return new Juggler(3, new Poem());
    }
}
