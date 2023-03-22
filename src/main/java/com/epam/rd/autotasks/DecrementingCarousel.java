package com.epam.rd.autotasks;

public class DecrementingCarousel {

    private int capacity;
    protected int[] contain;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.contain = new int[capacity];
    }

    public boolean addElement(int element){
        
         int number = contain.length;

        if (element > 0 && capacity > 0 && !isAlreadyRun) { 
            contain[number-capacity] = element;
            capacity--;

            return true;
        } else {
            return false;
        }
    }

     
    protected boolean isAlreadyRun = false;
    
    public CarouselRun run() {
        
        if (!isAlreadyRun) {
            isAlreadyRun = true;
            return new CarouselRun(contain, false);
        } else {
            return null;
        }        
    }

     public int getCapacity() {
        return capacity;
    }

    public int[] getContain() {
        return contain;
    }

    public int getElement(int in){
        return contain [in];
    }

    public int getLength(){
        return contain.length;
    }
}
