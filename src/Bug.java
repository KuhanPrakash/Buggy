public class Bug {


    private String bugName;
    private int bugID;
    private int developerID;
    private int testerID;
    private int projectID;
    private String bugDescription;
    private String bugType;

    public Bug(){
        //addBug()

        //deleteBug()

        //editBug()

        //updateBug()

        //saveBug()

        //searchBug()
    }

    public void addBug(String bugName, int bugID, int DevID, int TesterID, int ProjectID, String bugDescription, String BugType){
        Database newConnect = new Database();
        newConnect.insertbug(bugName, bugID, DevID, TesterID, ProjectID, bugDescription, BugType);

    }
}
