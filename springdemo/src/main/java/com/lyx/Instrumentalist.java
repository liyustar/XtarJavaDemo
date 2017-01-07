package com.lyx;

import com.lyx.exception.PerformanceException;
import com.lyx.iface.Instrument;
import com.lyx.iface.Performer;

/**
 * Created by JackJudy on 2017/1/4.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;
    private int age;

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    // 可注入song
    public void setSong(String song) {
        this.song = song;
    }

    // 可注入乐器
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
