package org.pallavi.com.service;

public class ChickActions {
    ChickFillAService service;
    public ChickActions(ChickFillAService service){
        this.service = service;
    }

    public int getAvgFav(){
        return service.getTotalItems()/service.getFanCount();
    }
}
