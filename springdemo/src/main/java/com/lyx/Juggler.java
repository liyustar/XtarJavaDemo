package com.lyx;

import com.lyx.exception.PerformanceException;
import com.lyx.iface.Performer;

/**
 * Created by JackJudy on 2017/1/4.
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
