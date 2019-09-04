package com.codegym;

public class Triangle {
    int a, b, c;

    Triangle( int a, int b, int c) throws IllegalTriangleException {
        if (
                !( a > 0 && b > 0 && c > 0)

                        ||

                        ((a + b <= c) || (a + c <= b) || (c + b <= a))
        )
        {
            throw new IllegalTriangleException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
}
