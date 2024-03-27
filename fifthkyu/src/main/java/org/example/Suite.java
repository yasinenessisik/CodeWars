package org.example;
/*
Consider the following numbers (where n! is factorial(n)):

u1 = (1 / 1!) * (1!)
u2 = (1 / 2!) * (1! + 2!)
u3 = (1 / 3!) * (1! + 2! + 3!)
...
un = (1 / n!) * (1! + 2! + 3! + ... + n!)
Which will win: 1 / n! or (1! + 2! + 3! + ... + n!)?

Are these numbers going to 0 because of 1/n! or to infinity due to the sum of factorials or to another number?

Task
Calculate (1 / n!) * (1! + 2! + 3! + ... + n!) for a given n, where n is an integer greater or equal to 1.

Your result should be within 10^-6 of the expected one.

Remark
Keep in mind that factorials grow rather rapidly, and you need to handle large inputs.

Hint
You could try to simplify the expression.
 */
public class Suite {
    public static void main(String[] args) {
        System.out.println(going(1));
    }

    public static double going(int n) {
        double left = 1 / nestedFactorial(n);
        double right =  nestedFactorialSum(n);
        System.out.println(Double.parseDouble(String.format("%.6f",left*right)));
        return Double.parseDouble(String.format("%.6f",left*right));
    }
    public static double nestedFactorial(int n){
        if (n==1) return 1;
        return n * (nestedFactorial(n-1));
    }
    public static double nestedFactorialSum(int n){
        if (n==1) return 1;
        return nestedFactorial(n) + nestedFactorialSum(n-1);
    }
}