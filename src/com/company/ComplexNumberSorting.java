package com.company;

import java.util.Comparator;

public class ComplexNumberSorting {

    int real;
    int image;


public ComplexNumberSorting(String input)
{
    String[] split = input.split("\\+");
    this.real=Integer.parseInt(split[0].trim());
    this.image=Integer.parseInt(split[1].trim().substring(0, split.length -1));
}

    @Override
    public String toString()

    {
        return this.real+" " + "+" + this.image+"i";
    }

    public static class Sortbyreal implements Comparator<ComplexNumberSorting>
    {

        public int compare(ComplexNumberSorting a, ComplexNumberSorting b) {

            {

                return a.real - b.real;


            }
        }
}

    static class Sortbyimage implements Comparator<ComplexNumberSorting> {
        @Override
        public int compare(ComplexNumberSorting a, ComplexNumberSorting b)
        {
            return a.image - b.image;
        }
    }
}


