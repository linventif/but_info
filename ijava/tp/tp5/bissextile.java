class bissextile extends Program{
    boolean bissextile(int annee){
        return (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;
    }
    void algorithm(){
        print(" -> ");
        int annee = readInt();
        if (bissextile(annee)){
            println("Bissextile");
        } else {
            println("Non Bissextile");
        }
    }
}