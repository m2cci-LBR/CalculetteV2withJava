package com.calculette.test;

public class Calculator extends AbstractCalculator {

    public void setOperateur(String ope) {
        calcul();
        this.operateur = ope;
        if (!ope.equals("=")) {
            this.operande = "";
        }
    }

    @Override
    public void setNombre(String result) {
        this.operande += result;
        notifyObserver(this.operande);
    }

    @Override
    public void calcul() {
        if (this.operateur.equals("")) {
            this.result = Double.parseDouble(this.operande);
        } else {
            if (!this.operande.equals("")) {
                if (this.operateur.equals("+"))
                    this.result += Double.parseDouble(this.operande);
                if (this.operateur.equals("-"))
                    this.result -= Double.parseDouble(this.operande);
            }
            System.out.println("Le resultat est :" + this.result);
        }

        this.operande ="";

        notifyObserver(String.valueOf(this.result));
    }
}



