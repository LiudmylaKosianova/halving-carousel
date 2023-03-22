package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    
    @Overide
    public CarouselRun run() {
        //if(the run method has already been called earlier){return null;}
        if (!isAlreadyRun) {
            isAlreadyRun = true;
            return new CarouselRun(contain, true);
        } else {
            return null;
        }
        
    }   
}
