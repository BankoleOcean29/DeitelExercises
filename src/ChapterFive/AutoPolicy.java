package ChapterFive;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    public boolean isNotAFaultState(){
        boolean faultState;

        switch (getState())
        {
            case "MA": case "NJ": case "NY": case "PA":
                faultState = true;
                break;
            default:
                faultState = false;
                break;
        }
        return faultState;
    }


}
