package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	public int compare(Media firstMedia, Media secondMedia) {
		int num = firstMedia.getTitle().compareTo(secondMedia.getTitle());
		if (num == 0) {
			//when two media have the same name
			if (firstMedia.getCost() > secondMedia.getCost()) {
				num = 1;
			}
			else {
				num = -1;
			}
		}
		return num;
	}

}
