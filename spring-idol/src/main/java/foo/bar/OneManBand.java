package foo.bar;

import foo.bar.instruments.Instrument;

import java.util.Collection;

/**
 * Created by Elena on 15.02.2016.
 */
public class OneManBand implements Performer{

    Collection<Instrument> instruments;

    public Collection<Instrument> getInstruments(){
        return  instruments;
    }

    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        System.out.printf("OneMandBand's show! Wow!!");
    }
}
