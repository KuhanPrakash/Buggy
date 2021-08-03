public class Member {

    //this class is to obtain all member of the system regardless of profession
    private String memberName;
    private int memberID;
    private int memberMobile;
    private String memberPosition;
    private String memberUsername;


    public Member(){

        //addMember()

        //deleteMember()

        //editMember()

        //updateMember()

        //saveMember()

        //searchMember()

    }

    public void addMember(int memberID, String memberName, int memberMobile, String memberEmail, String memberUsername, String memberPosition ){
        Database newConnect = new Database();
        try {
            newConnect.addMember(memberID, memberName, memberMobile, memberEmail, memberUsername, memberPosition);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    public String getMemberName(){
        return this.memberName;
    }

    public void setMemberMobile(int memberMobile){
        this.memberMobile = memberMobile;
    }

    public int getMemberMobile(){
        return this.memberMobile;
    }

    public void setMemberUsername(String memberUsername){
        this.memberUsername = memberUsername;

    }

    public String getMemberUsername(){
        return this.memberUsername;
    }

    public void setMemberPosition(String memberPosition){
        this.memberPosition = memberPosition;
    }

    public String getMemberPosition(){
        return this.memberPosition;
    }



}
