package com.test.demo;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

public class CacheMap {
    private Map<String,String> store = new ConcurrentHashMap<>();
    private Timer timer;

    public CacheMap() {
        this(10_000);
    }

    public CacheMap(long period) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("try cleaning...");
            }
        }, 1000, period);
    }


    public void put(String key, String value) {
        if (key == null || value == null) {
            throw new NullPointerException();
        }
        store.put(key, value);
    }

    public String get(String key) {
        return store.get(key);
    }

    public String remove(String key) {
        return store.remove(key);
    }

    @Override
    public String toString() {
        return "com.test.demo.CacheMap{" +
                "store=" + store +
                '}';
    }
}
