public class Tester {


    private String testerName;
    private int testerMobile;
    private String testerEmail;
    private String testerUsername;



    public Tester(){

    }

    //addTester()

    //editTester()

    //deleteTester()

    //updateTester()

    //saveTester()

    //searchTester()

    //add tester to tbl_Tester
    public void addTester(int memberId){
        Database newConnection  = new Database();
        try{
            newConnection.addTester(memberId);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteTester(int memberId){
        Database newConnection = new Database();
        try{
            newConnection.deleteTester(memberId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public void setTesterName(String testerName){
        this.testerName = testerName;
    }

    public String getTesterName(){
        return this.testerName;

    }

    public void setTesterMobile(int testerMobile){
        this.testerMobile = testerMobile;

    }

    public int getTesterMobile(){
        return this.testerMobile;
    }

    public void setTesterEmail(String testerEmail){
        this.testerEmail = testerEmail;

    }

    public String getTesterEmail(){
        return this.testerEmail;
    }


}
