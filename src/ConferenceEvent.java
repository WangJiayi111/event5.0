public class ConferenceEvent {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequire;
    private double lunchCost;
    private boolean dinnerRequire;
    private double dinnerCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;
    private int totalParticipants;
    private int totalEventDays;



    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContact,int totalParticipants,int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost, int i) {
        this.calculateEventCostObject=new CalculateEventCostClass();
        
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }




    public boolean isBreakfastRequired() {
        return breakfastRequired;
    }




    public void setBreakfastRequired(boolean breakfastRequired) {
        this.breakfastRequired = breakfastRequired;
    }




    public boolean isLunchRequire() {
        return lunchRequire;
    }




    public void setLunchRequire(boolean lunchRequire) {
        this.lunchRequire = lunchRequire;
    }




    public boolean isDinnerRequire() {
        return dinnerRequire;
    }




    public void setDinnerRequire(boolean dinnerRequire) {
        this.dinnerRequire = dinnerRequire;
    }




    public double getBreakfastCost() {
        return breakfastCost;
    }




    public void setBreakfastCost(double breakfastCost) {
        this.breakfastCost = breakfastCost;
    }




    public double getLunchCost() {
        return lunchCost;
    }




    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }




    public double getDinnerCost() {
        return dinnerCost;
    }




    public void setDinnerCost(double dinnerCost) {
        this.dinnerCost = dinnerCost;
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




public void calculateEventCost(){
    conferenceEventCost = calculateEventCostObject.calcualteEventCost() + (breakfastCost+lunchCost+dinnerCost)*totalParticipants*totalEventDays;
}



@Override
public String toString() {
    return "Conference Event details:"+"\n"+
    "Event ID:"+eventID+"\n"+
    "Event Name:"+eventName+"\n"+
    "Event Location:"+eventLocation+"\n"+
    "Total participants:"+totalParticipants+"\n"+
    "Total Conference Cost:"+conferenceEventCost;



}


    
}

