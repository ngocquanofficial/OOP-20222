package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected int length;
	private String director;
	
	public int getLength() {
		return length;
	}
	
	public String getDirector() {
		return director;
	}


	public Disc(String title, String category, float cost ) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
	}
	
	public Disc() {
		super();
	}
}
