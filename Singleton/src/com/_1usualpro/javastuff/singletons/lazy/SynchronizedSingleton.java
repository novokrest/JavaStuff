package com._1usualpro.javastuff.singletons.lazy;

/**
 * + Lazy
 * - Low performance
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton sInstance;

    public static synchronized SynchronizedSingleton getInstance() {
        if (sInstance == null) {
            sInstance = new SynchronizedSingleton();
        }
        return sInstance;
    }
}
