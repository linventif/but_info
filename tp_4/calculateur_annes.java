class calcul_par_anne extends Program{
    boolean bissextile(int annee){
        return (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;
    }
    String mois_jour_saison(int annee, int mois){
        int jours = 0;
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10){
            jours = 31;
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11){
            jours = 30;
        } else {
            if (bissextile(annee)){
                jours = 29;
            } else {
                jours = 28;
            }
        }
        return ("Le mois " + mois + " a " + jours + " jours");
    }
    void algorithm(){
        print(" -> ");
        int annee = readInt();
        for (int i = 1; i < 12; i++) {
            println(mois_jour_saison(annee, i));
        }
    }
}