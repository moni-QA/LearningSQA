package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.DateUtils;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestNgMavenExample {

    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExample.class);

    //@Test
   // public void run(){
        //LOGGER.debug("This is debug message");
        //LOGGER.info("This is a info message");
        //LOGGER.warn("This is a warning");
        //LOGGER.error("This is an error");
        //LOGGER.fatal("This is dangerous");
   // }
   // @Test
    //public void testPropertyFile(){

       // System.out.println(ReadConfigFiles.getPropertyValues("DbName"));
       // System.out.println(ReadConfigFiles.getPropertyValues("DbUser"));
       // System.out.println(ReadConfigFiles.getPropertyValues("DbPassword"));
    //}
    @Test
    public void run() throws SQLException{

        ResultSet resultSet = SqlConnector.readData("Select * from monthly_mortgage");
        try{
            while(resultSet.next()){
                LOGGER.info("Home Price is: " + resultSet.getString("homevalue"));
                LOGGER.info("Down payment: " + resultSet.getString("downpayment"));
                LOGGER.info("Loan amount: " + resultSet.getString("loanamount"));

            }

        }
            catch(SQLException e){
                LOGGER.error("Read SQL data exception is " + e.getMessage());
            }

    }


}
