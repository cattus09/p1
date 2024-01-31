package edu.escuelaing.arep.app.server;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private static ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    public static String get(String key) {
        return cache.get(key);
    }

    public static void put(String key, String value) {
        cache.put(key, value);
    }

    public static boolean containsKey(String key) {
        return cache.containsKey(key);
    }
}