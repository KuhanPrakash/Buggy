import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    private static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String  username = "c##test";
    private static final String password = "1234567890";

    //variable to be inserted
    String bugName;
    int bugID;
    int DevID;
    int TesterID;
    int ProjectID;
    String bugDescription;
    String BugType;

    //dafault constructor
    //used only for connection testing
    public Database() {

    }



    public void connectionTest(){
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database succesfull");

                connection.close();
                System.out.println("Connection has been closed.");
            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }


    //overload constructor
    //insert into bug table
    public void insertbug(String bugName, int bugID, int DevID, int TesterID, int ProjectID, String bugDescription, String BugType) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database succesfull");
                String bugSql  = "Insert into TBL_BUG (BUG_NAME, BUG_ID, DEV_ID, TESTER_ID, PROJECT_ID, BUG_DESCRIPTION , BUG_TYPE) " +
                        "values (" + bugName + " , " + bugID + " , " + DevID + " , " +
                                  TesterID + " , "  + ProjectID  + " , " + bugDescription + " , " + BugType + ") " ;
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row Inserted.");
                }

                connection.close();
                System.out.println("Connection has been closed");

            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }



}
