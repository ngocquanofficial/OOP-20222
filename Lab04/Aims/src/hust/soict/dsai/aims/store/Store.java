package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    private static int itemsNumber = 0;
    private final static int totalCapacity = 100;
    private static DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[totalCapacity];
    public void addDVD(DigitalVideoDisc dvd) {
        // there are itemsNumber DVDs in the array, then we add new DVD in
        itemsInStore[itemsNumber] = dvd;
        itemsNumber ++ ;
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        // We remove the dvd by its ID
        // get the id
        int id = dvd.getId();
        // the i-th element has the id = i+1
        itemsInStore[id] = null; // remove the i+1-th element
        itemsNumber --;
    }
    public DigitalVideoDisc[] getItems() {
        return itemsInStore;
    }
    public int getItemsNumber() {
        return itemsNumber;
    }
}

