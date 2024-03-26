public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent=new ConferenceEvent("E001", "AI Conference", "Pairs", "Mei Ling", 50, 2, 5, 6, 7,5);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent=new MusicConcertEvent("E001", "AI Conference", "Pairs", "Mei Ling", 70, 4, 6);
        musicConcertEvent.calculateEventCost(); 
        System.out.println(musicConcertEvent);

        PastEvents pastEvents=new PastEvents(null, null, null, false, null, null, null, null, null);
        pastEvents.getPaymentDetails();
        System.out.println(pastEvents);

    
    
    }
}

