package com._1usualpro.javastuff.singletons.nonlazy;

/**
 * + Simple
 * + Thread-safe
 * - Non-lazy
 */
public class StaticFieldSingleton {
    public static final StaticFieldSingleton Instance = new StaticFieldSingleton();
}
