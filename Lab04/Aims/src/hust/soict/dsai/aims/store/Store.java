package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
public class Store {
    private static int itemsNumber = 0;
    private final static int totalCapacity = 100;
    private static ArrayList<Media> itemsInStore = new ArrayList<Media>(totalCapacity);

    
    public void addMedia(Media media) {
    	if (! itemsInStore.contains(media)) {
    		// if media not in store
    		itemsInStore.add(media);
    	}
    }
    
    public void removeMedia(Media media) {
    	if (itemsInStore.contains(media)) {
    		//when the item in the store
    		itemsInStore.remove(media);
    	}
    }
    
//    public DigitalVideoDisc[] getItems() {
//        return itemsInStore;
//    }
    
    
    
    public int getItemsNumber() {
        return itemsNumber;
    }
}

