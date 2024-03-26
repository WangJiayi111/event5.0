public class MusicConcertEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musicEventCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;
    private int totalParticipants;
    private int totalEventDays;


    
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays,double merchandiseCost) {
        this.calculateEventCostObject=new CalculateEventCostClass();
        this.merchandiseCost = merchandiseCost;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    

  

    public double getConferenceEventCost() {
        return conferenceEventCost;
    }





    public void setConferenceEventCost(double conferenceEventCost) {
        this.conferenceEventCost = conferenceEventCost;
    }





    public String getEventID() {
        return eventID;
    }





    public void setEventID(String eventID) {
        this.eventID = eventID;
    }





    public String getEventName() {
        return eventName;
    }





    public void setEventName(String eventName) {
        this.eventName = eventName;
    }





    public String getEventLocation() {
        return eventLocation;
    }





    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }





    public String getPointOfContact() {
        return pointOfContact;
    }





    public void setPointOfContact(String pointOfContact) {
        this.pointOfContact = pointOfContact;
    }





    public CalculateEventCostClass getCalculateEventCostObject() {
        return calculateEventCostObject;
    }





    public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject) {
        this.calculateEventCostObject = calculateEventCostObject;
    }





    public int getTotalParticipants() {
        return totalParticipants;
    }





    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }





    public int getTotalEventDays() {
        return totalEventDays;
    }





    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
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



    public void calculateEventCost(){
        musicEventCost=calculateEventCostObject.calcualteEventCost()+(merchandiseCost*totalParticipants)*totalEventDays;
       
    }
    

    @Override
public String toString() {
    return "Conference Event details:"+"\n"+
    "Event ID:"+eventID+"\n"+
    "Event Name:"+eventName+"\n"+
    "Event Location:"+eventLocation+"\n"+
    "Total participants:"+totalParticipants+"\n"+
    "Total Conference Cost:"+musicEventCost;



}
}

