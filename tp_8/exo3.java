class exo3 extends Program{
    int nbFois(String tab[], String mot){
        int nb = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i].equals(mot)){
                nb++;
            }
        }
        return nb;
    }
    String[] motsDifferents (String[] mots){
        String[] motsDif = mots;
        int nbMotsDif = 0;
        for (int i = 0; i < length(motsDif); i++){
            if (nbFois(motsDif, motsDif[i]) == 1){
                motsDif[nbMotsDif] = motsDif[i];
                nbMotsDif++;
            } else {
                motsDif[i] = "";
            }
        }
        String[] res = new String[nbMotsDif];
        for (int i = 0; i < nbMotsDif; i++){
            res[i] = motsDif[i];
        }
        return res;
    }
    void algorithm(){
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        String[] motsDiff = motsDifferents(mots);
        for (int i = 0; i < length(motsDiff); i++){
            println(nbFois(motsDiff, mots[i]));
        }
    }
    /*
    void testMotsDifferents () {
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        String[] motsDiff = motsDifferents(mots);
        for (int idx = 0; idx < length(mots); idx = idx+1){
            assertEquals(1, nbFois(motsDiff,mots[idx]));
        }
    }*/
}