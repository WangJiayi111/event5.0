import java.time.LocalDate;
public class PastEvents {
    private static final double pasteventCost=10_000;
    
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
   

    public PastEvents(LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension,
            String paymentDetails, String eventID, String eventName, String eventLocation, String pointOfContact) {
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
        this.paymentDetails = paymentDetails;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
    }




    



    public LocalDate getEventStartDate() {
        return eventStartDate;
    }





    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }





    public LocalDate getEventEndDate() {
        return eventEndDate;
    }





    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }





    public static double getPasteventcost() {
        return pasteventCost;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
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








    @Override
    public String toString() {
        return "PastEvents [eventStartDate=" + eventStartDate + ", eventEndDate=" + eventEndDate + ", paymentStatus="
                + paymentStatus + ", requiresExtension=" + requiresExtension + ", paymentDetails=" + paymentDetails
                + ", eventID=" + eventID + ", eventName=" + eventName + ", eventLocation=" + eventLocation
                + ", pointOfContact=" + pointOfContact + "]";
    }




   




    




    
   


    
    
}
