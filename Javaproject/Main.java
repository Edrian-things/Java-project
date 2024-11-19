//Edrian Badoy
//BSCS 301
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<>();
        LinkedList<String> artist = new LinkedList<>();
        LinkedList<String> playList = new LinkedList<>();

        String[] SongTitile = {"You're the Inspiration", "Having you near Me", "Every Women in the world", "On the wings of love", "When I met you"};
        for (String song: SongTitile){
            songs.add(song);
        }

        String[] ArtistName = {"Chicago", "Air Supply", "Air Supply", "Jeffrey Osborne", "Apo Hiking Society"};
        for (String artistName: ArtistName){
            artist.add(artistName);
        }
        
        for(int i = 0; i< songs.size(); i++){
            playList.add(songs.get(i) + " by " + artist.get(i));
        }

        System.out.println("Songs: " + songs);
        System.out.println("Artist: " + artist);
        System.out.println("Playlist:");
        for (String lbl : playList){
            System.out.println(lbl);
        }
    }
}