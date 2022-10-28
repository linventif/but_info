class saissons extends Program{
    /* int nb_de_jour = 0;
    String saisonMeteorologique (int mois) {
        String saison = "error";
        int jours = 0;
        if ((mois >= 1 && mois <= 2 ) || mois == 12 ) {
            saison = "hiver";
            if (mois == 1) {
                jours = 31;
            } else if (mois == 2) {
                jours = 28;
            } else {
                jours = 31;
            }
        } else if (mois >= 3 && mois <= 5) {
            saison = "printemps";
            if (mois == 3) {
                jours = 31;
            } else if (mois == 4) {
                jours = 30;
            } else {
                jours = 31;
            }
        } else if (mois >= 6 && mois <= 8) {
            saison = "ete";
            if (mois == 6) {
                jours = 30;
            } else if (mois == 7) {
                jours = 31;
            } else {
                jours = 31;
            }
        } else if (mois >= 9 && mois <= 11) {
            saison = "automne";
            if (mois == 9) {
                jours = 30;
            } else if (mois == 10) {
                jours = 31;
            } else {
                jours = 30;
            }
        }
        for (int i = 1; i <= jours; i++) {
            return (mois + " / " + jours + " : " + saison);
        }
    //    nb_de_jour = nb_de_jour + jours;
    //    return ("" + saison + ", " + jours + " Jours");
    }
    void algorithm () {
        for (int m=0;m<=13;m=m+1){
            //println("mois " + m + " : " + saisonMeteorologique(m));
            println(saisonMeteorologique(m))
        }
    //    println("nombre de jours total : " + nb_de_jour);
    }*/

    String jour(int jour){
        String saison = "error";
        int mois = 0;
        if (jour >= 1 && jour <= 31){
            saison = "hiver";
            mois = 1;
        } else if (jour >= 32 && jour <= 59){
            saison = "hiver";
            mois = 2;
        } else if (jour >= 60 && jour <= 90){
            mois = 3;
            if (jour >= 21) {
                saison = "printemps";
            } else {
                saison = "hiver";
            }
        } else if (jour >= 91 && jour <= 120){
            mois = 4;
            saison = "printemps";
        } else if (jour >= 121 && jour <= 151){
            mois = 5;
            saison = "printemps";
        } else if (jour >= 152 && jour <= 181){
            mois = 6;
            if (jour >= 21) {
                saison = "ete";
            } else {
                saison = "printemps";
            }
        } else if (jour >= 182 && jour <= 212){
            mois = 7;
            saison = "ete";
        } else if (jour >= 213 && jour <= 243){
            mois = 8;
            saison = "ete";
        } else if (jour >= 244 && jour <= 273){
            mois = 9;
            if (jour >= 21) {
                saison = "automne";
            } else {
                saison = "ete";
            }
        } else if (jour >= 274 && jour <= 304){
            mois = 10;
            saison = "automne";
        } else if (jour >= 305 && jour <= 334){
            mois = 11;
            saison = "automne";
        } else if (jour >= 335 && jour <= 365){
            mois = 12;
            if (jour >= 21) {
                saison = "hiver";
            } else {
                saison = "automne";
            }
        }
        return ("" + jour + " / " + mois + " : " + saison);
    }

    void algorithm () {
        for (int j = 1 ; j <= 12; j = j + 1){
            println(jour(j));
        }
    }
}