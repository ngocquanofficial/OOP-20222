package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private int length;
	private String title;
	

	public Track() {
		// TODO Auto-generated constructor stub
	}


	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	
	public boolean equals(Object obj) {
		if (! (obj instanceof Track)) {
			// if object is not a Track instance
			return false;
		}
		//when obj is a Track object
		Track track = (Track) obj;
		return this.getTitle() == track.getTitle() && this.getLength() == track.getLength();
		
	}
	
	
	

}
