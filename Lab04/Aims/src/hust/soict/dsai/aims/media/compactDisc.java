package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class compactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String director;
	public compactDisc() {
		// TODO Auto-generated constructor stub
		super();

	}
	public String getDirector() {
		return director;
	}
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track targetTrack) {
		if (!tracks.contains(targetTrack)) {
			tracks.add(targetTrack);
		}
	} 
	
	public void removeTrack(Track targetTrack) {
		if (tracks.contains(targetTrack)) {
			tracks.remove(targetTrack);
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track track: tracks) {
			totalLength = totalLength + track.getLength();
		}
		return totalLength;
	}
	
	public void play() {
		for (Track track: tracks) {
			track.play();
		}
	}

	
	
	
}






