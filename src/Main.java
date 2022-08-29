import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Term> testTermArrayList;
        Polynomial polynomial;
        Term testTerm1, testTerm2, testTerm3;
        int testCoefficient1, testCoefficient2, testCoefficient3;
        int testExponent1, testExponent2;

        //TEST
        System.out.println("""
                To test the Term and Polynomial classes, we will create, store, and display a polynomial with 3 terms.
                The first term will have a coefficient and an exponent. The second term will have a coefficient and an exponent of 1.
                The last term will be only an integer.""");
        System.out.println("To create the first term of the polynomial, you will first need to enter a coefficient and then an exponent.");
        System.out.println("Please enter a coefficient for the term:");
        testCoefficient1 = input.nextInt();
        System.out.println("Please enter an exponent for the term:");
        testExponent1 = input.nextInt();
        testTerm1 = new Term(testCoefficient1, testExponent1);
        System.out.println("For the second term of the polynomial, you will need to enter a coefficient and an exponent value of 1.");
        System.out.println("Please enter a coefficient for the term:");
        testCoefficient2 = input.nextInt();
        System.out.println("Please enter an exponent for the term (For testing purposes, enter a value of '1'):");
        testExponent2 = input.nextInt();
        testTerm2 = new Term(testCoefficient2, testExponent2);
        System.out.println("For the third term of the polynomial, you will need to enter an integer value.");
        System.out.println("Please enter an integer value for the term:");
        testCoefficient3 = input.nextInt();
        testTerm3 = new Term(testCoefficient3);
        testTermArrayList = new ArrayList<>();
        testTermArrayList.add(testTerm1);
        testTermArrayList.add(testTerm2);
        testTermArrayList.add(testTerm3);
        polynomial = new Polynomial(testTermArrayList);
        System.out.println(polynomial);
        //TEST
        //take in polynomial with 3 terms, first term has exponent, second term has exponent of 1, third term is integer.
    }
}
/*
Eric Tangedal
Homework 1 - Polynomial
CS113 - 1971
Version 1.0
8/28/2022
 */