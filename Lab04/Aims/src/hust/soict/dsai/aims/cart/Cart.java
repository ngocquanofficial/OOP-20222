package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;

public class Cart {
    public static final int  MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int quantity = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantity < MAX_NUMBERS_ORDERED) {
            //add disc items to the itemOrdered
            // itemOrdered has quantity element, then the quantity-th element still empty, then
            itemsOrdered[quantity] = disc; 
            //update the length of the itemsOrdered
            quantity ++;
            System.out.println("Your cart have been added.");
        }
        else {
            System.out.println("Your cart has already been fulled. Remove something before adding this Disc.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        //check for the spaces left
        if ((quantity + dvdList.length) > MAX_NUMBERS_ORDERED) {
            System.out.println("Your cart has already been fulled. Remove something before adding this Disc.");
        }
        else {
            for (DigitalVideoDisc dvd: dvdList) {
                this.addDigitalVideoDisc(dvd);
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        //check for the spaces left
        if ((quantity + 2) > MAX_NUMBERS_ORDERED) {
            System.out.println("Your cart has already been fulled. Remove something before adding this Disc.");
        }
        else {
            this.addDigitalVideoDisc(dvd1);
            this.addDigitalVideoDisc(dvd2);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = -1;
        for (int i = 0; i < quantity; i++) {
            if (itemsOrdered[i] == disc ) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Your disc have never been added to the Cart.");
        }

        else {
            for (int i = index; i < quantity - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i+1];
            }
            itemsOrdered[quantity - 1] = null;
            quantity--;
            System.out.println("Your disc have been removed.");
        }
    }

    public void cartStatus() {
        System.out.println("You have " + quantity + " DVDs in your cart");
    }

    public void cartInformation() {
        System.out.print("The cart includes ");
        for (int i = 0; i < quantity; i++) {
            System.out.print(itemsOrdered[i].getTitle() + ", ");
        }
        System.out.println("");
    }

    public float totalCost() {
        float dvdCost = 0;

        for (DigitalVideoDisc item : itemsOrdered) {
            if (item == null) {
                continue;
            }
            dvdCost = dvdCost + item.getCost();
        }
        // for (int i = 0; i < quantity; i++) {
        //     dvdCost = dvdCost + itemsOrdered[i].getCost();
        // }
        System.out.println("Total cost is: " + dvdCost);
        return dvdCost;
    }

    public void printCart() {
        float cartCost = 0;
        System.out.println("***********************CART***********************");
        //print in a for loop
        for (DigitalVideoDisc dvd: itemsOrdered) {
            if (dvd == null) {
                //due to the properties of the Cart, the remainer spaces nulls, then if dvd = null, which means the end of the DVD List.
                break;
            }
            System.out.println(dvd.toString());
            // for the case the cost is not provide
            cartCost = cartCost + dvd.getCost();
        }
        // System.out.println(cartCost);
        System.out.println("Total price of your cart is: " + cartCost);
        System.out.println("***********************CART***********************");

    }

    public void searchByID(int id) {
    boolean status = false;
        for (DigitalVideoDisc dvd: itemsOrdered ) {
            if (dvd.getId() == id) {
                //when we find the DVD
                System.out.println("Found the DVD whose ID= " + id);
                status = true;
                break;
            }

            if (status == false) {
                //which mean not exist the DVD whose id= id
                System.out.println("Can not found the DVD whose ID= " + id);
            }

        }
    }

    public void searchByTitle(String title) {
    boolean status = false;
    int count = 0;
        for (DigitalVideoDisc dvd: itemsOrdered ) {
            if (dvd.isMatch(title)) {
                //when we find the DVD
                status = true;
                count++;
            }

        //after finishing the for loop
        if (status == false) {
            //which mean not exist the DVD whose id= id
            System.out.println("Can not found the DVD whose ID= " + title);
        }
        else {
            //status = true, means we found at least 1 dvd
            System.out.println(String.format("Found %d the DVD named %s ",count, title));
        }

        }
    }

    
}


