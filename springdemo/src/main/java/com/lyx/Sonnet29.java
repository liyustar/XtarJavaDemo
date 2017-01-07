package com.lyx;

import com.lyx.iface.Poem;

/**
 * Created by JackJudy on 2017/1/4.
 */
public class Sonnet29 implements Poem {

    public Sonnet29() {
    }

    @Override
    public void recite() {
        System.out.println("poem 1: haha xixi.");
        System.out.println("poem 2: xixi haha.");
    }
}
