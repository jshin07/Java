import java.util.HashMap;

public class Hashmatique{

    public static void tracks(){
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Song 1", "ABCs");
        trackList.put("Song 2", "Baa Baa Black Sheep");
        trackList.put("Song 3", "Twinkle Twinkle Little Star");
        trackList.put("Song 4", "Wheels on the bus");

        System.out.println(trackList.get("Song 1"));
        // System.out.println(trackList.entrySet());

        for(String key : trackList.keySet()){
            System.out.println(key + " : " + trackList.get(key));
        }

    }


    public static void main(String[] args) {
        Hashmatique iD= new Hashmatique();
        iD.tracks();
    }


}
