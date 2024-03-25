public class MusicConcertEvent extends Event{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musicEventCost;



    
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String pointOfContact,
            double eventCost, int totalParticipants, int totalEventDays,double merchandiseCost) {
        super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
        
        this.merchandiseCost = merchandiseCost;
    }

    

  

    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }



    public double getMerchandiseCost() {
        return merchandiseCost;
    }

    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }


    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }


    @Override

    public void calculateEventCost(){
        musicEventCost=getEventCost()+(getMerchandiseCost()*getTotalParticipants())*getTotalEventDays();
    }
    

    @Override
public String toString() {
    return "Conference Event details:"+"\n"+
    "Event ID:"+getEventID()+"\n"+
    "Event Name:"+getEventName()+"\n"+
    "Event Location:"+getEventLocation()+"\n"+
    "Total participants:"+getTotalParticipants()+"\n"+
    "Total Conference Cost:"+musicEventCost;



}
}

