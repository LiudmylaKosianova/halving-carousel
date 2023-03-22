package com.epam.rd.autotasks;

public class CarouselRun {
    protected int currentPosition = 0;
    protected int [] containRunning;
    protected boolean isHalving;

    public CarouselRun(int[]greenSofa, boolean isHalving) {
        this.containRunning = greenSofa;
        this.isHalving= isHalving;
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
        if(isHalving){
        containRunning[currentPosition] = containRunning[currentPosition]/2;
        }else{
            containRunning[currentPosition]--;

        }
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
