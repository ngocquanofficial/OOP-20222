package hust.soict.dsai.aims.media;

public class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
	public Media() {
		// TODO Auto-generated constructor stub
	}
	
    public boolean equals(Object obj){
    	if (!(obj instanceof Media)) {
    		// when the object is not a Media instance
    		return false;
    	}
    	Media media = (Media) obj;
    	
        return  this.getTitle() ==  media.getTitle();
    }

}
