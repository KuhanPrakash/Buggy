import java.sql.SQLException;

public class Bug {


    private String bugName;
    private int bugID;
    private int developerID;
    private int testerID;
    private int projectID;
    private String bugDescription;
    private String bugType;
    private int x;

    public Bug(){
        //addBug()

        //deleteBug()

        //editBug()

        //updateBug()

        //saveBug()

        //searchBug()
    }
    //insert new bug into database
    // table name: tbl_bug
    //invokes database class constructor
    public void addBug(String bugName, int bugID, int DevID, int TesterID, int ProjectID, String bugDescription, String BugType){
        Database newConnect = new Database();
        try {
            newConnect.insertbug(bugName, bugID, DevID, TesterID, ProjectID, bugDescription, BugType);
        }catch(Exception e) {
            e.printStackTrace();

        }

    }

    public void deleteBug(int x){
        Database newConnection = new Database();
        newConnection.deletebug(x);
    }

    public  void setBugName(String bugName){
        this.bugName = bugName;

    }

    public String getBugName(){
        return this.bugName;
    }

    public void setBugDescription(String bugDescription){
        this.bugDescription = bugDescription;
    }

    public String getBugDescription(){
        return this.bugDescription;
    }

    public void setBugType(String bugType){
        this.bugType = bugType;
    }

    public String getBugType(){
        return this.bugType;
    }
}
