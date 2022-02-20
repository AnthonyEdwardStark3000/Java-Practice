import java.sql.*;
public class JDBCPractice {
    public static void main(String args[]) throws SQLException
    {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
        String UserName = "student";
        String Password = "student";
        int rowsAffected;
        try
        {
    //   1. Connection to database

            myConn = DriverManager.getConnection(dbUrl,UserName, Password);
            System.out.println("Database connection Successful");

    //   2.create a statement
            myStmt = myConn.createStatement();


    //   3. Execute sql query
            myRs = myStmt.executeQuery("select * from employees");

    //   4. Process the result
    while(myRs.next())
    {
        System.out.println(myRs.getString("first_name")+","+myRs.getString("last_name"));
    }
            //Sub-problem inserting into DB

            System.out.println("Inserting data into the database ...");
            rowsAffected = myStmt.executeUpdate("insert into employees"+"(first_name, last_name, email, department, salary)"+
                    "values"+
                    "('vinayaga', 'perumal', 'vinayak108@gmail.com', 'savings', 3000000000000)");
            System.out.println("The statement has been executed and "+rowsAffected+" rows has been affected");

            // Sub-problem updating data in the database

            System.out.println("Updating values in the Database.....");
            rowsAffected = myStmt.executeUpdate("update employees"+"set first_name = 'vinayak'"+
                    "where last_name = 'perumal' and first_name = 'vinayaga'" );
            System.out.println("The statement has been executed and "+rowsAffected+" rows has been affected");

            // Sub-problem Deleting data from the database
            rowsAffected = myStmt.executeUpdate("delete from employees"+
                    "where last_name = 'perumal' and first_name = 'vinayaga'" );
            System.out.println("The statement has been executed successfully and "+rowsAffected+" rows has been deleted");


        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.err.println("An Error "+e+" has occurred");
        }
        finally
        {
            if(myRs !=null)
            {
                myRs.close();
            }
        }
    }
}
