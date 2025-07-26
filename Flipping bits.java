public static long flippingBits(long n) {
    return ~n & 0xFFFFFFFFL;
}
/* 
The Problem
In Java, all integers (int) are signed and 32 bits. So, when you flip all bits using ~n, you may get a negative number (because Java interprets the most significant bit as the sign bit).
But the question wants you to return an unsigned 32-bit integer, which Java does not support natively.
So we simulate an unsigned 32-bit integer using a long (which is 64-bit signed in Java) and a mask.

Example: n = 9
Binary of 9 (32-bit):
00000000 00000000 00000000 00001001

Now do ~n:
11111111 11111111 11111111 11110110
This is a 32-bit signed int in Java — and it represents -10 in two's complement.

0xF= 1111 (4 bits)
0xFF= 11111111 (8 bits)
so,we use 0xFFFFFFFF(32 BITS)

L suffix--> Forces the constant to be a long literal (64-bit)

WHATS HAPPENING REALLY:

original n(long=64 bit) = 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001001

~n= 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11110110

0xFFFFFFFFL=00000000 00000000 00000000 00000000 11111111 11111111 11111111 11111111

Bitwise AND: (~n) & 0xFFFFFFFFL

11111111 11111111 11111111 11111111 11111111 11111111 11111111 11110110
00000000 00000000 00000000 00000000 11111111 11111111 11111111 11111111
-----------------------------------------------(&)
00000000 00000000 00000000 00000000 11111111 11111111 11111111 11110110

Final Decimal Value:
2^32 - 10 = 4294967296 - 10 = 4294967286
This is 4294967286 in decimal

Why use long and not int for 32-bit results?
Because Java does not have unsigned int.
To simulate a 32-bit unsigned value, we store it in a signed 64-bit long, and use a mask (0xFFFFFFFFL) to only keep the lower 32 bits.

So yes, technically it's a 64-bit result, but logically it represents a 32-bit unsigned integer.
*/