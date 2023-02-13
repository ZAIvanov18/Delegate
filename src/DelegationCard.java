public class DelegationCard {
    private int delegateNumber;
    private String dateOfArrival;
    private String dateOfDeparture;

    public DelegationCard(int delegateNumber, String dateOfArrival, String dateOfDeparture) {
        this.delegateNumber = delegateNumber;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
    }

    public DelegationCard(){
        delegateNumber = 123456;
        dateOfArrival = "13/2/2023";
        dateOfDeparture = "21/2/2023";
    }

    public int getDelegateNumber() {
        return delegateNumber;
    }

    public void setDelegateNumber(int delegateNumber) {
        this.delegateNumber = delegateNumber;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "delegateNumber=" + delegateNumber +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", dateOfDeparture='" + dateOfDeparture + '\'' +
                '}';
    }
}
