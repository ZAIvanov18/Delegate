import java.util.ArrayList;
import java.util.Scanner;

public class Conference {
    private ArrayList<Delegate>delegates;
    private ArrayList<Hotel>hotels;
    private ArrayList<DelegationCard>delegationCards;

    public Conference(ArrayList<Delegate> delegates, ArrayList<Hotel> hotels, ArrayList<DelegationCard> delegationCards) {
        this.delegates = delegates;
        this.hotels = hotels;
        this.delegationCards = delegationCards;
    }

    public ArrayList<Delegate> getDelegates() {
        return delegates;
    }

    public void setDelegates(ArrayList<Delegate> delegates) {
        this.delegates = delegates;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<DelegationCard> getDelegationCards() {
        return delegationCards;
    }

    public void setDelegationCards(ArrayList<DelegationCard> delegationCards) {
        this.delegationCards = delegationCards;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "delegates=" + delegates +
                ", hotels=" + hotels +
                ", delegationCards=" + delegationCards +
                '}';
    }

    public void addElements(Delegate delegate, Hotel hotel, DelegationCard delegationCard){
        delegates.add(delegate);
        hotels.add(hotel);
        delegationCards.add(delegationCard);
    }

    public void returnInfo(ArrayList<Conference> conferences){
        for (Conference cf: conferences) {
            System.out.println(cf.toString());
        }
    }

    public void printPriceofCertainHotel(ArrayList<Hotel> hotels, Scanner sc){

    }
}
