package com.weel.util.automationpractice;

public enum Path {
    RUTA("Rute image");
    private String value;
    private Path(String  value){
        this.value = value;
    }

    public String  returnValue(){
        return  this.value;
    }
}
