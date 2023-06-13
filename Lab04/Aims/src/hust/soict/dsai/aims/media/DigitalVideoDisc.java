package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    private String category;
    private String director;

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String category, String title, String director, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director,int length, float cost ){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.length = length;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }
    
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }

    public String toString() {
        return String.format("DVD - %s - %s - %s - %s - %s : %s", this.id, this.title, this.category, this.director, this.length, this.cost);
    }

    public boolean isMatch(String title) {
        return this.title == title;
    }
    
    //implement Playable interface
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    }
    
    
}



