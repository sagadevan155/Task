package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //To File Reading & Store In ArrayList

        BufferedReader br = new BufferedReader(new FileReader("C:\\student.txt"));
        List<StudentData> list = new ArrayList<StudentData>();
        String line = br.readLine();
        while (line != null)
        {
            list.add(new StudentData(line));
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        System.out.println("\n");

        //To Print File Reading List

        StudentData sd=new StudentData();
        sd.header();

        for (StudentData studentData:list )

        {
            studentData.show();

        }
        System.out.println("\n");


        //To print Student Mark List

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = Integer.parseInt(sc.nextLine());
        sd.header();
        for (StudentData studentData : list)
        {
            if (studentData.Student_Totalmarks <= marks )
            {
                studentData.show();
            }
        }
        System.out.println("\n");

        //To Print Dept List

        System.out.println("Enter department:");
        String dept = sc.nextLine();
        sd.header();
        for (StudentData studentData : list)
        {
            if (studentData.Student_Dept.equals(dept))
            {
                studentData.show();
            }
        }
    }
}
