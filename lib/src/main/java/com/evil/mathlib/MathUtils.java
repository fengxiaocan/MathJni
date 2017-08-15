package com.evil.mathlib;

/**
 * The type Math utils.
 * 一个数学工具类
 */
public final class MathUtils {
    static {
        System.loadLibrary("MathUtils");
    }

    private MathUtils(){}


    /**
     * 加
     *
     * @param a the a
     * @param b the b
     *
     * @return int
     */
    public static native int add(int a, int b);

    /**
     * 减
     *
     * @param a the a
     * @param b the b
     *
     * @return int
     */
    public static native int minus(int a, int b);

    /**
     * 乘
     *
     * @param a the a
     * @param b the b
     *
     * @return int
     */
    public static native int multiply(int a, int b);

    /**
     * 除
     *
     * @param a the a
     * @param b the b
     *
     * @return int
     */
    public static native int divide(int a, int b);

    /**
     * 加
     *
     * @param a the a
     * @param b the b
     *
     * @return double
     */
    public static native double add(double a, double b);

    /**
     * 减
     *
     * @param a the a
     * @param b the b
     *
     * @return double
     */
    public static native double minus(double a, double b);

    /**
     * 乘
     *
     * @param a the a
     * @param b the b
     *
     * @return double
     */
    public static native double multiply(double a, double b);

    /**
     * 除
     *
     * @param a the a
     * @param b the b
     *
     * @return double
     */
    public static native double divide(double a, double b);


    /**
     * 加
     *
     * @param a the a
     * @param b the b
     *
     * @return float
     */
    public static native float add(float a, float b);

    /**
     * 减
     *
     * @param a the a
     * @param b the b
     *
     * @return float
     */
    public static native float minus(float a, float b);

    /**
     * 乘
     *
     * @param a the a
     * @param b the b
     *
     * @return float
     */
    public static native float multiply(float a, float b);

    /**
     * 除
     *
     * @param a the a
     * @param b the b
     *
     * @return float
     */
    public static native float divide(float a, float b);

    /**
     * 加
     *
     * @param a the a
     * @param b the b
     *
     * @return long
     */
    public static native long add(long a, long b);

    /**
     * 减
     *
     * @param a the a
     * @param b the b
     *
     * @return long
     */
    public static native long minus(long a, long b);

    /**
     * 乘
     *
     * @param a the a
     * @param b the b
     *
     * @return long
     */
    public static native long multiply(long a, long b);

    /**
     * 除
     *
     * @param a the a
     * @param b the b
     *
     * @return long
     */
    public static native long divide(long a, long b);

    /**
     * 加
     *
     * @param a the a
     * @param b the b
     *
     * @return short
     */
    public static native short add(short a, short b);

    /**
     * 减
     *
     * @param a the a
     * @param b the b
     *
     * @return short
     */
    public static native short minus(short a, short b);

    /**
     * 乘
     *
     * @param a the a
     * @param b the b
     *
     * @return short
     */
    public static native short multiply(short a, short b);

    /**
     * 除
     *
     * @param a the a
     * @param b the b
     *
     * @return short
     */
    public static native short divide(short a, short b);


    /**
     * 加
     *
     * @param a the a
     * @param b the b
     *
     * @return byte
     */
    public static native byte add(byte a, byte b);

    /**
     * 减
     *
     * @param a the a
     * @param b the b
     *
     * @return byte
     */
    public static native byte minus(byte a, byte b);

    /**
     * 乘
     *
     * @param a the a
     * @param b the b
     *
     * @return byte
     */
    public static native byte multiply(byte a, byte b);

    /**
     * 除
     *
     * @param a the a
     * @param b the b
     *
     * @return byte
     */
    public static native byte divide(byte a, byte b);
}
