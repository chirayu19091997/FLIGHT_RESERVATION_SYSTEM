package com.company;

public class RegularTicket {
    private String specialService;

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public RegularTicket(String specialService) {
        this.specialService = specialService;
    }

    public void updateSpecialService(String specialService){

    }
}
