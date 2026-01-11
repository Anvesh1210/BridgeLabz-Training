package com.stringbuffer;

public class StringBufferVsStringBuilder {
	private static final int ITERATIONS = 1_000_000;
    // method to test StringBuffer performance
    private static long testStringBuffer() {
        StringBuffer sb = new StringBuffer(ITERATIONS * 5);
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // method to test StringBuilder performance
    private static long testStringBuilder() {
        StringBuilder sb = new StringBuilder(ITERATIONS * 5);
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("hello");
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        long bufferTime = testStringBuffer();
        long builderTime = testStringBuilder();

        System.out.println("StringBuffer Time  : " + bufferTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");
        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster than StringBuffer");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder");
        }
    }
}
