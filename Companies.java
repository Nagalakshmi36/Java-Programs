import java.io.*;
import java.util.Scanner;
interface Xcompany
{
        public void salOfX();
}
interface Ycompany
{
        public void salOfY();
}


class Company implements Xcompany,Ycompany
{
        public void salOfX()
        {
                int emphrs=8;
                int salary,emprateperhr=20;
                salary=emphrs*emprateperhr;
                System.out.println("salary of Xcompany is"+ salary);
        }
         public void salOfY()
        {
                int emphrs=6;
                int salary,emprateperhr=25;
                salary=emphrs*emprateperhr;
                System.out.println("salary of Ycompany is"+ salary);
        }

}

public class Companies
{
        public static void main(String args[])
        {
                Company c1=new Company();
                c1.salOfX();
                c1.salOfY();
        }
}

