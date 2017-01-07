package com.lyx;

import com.lyx.iface.Instrument;

/**
 * Created by JackJudy on 2017/1/4.
 */
public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
