package com.lyx;

import com.lyx.iface.MindReader;

/**
 * Created by kkstar on 2017/1/8.
 */
public class Magician implements MindReader {
    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
