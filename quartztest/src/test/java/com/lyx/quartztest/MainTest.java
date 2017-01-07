package com.lyx.quartztest;

import org.junit.Assert.*;
import org.junit.Test;

import java.util.UUID;

/**
 * Created by JackJudy on 2017/1/2.
 */
public class MainTest {

    @Test
    public void mainTest() {
        Main.main(new String[]{"*/5 * * * * ?", "b"});
    }

    @Test
    public void aTest() {
        String n1 = UUID.randomUUID().toString();
        String n2 = UUID.nameUUIDFromBytes("DEFAULT".getBytes()).toString();
        String rst = String.format("%s-%s", new Object[]{n2.substring(24), n1});
        System.out.println(rst);
    }

    @Test
    public void nullTest() {
        Integer k = null;
        int a = k;
        System.out.println("hello " + a);
    }

}