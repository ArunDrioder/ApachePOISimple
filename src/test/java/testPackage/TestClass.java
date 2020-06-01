package testPackage;

import utilities.Xls_Reader;

public class TestClass
{
    public static void main (String[] args)
    {
        Xls_Reader reader = new Xls_Reader("C:\\Backup\\Selenium - Workspace\\IdeaProjects\\ApachePOISimple\\src\\test\\java\\testData\\dataSheet.xlsx");
        int rowCount = reader.getRowCount("RegData");
        System.out.println("The Count of the row is :" +rowCount);

        for (int rowNUm =2; rowNUm<=rowCount; rowNUm++)
        {
            System.out.println("~~~~~~~~~~");
            System.out.println("The First Name is :" +reader.getCellData("RegData","firstname",rowNUm));
            System.out.println("The Last Name is :" +reader.getCellData("RegData","lastname",rowNUm));
            System.out.println("The Email is :" +reader.getCellData("RegData","email",rowNUm));
            System.out.println("The First Name is :" +reader.getCellData("RegData","phone",rowNUm));
        }



    }
}
