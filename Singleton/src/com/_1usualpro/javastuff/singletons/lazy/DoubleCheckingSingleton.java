package com._1usualpro.javastuff.singletons.lazy;

/**
 * + Lazy
 * + High performance
 * - only with JavaSDK 1.5 and higher
 */
public class DoubleCheckingSingleton {
    private static volatile DoubleCheckingSingleton sInstance;

    private static DoubleCheckingSingleton getInstance() {
        DoubleCheckingSingleton localInstance = sInstance;
        if (localInstance == null) {
            synchronized (DoubleCheckingSingleton.class) {
                localInstance = sInstance;
                if (localInstance == null) {
                    sInstance = localInstance = new DoubleCheckingSingleton();
                }
            }
        }
        return localInstance;
    }
}
