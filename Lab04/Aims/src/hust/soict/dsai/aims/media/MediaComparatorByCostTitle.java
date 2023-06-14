package hust.soict.dsai.aims.media;
import java.util.*;

public class MediaComparatorByCostTitle implements Comparator<Media> {
	@Override
	public int compare(Media firstMedia, Media secondMedia) {
		float num = firstMedia.getCost() - secondMedia.getCost();
		if (num == 0) {
			//when two media have the same cost
			int newnum = firstMedia.getTitle().compareTo(secondMedia.getTitle());
			return newnum;
		}
		else {
			if (num > 0) {return 1;}
			else {return -1;}
		}
	}
		

}
