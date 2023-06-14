package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
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
	
	public Media(String title, String category, float cost ) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		// TODO Auto-generated constructor stub
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
