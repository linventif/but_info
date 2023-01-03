class Date {
    int jour;
    int mois;
    int annee;
}

class type extends Program{
    Date newDate(int jour, int mois, int annee) {
        Date d = new Date();
        d.jour = jour;
        d.mois = mois;
        d.annee = annee;
        return d;
    }

    String toString(Date d) {
        return d.jour+"/"+d.mois+"/"+d.annee;
    }

    void algorithm(){
        Date d = newDate(1, 1, 2018);
        print(toString(d));
    }
}