package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("C:\\input.txt"));
        List<ComplexNumberSorting> list = new ArrayList<ComplexNumberSorting>();
        String line = br.readLine();
        while (line != null)
        {
            list.add(new ComplexNumberSorting(line));
            line = br.readLine();
        }
        br.close();
        for (ComplexNumberSorting complexNumber : list)
        {
            System.out.println(complexNumber.toString());
        }

        System.out.println("sort by real");
       // List<ComplexNumberSorting> realList = new ArrayList<>(list);
        Collections.sort(list, new ComplexNumberSorting.Sortbyreal());
        System.out.println(list);



        try
        {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\output.txt"));
        bw.write("Order by real number\n");
        for (ComplexNumberSorting complexNumber : list)
        {
            bw.write(complexNumber.toString() + "\n");
        }
        bw.write("\n");
        bw.write("Order by image number\n");

            System.out.println("sort by imaginary");
            //List<ComplexNumberSorting> imageList = new ArrayList<>(list);
            Collections.sort(list, new ComplexNumberSorting.Sortbyimage());
            System.out.println(list);

        for (ComplexNumberSorting complexNumber : list)
        {
            bw.write(complexNumber.toString() + "\n");
        }
        bw.close();
    }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}