package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.*;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc firstDVD = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc secondDVD = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc thirdDVD = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(secondDVD);
        anOrder.addMedia(firstDVD);
        anOrder.addMedia(thirdDVD);
        anOrder.removeMedia(thirdDVD);
        System.out.println(thirdDVD.getId());
        System.out.println(anOrder.totalCost());


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
        
    
}


