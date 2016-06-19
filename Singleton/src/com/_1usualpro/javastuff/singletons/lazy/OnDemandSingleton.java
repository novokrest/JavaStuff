package com._1usualpro.javastuff.singletons.lazy;

/**
 * + Lazy
 * + High performance
 * - Only for static fields
 */
public class OnDemandSingleton {

    private static class SingletonHolder {
        public final static OnDemandSingleton INSTANCE = new OnDemandSingleton();
    }

    private static OnDemandSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
