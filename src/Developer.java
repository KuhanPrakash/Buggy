public class Developer {

    private int devID;
    private String devName;
    private int devMobile;
    private String devEmail;
    private String devUsername;



    //default constructor
    public Developer(){

        //addDeveloepr()

        //deleteDeveloper()

        //editDeveloper()

        //updateDeveloper()

        //saveDeveloper()

        //searchDeveloper()


    }
    //ADD DEV
    public void addDev(int memberId){
        Database newConnection = new Database();

        try{
        newConnection.addDeveloper(memberId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //delete developer
    public void deleteDev(int memberId){
        Database newConnection = new Database();

        try{
            newConnection.deleteDeveloper(memberId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
