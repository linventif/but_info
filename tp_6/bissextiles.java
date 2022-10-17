class bissextile extends Program{
    boolean bissextile(int annee){
        return (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;
    }
    void testbissextile(){
        for (int i = 0; i < 10000; i++) {
            if (bissextile(i)){
                println(i + " est bissextile");
            } else {
                println(i + " n'est pas bissextile");
            }
        }
    }
}