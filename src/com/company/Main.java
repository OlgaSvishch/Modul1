package com.company;

public class Main {

    public static void main(String[] args) {
	CofeFactory cofeFactory = new CofeFactory();

	Cofe americano = cofeFactory.getCofe(CofeTipes.AMERICANO);
	Cofe ecsprosso = cofeFactory.getCofe(CofeTipes.ECSPRESSO);
	Cofe late = cofeFactory.getCofe(CofeTipes.LATE);

	americano.getCofe();
	ecsprosso.getCofe();
	late.getCofe();
    }
}
