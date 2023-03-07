package org.example.Primitives;

import org.w3c.dom.ls.LSOutput;

public class DataTypes {

    public static void main(String[] args) {


/*  Generally, all the decimal values are represented in double values. In order to represent them in float values,
    we use 'f' at the end. float stores upto 6 decimal places. double stores upto 15 decimal values.

    ->  Same with integer, Integer range is 2^-31 to 2^31 - 1. If you want a long value value in this range. You have to
    specify 'l' at the end.  For ex: long ln = 234L;

    -> byte = 8bits. It stores values from -128 to 127.

    -> short = 2bytes = 16bits. It stores values from -2^15 to 2^15 - 1.

    -> int = 4bytes = 32bits. It stores value from 2^-31 to 2^31 - 1.

    ->  The Most Significant Bit(MSB) is to represent positive or negative value. 0 for positive & 1 for negative.

*/
        int a = 234;
        long ln = 23532L;
        char ch = 'd';
        float f = 23.5f;
        double d = 235.23589;
        short s = -32727;
        byte b = 127;

        System.out.println(b);

        boolean b2 = true;
        boolean b1 = false;
    }

}
