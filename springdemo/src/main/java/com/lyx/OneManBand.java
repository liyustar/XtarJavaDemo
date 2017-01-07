package com.lyx;

import com.lyx.exception.PerformanceException;
import com.lyx.iface.Instrument;
import com.lyx.iface.Performer;

import java.util.Collection;

/**
 * Created by JackJudy on 2017/1/4.
 */
public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
