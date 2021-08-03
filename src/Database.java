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


    //delete bug from DB
    //insert into bug table
    public void deletebug(int bugID) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database successful.");
                String bugSql  = "DELETE FROM TBL_BUG WHERE BUG_ID = " + bugID ;
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row Deleted.");
                }

                connection.close();
                System.out.println("Connection has been closed");

            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }

    //add member into database
    //delete bug from DB
    //insert into bug table
    public void addMember(int memberID, String memberName, int memberMobile, String memberEmail, String memberUsername, String memberPosition) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database successful.");
                String bugSql  = "INSERT INTO TBL_MEMBER(MEMBER_ID, MEMBER_NAME, MEMBER_MOBILE, MEMBER_EMAIL, MEMBER_USERNAME, MEMBER_POSITION)"+
                                "VALUES (" + memberID + "," + memberName + "," + memberMobile + "," + memberEmail + "," + memberUsername + "," + memberPosition + ")";
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row inserted : "+row);
                }

                connection.close();
                System.out.println("Connection has been closed");

            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }

    //add tester into database
    public void addTester(int memberId) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database successful.");
                String bugSql  = "INSERT INTO TBL_TESTER(TESTER_ID, TESTER_NAME, TESTER_MOBILE, TESTER_EMAIL, TESTER_USERNAME, MEMBER_ID)"+
                                "SELECT MEMBER_ID, MEMBER_NAME, MEMBER_MOBILE, MEMBER_EMAIL, MEMBER_USERNAME, MEMBER_ID FROM TBL_MEMBER "+
                                "WHERE MEMBER_ID = "+memberId ;
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row inserted : "+row);
                }

                connection.close();
                System.out.println("Connection has been closed");

            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }

    //delete tester from database
    public void deleteTester( int memberId) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database successful.");
                String bugSql  = "DELETE FROM TBL_TESTER WHERE MEMBER_ID = " + memberId;
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row deleted : "+row);
                }

                connection.close();
                System.out.println("Connection has been closed");

            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }

    //delete developer from database
    public void addDeveloper( int memberId) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database successful.");
                String bugSql  = "INSERT INTO TBL_DEVELOPER(DEV_NAME, DEV_NAME, DEV_MOBILE, DEV_EMAIL, DEV_USERNAME, MEMBER_ID)"+
                                 "SELECT MEMBER_ID, MEMBER_NAME, MEMBER_MOBILE, MEMBER_EMAIL, MEMBER_USERNAME, MEMBER_ID FROM TBL_MEMBER "+
                                 "WHERE MEMBER_ID = "+memberId ;
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row inserted : "+row);
                }

                connection.close();
                System.out.println("Connection has been closed");

            } catch (SQLException e) {

                System.out.println("Connection Error!");
                e.printStackTrace();
            }
        }
    }


    //delete developer from database
    public void deleteDeveloper( int memberId) {
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Connection to database successful.");
                String bugSql  = "DELETE FROM TBL_DEVELOPER WHERE MEMBER_ID = " + memberId;
                Statement sqlStatement  = connection.createStatement();
                int row = sqlStatement.executeUpdate(bugSql);

                if(row > 0){
                    System.out.println("Row deleted : "+row);
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
