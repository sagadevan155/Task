package Task4;

public class StudentData
{
    int Student_Rollno;
    String Student_Name;
    String Student_Dept;
    int Student_Totalmarks;
    String Student_doj;
    String Student_Doe;


    StudentData()
    {

    }


    StudentData(String str)
    {
        String[] split = str.split(",");
        this.Student_Rollno = Integer.parseInt(split[0].trim());
        this.Student_Name = split[1].trim();
        this.Student_Totalmarks= Integer.parseInt(split[2].trim());
        this.Student_Dept = split[3].trim();
        this.Student_doj=split[4].trim();
        this.Student_Doe=split[5].trim();
    }


    void header()

    {

        String head = String.format("" +
                "| ROLL.NO |\t\t" +
                "| NAME  |\t\t" +
                "| DEPT |\t" +
                "| TOTAL MARKS |\t\t" +
                "| Date Of joining |\t\t" +
                "| Date Of Ending |");

        System.out.println(head);
    }



    void show()

    {
        String dataformate = String.format("" +
                        "|  %d    |\t\t"+
                        "| %s  |\t\t" +
                        "| %s  |\t" +
                        "|     %d     |\t\t" +
                        "|    %s   |\t\t" +
                        "|   %s   |",
                Student_Rollno,
                Student_Name,
                Student_Dept,
                Student_Totalmarks,
                Student_doj,
                Student_Doe);

        System.out.println(dataformate);
    }

}
