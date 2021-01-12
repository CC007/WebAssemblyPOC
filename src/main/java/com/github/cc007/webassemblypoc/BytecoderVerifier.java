package com.github.cc007.webassemblypoc;

import java.math.BigInteger;

public class BytecoderVerifier {

    public static void main(String[] args) {
        booleanVerifier();
        System.out.println(" ");
        integerVerifier();
        System.out.println(" ");
        longVerifier();
        System.out.println(" ");
        bigIntegerVerifier();
    }

    private static void booleanVerifier() {
        System.out.println("booleans: ");

        System.out.print("\"true\".equals(Boolean.toString(true)): ");
        assertEquals("true", Boolean.toString(true));

        System.out.print("\"true\".equals(\"\" + true): ");
        assertEquals("true", "" + true);

        System.out.print("\"false\".equals(Boolean.toString(false)): ");
        assertEquals("false", Boolean.toString(false));

        System.out.print("\"false\".equals(\"\" + false): ");
        assertEquals("false", "" + false);

        System.out.print("\"true\".equals(\"\" + (true || false)): ");
        assertEquals("true", "" + (true || false));

        System.out.print("\"false\".equals(\"\" + (true && false)): ");
        assertEquals("false", "" + (true && false));

        System.out.print("\"true\".equals(\"\" + (true | false)): ");
        assertEquals("true", "" + (true | false));

        System.out.print("\"false\".equals(\"\" + (true & false)): ");
        assertEquals("false", "" + (true & false));

        System.out.print("\"false\".equals(\"\" + !true): ");
        assertEquals("false", "" + !true);
    }

    private static void integerVerifier() {
        System.out.println("integers:");

        System.out.print("\"0\".equals(Integer.toString(0)): ");
        assertEquals("0", Integer.toString(0));

        System.out.print("\"0\".equals(\"\" + 0): ");
        assertEquals("0", "" + 0);

        System.out.print("\"1\".equals(\"\" + 1): ");
        assertEquals("1", "" + 1);

        System.out.print("\"2\".equals(Integer.toString(1+1)): ");
        assertEquals("2", Integer.toString(1+1));

        System.out.print("\"2\".equals(\"\" + (1+1)): ");
        assertEquals("2", "" + (1+1));

        System.out.print("\"4\".equals(\"\" + (2*2)): ");
        assertEquals("4", "" + (2*2));

        System.out.print("\"20\".equals(Integer.toString(32, 16)): ");
        assertEquals("20", Integer.toString(32, 16));
    }

    private static void longVerifier() {
        System.out.println("longs:");

        System.out.print("\"0\".equals(Long.toString(0L)): ");
        assertEquals("0", Long.toString(0L));

        System.out.print("\"0\".equals(\"\" + 0L): ");
        assertEquals("0", "" + 0L);

        System.out.print("\"1\".equals(\"\" + 1L): ");
        assertEquals("1", "" + 1L);

        System.out.print("\"2\".equals(Long.toString(1L+1L)): ");
        assertEquals("2", Long.toString(1L+1L));

        System.out.print("\"2\".equals(\"\" + (1L+1L)): ");
        assertEquals("2", "" + (1L+1L));

        System.out.print("\"4\".equals(\"\" + (2L*2L)): ");
        assertEquals("4", "" + (2L*2L));

        System.out.print("\"20\".equals(Long.toString(32, 16)): ");
        assertEquals("20", Long.toString(32L, 16));
    }

    private static void bigIntegerVerifier() {
        System.out.println("BigIntegers:");

        System.out.print("\"0\".equals(\"\" + BigInteger.ZERO.longValue()): ");
        assertEquals("0", "" + BigInteger.ZERO.longValue());

        System.out.print("\"1\".equals(\"\" + BigInteger.ONE.longValue()): ");
        assertEquals("1", "" + BigInteger.ONE.longValue());

        System.out.print("\"2\".equals(\"\" + BigInteger.TWO.longValue()): ");
        assertEquals("2", "" + BigInteger.TWO.longValue());

        System.out.print("\"10\".equals(\"\" + BigInteger.TEN.longValue()): ");
        assertEquals("10", "" + BigInteger.TEN.longValue());

        System.out.print("\"15\".equals(\"\" + BigInteger.valueOf(15).longValue()): ");
        assertEquals("15", "" + BigInteger.valueOf(15).longValue());

        System.out.print("\"100\".equals(\"\" + BigInteger.valueOf(100).longValue()): ");
        assertEquals("100", "" + BigInteger.valueOf(100).longValue());

        System.out.print("\"1000000000000000000\".equals(\"\" + BigInteger.valueOf(1000000000000000000L).longValue()): ");
        assertEquals("1000000000000000000", "" + BigInteger.valueOf(1000000000000000000L).longValue());

        System.out.print("\"1000000000000000000\".equals(\"\" + BigInteger.valueOf(0xde0b6b3a7640000L).longValue()): ");
        assertEquals("1000000000000000000", "" + BigInteger.valueOf(0xde0b6b3a7640000L).longValue());

        System.out.print("\"0\".equals(\"\" + BigInteger.ZERO): ");
        assertEquals("0", "" + BigInteger.ZERO);

        System.out.print("\"1\".equals(\"\" + BigInteger.ONE): ");
        assertEquals("1", "" + BigInteger.ONE);

        System.out.print("\"2\".equals(\"\" + BigInteger.TWO): ");
        assertEquals("2", "" + BigInteger.TWO);

        System.out.print("\"10\".equals(\"\" + BigInteger.TEN): ");
        assertEquals("10", "" + BigInteger.TEN);

        System.out.print("\"15\".equals(\"\" + BigInteger.valueOf(15)): ");
        assertEquals("15", "" + BigInteger.valueOf(15));

        System.out.print("\"100\".equals(\"\" + BigInteger.valueOf(100)): ");
        assertEquals("100", "" + BigInteger.valueOf(100));

        System.out.print("\"1000000000000000000\".equals(\"\" + BigInteger.valueOf(1000000000000000000L)): ");
        assertEquals("1000000000000000000", "" + BigInteger.valueOf(1000000000000000000L));

        System.out.print("\"1000000000000000000\".equals(\"\" + BigInteger.valueOf(0xde0b6b3a7640000L)): ");
        assertEquals("1000000000000000000", "" + BigInteger.valueOf(0xde0b6b3a7640000L));

        System.out.print("\"de0b6b3a7640000\".equals(\"\" + BigInteger.valueOf(0xde0b6b3a7640000L).toString(16)): ");
        assertEquals("de0b6b3a7640000", "" + BigInteger.valueOf(0xde0b6b3a7640000L).toString(16));
    }

    private static void assertEquals(String expected, String actual){
        System.out.println(expected.equals(actual));
        if(!expected.equals(actual)){
            System.out.println("----------------------------------------------");
            System.out.println("              Assertion error!");
            System.out.println("\"" + expected + "\" expected, but got \"" + actual + "\"");
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        }
    }
}
