package com.StringClassPrac;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "python";
        String s3 = new String("perl");
        s1 =s1.concat(s2);
        s3=s1.concat(s3);
        s3=s3.concat(s1);
        System.out.println(s1);
        System.out.println(s3);

    }
}
