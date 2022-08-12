package parameters;

import org.testng.annotations.Test;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSqlParameters {

    @Test

    public void testDatabaseValues() throws SQLException{
        ResultSet resultSet = SqlConnector.readData("Select * from monthly_mortgage");
        try{
            while(resultSet.next()){
               System.out.println("Home Price is: " + resultSet.getString("homevalue"));
               System.out.println("Down payment: " + resultSet.getString("downpayment"));
               System.out.println("Loan amount: " + resultSet.getString("loanamount"));

            }

        }
        catch(SQLException e){
            System.out.println("Read SQL data exception is " + e.getMessage());
        }

    }
}
