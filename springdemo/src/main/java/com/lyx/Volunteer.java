package com.lyx;

import com.lyx.iface.Thinker;

/**
 * Created by kkstar on 2017/1/8.
 */
public class Volunteer implements Thinker {
    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
