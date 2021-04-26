package Eyad;

//import resturant.*;
import java.sql.*;
import java.util.*;

public class Employee1 extends Connection implements Database
{

    Scanner input = new Scanner(System.in);

    public Employee1()
    {
        super ( "jdbc:sqlserver://LAPTOP-44FPCAB3;databaseName=PL_Resturant;" , "Eslamer" , "01120573331");
    }

    /*
    public boolean Employ(String a[])
    {
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            System.out.println("connected");
            String sql = "insert into Employee(EmployeeId,Name,Phone,Gender,Email,Age,NumberOfHome,Street,Country,City,BranchName,BranchId,Salary)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            //--checking---------------------
            statement.setString(1, a[0]);
            statement.setString(2, a[1]);
            statement.setString(3, a[2]);
            statement.setString(4, a[3]);
            statement.setString(5, a[4]);
            statement.setString(6, a[5]);
            statement.setString(7, a[6]);
            statement.setString(8, a[7]);
            statement.setString(9, a[8]);
            statement.setString(10, a[9]);
            statement.setString(11, a[10]);
            statement.setString(12, a[11]);
            statement.setString(13, a[12]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
            c.close();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            return false;

        }
        return false;
    }

    public boolean UpdateRow(String a[])
    {
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "update Employee set EmployeeId=?,Name=?,Phone=?,Gender=?,Email=?,Age=?,NumberOfHome=?,Street=?,Country=?,City=?,BranchName=?,BranchId=?,Salary=?" + " where EmployeeId=" + a[0];
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, a[0]);
            statement.setString(2, a[1]);
            statement.setString(3, a[2]);
            statement.setString(4, a[3]);
            statement.setString(5, a[4]);
            statement.setString(6, a[5]);
            statement.setString(7, a[6]);
            statement.setString(8, a[7]);
            statement.setString(9, a[8]);
            statement.setString(10, a[9]);
            statement.setString(11, a[10]);
            statement.setString(12, a[11]);
            statement.setString(13, a[12]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
            c.close();
        }
        catch (Exception e)
        {
            return false;

        }
        return false;
    }

    public String[] SelectRow(String Id)
    {
        String[] a = new String[13];
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "select*from Employee where EmployeeId=" + Id;
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                a[0] = result.getString("EmployeeId");
                a[1] = result.getString("Name");
                a[2] = result.getString("Phone");
                a[3] = result.getString("Gender");
                a[4] = result.getString("Email");
                a[5] = result.getString("Age");
                a[6] = result.getString("NumberOfHome");
                a[7] = result.getString("Street");
                a[8] = result.getString("Country");
                a[9] = result.getString("City");
                a[10] = result.getString("BranchName");
                a[11] = result.getString("BranchId");
                a[12] = result.getString("Salary");
            }
        }
        catch (Exception e)
        {
            a[0] = "0";
            return a;
        }
        return a;
    }

    public void Delete(String Id)
    {
        try
        {
           java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "delete from Employee where EmployeeId=" + Id;
            Statement statement = c.createStatement();
            statement.executeUpdate(sql);
        }
        catch (Exception e)
        {
            System.out.println("Error:" + e.toString());
        }

    }

    public ArrayList<String> DisplayEmployeeTable()
    {
        ArrayList<String> list = new ArrayList<>();
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "select *from Employee";
            Statement statement = c.createStatement();
            ResultSet result2 = statement.executeQuery(sql);
            while (result2.next())
            {
                list.add(result2.getString("EmployeeId"));
                list.add(result2.getString("Name"));
                list.add(result2.getString("Phone"));
                list.add(result2.getString("BranchName"));
                list.add(result2.getString("Salary"));
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
        }
        return list;
    }*/
    @Override
    public ArrayList<String> Search(String search)
    {
        ArrayList<String> a=new ArrayList<>();
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "select*from Employee where EmployeeId=" + search;
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                a.add(result.getString("EmployeeId"));
                a.add(result.getString("Name"));
                a.add(result.getString("Phone"));
                a.add(result.getString("Gender"));
                a.add(result.getString("Email"));
                a.add(result.getString("Age"));
                a.add(result.getString("NumberOfHome"));
                a.add(result.getString("Street"));
                a.add(result.getString("Country"));
                a.add(result.getString("City"));
                a.add(result.getString("BranchName"));
                a.add(result.getString("BranchId"));
                a.add(result.getString("Salary"));
            }
        }
        catch (Exception e)
        {
            return a;
        }
        return a;
    }

    @Override
    public ArrayList<String> ListTable()
    {
        ArrayList<String> list = new ArrayList<>();
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "select *from Employee";
            Statement statement = c.createStatement();
            ResultSet result2 = statement.executeQuery(sql);
            while (result2.next())
            {
                list.add(result2.getString("EmployeeId"));
                list.add(result2.getString("Name"));
                list.add(result2.getString("Phone"));
                list.add(result2.getString("BranchName"));
                list.add(result2.getString("Salary"));
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
        }
        return list;
    }

    @Override
    public boolean Insert(String[] insert)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            System.out.println("connected");
            String sql = "insert into Employee(EmployeeId,Name,Phone,Gender,Email,Age,NumberOfHome,Street,Country,City,BranchName,BranchId,Salary)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            //--checking---------------------
            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);
            statement.setString(3, insert[2]);
            statement.setString(4, insert[3]);
            statement.setString(5, insert[4]);
            statement.setString(6, insert[5]);
            statement.setString(7, insert[6]);
            statement.setString(8, insert[7]);
            statement.setString(9, insert[8]);
            statement.setString(10, insert[9]);
            statement.setString(11, insert[10]);
            statement.setString(12, insert[11]);
            statement.setString(13, insert[12]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
            c.close();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            return false;

        }
        return false;
    }

    @Override
    public boolean Delete(String delete)
    {
        try
        {
           java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "delete from Employee where EmployeeId=" + delete;
            Statement statement = c.createStatement();
            statement.executeUpdate(sql);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Error:" + e.toString());
            return false;
        }
    }

    @Override
    public boolean Update(String[] update)
    {
        try
        {
            java.sql.Connection c= (java.sql.Connection) super.getConnect();
            String sql = "update Employee set EmployeeId=?,Name=?,Phone=?,Gender=?,Email=?,Age=?,NumberOfHome=?,Street=?,Country=?,City=?,BranchName=?,BranchId=?,Salary=?" + " where EmployeeId=" + update[0];
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, update[0]);
            statement.setString(2, update[1]);
            statement.setString(3, update[2]);
            statement.setString(4, update[3]);
            statement.setString(5, update[4]);
            statement.setString(6, update[5]);
            statement.setString(7, update[6]);
            statement.setString(8, update[7]);
            statement.setString(9, update[8]);
            statement.setString(10, update[9]);
            statement.setString(11, update[10]);
            statement.setString(12, update[11]);
            statement.setString(13, update[12]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
            c.close();
        }
        catch (Exception e)
        {
            return false;

        }
        return false;
    }

}
