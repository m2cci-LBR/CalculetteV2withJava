package com.calculette.test;

import java.util.ArrayList;
import java.util.List;

public  abstract class AbstractCalculator implements Observable{

    protected double result = 0;

    protected String operateur = "";

    protected String operande = "";

    private List<Observer> listObserver = new ArrayList<Observer>();

    public abstract void calcul();

    public abstract void setOperateur(String operateur);

    public abstract void setNombre(String nbre) ;

    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }

    public void notifyObserver(String str) {
        if(str.matches("^0[0-9]+"))
        for(Observer obs : listObserver)
            obs.update(str);
    }

    public void removeObserver() {
        listObserver = new ArrayList<Observer>();
    }
}

