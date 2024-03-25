public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent=new ConferenceEvent("E001", "AI Conference", "Pairs", "Mei Ling", 50, 2, 5, 6, 7,5);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent=new MusicConcertEvent("E001", "AI Conference", "Pairs", "Mei Ling", 70, 4, 6, 7);
        musicConcertEvent.calculateEventCost(); 
        System.out.println(musicConcertEvent);


    
    
    }
}

