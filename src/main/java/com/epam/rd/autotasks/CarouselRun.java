package com.epam.rd.autotasks;

public class CarouselRun {
    protected int currentPosition = 0;
    protected int [] containRunning;

    public CarouselRun(int[]greenSofa) {
        this.containRunning = greenSofa;
    }

    public boolean onlyZeros (){
        for(int element: containRunning){
            if(element!=0){
               return false;}
        }

        return true;
    }

    public int next() {
         if(onlyZeros()){
            return -1;
        }


        while(containRunning[currentPosition]==0){
            currentPosition++;
            if(currentPosition==containRunning.length){
                currentPosition=0;
            }
        }

        int willReturn = containRunning[currentPosition];
        containRunning[currentPosition] = containRunning[currentPosition]/2;
        currentPosition++;

        if(currentPosition==containRunning.length){
            currentPosition=0;
        }
        return willReturn;
       
    }

    public boolean isFinished() {
        return onlyZeros();    
    }

}
