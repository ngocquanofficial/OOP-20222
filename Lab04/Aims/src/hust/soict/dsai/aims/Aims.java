package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.*;
import java.util.List;
import java.util.ArrayList;
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc firstDVD = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc secondDVD = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        compactDisc thirdDVD = new compactDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc fouthDVD = new DigitalVideoDisc("Aladin", "Animation", 18.98f);
        anOrder.addMedia(firstDVD);
        anOrder.addMedia(secondDVD);
        anOrder.addMedia(thirdDVD);
        anOrder.addMedia(fouthDVD);
        anOrder.removeMedia(fouthDVD);
        System.out.println(anOrder.totalCost());

        List<Media> checklist = new ArrayList<Media>(); 
        
        checklist.add(firstDVD);
        checklist.add(secondDVD);
        checklist.add(thirdDVD);
        checklist.add(fouthDVD);
        java.util.Collections.sort(checklist, Media.COMPARE_BY_COST_TITLE);
        for (Media m: checklist) {
        	System.out.println(m.toString());
        }
        // For the Store class
//        Store myStore = new Store();
//        myStore.addDVD(firstDVD);
//        myStore.addDVD(secondDVD);
//        myStore.addDVD(thirdDVD);
//        myStore.removeDVD(secondDVD);
//        System.out.println("Check Store class");
//        System.out.println(myStore.getItemsNumber());
//        for (DigitalVideoDisc dvd: myStore.getItems()) {
//        	if (dvd == null) {
//        		break;
//        	}
//        	System.out.print(dvd.getTitle() + " ");
//        	System.out.print(dvd.getId());
//        	System.out.println("");
//        }
//        System.out.println("Done!!!");
    }
    public static void showMenu() {
    	System.out.println("AIMS: ");
    	System.out.println("--------------------------------");
    	System.out.println("1. View store");
    	System.out.println("2. Update store");
    	System.out.println("3. See current cart");
    	System.out.println("0. Exit");
    	System.out.println("--------------------------------");
    	System.out.println("Please choose a number: 0-1-2-3");
    	
    }
    
    
}


