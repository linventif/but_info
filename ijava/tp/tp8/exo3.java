class exo3 extends Program{
    int nbFois(String tab[], String mot){
        int nb = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i] != null && tab[i].equals(mot)){
                nb++;
            }
        }
        return nb;
    }
    String[] motsDifferents (String[] mots){
        String[] res = new String[length(mots)];
        int nb = 0;
        for (int i = 0; i < length(mots); i++){
            if (nbFois(res, mots[i]) == 0){
                res[nb] = mots[i];
                nb++;
            }
        }
        String[] res2 = new String[nb];
        for (int i = 0; i < nb; i++){
            res2[i] = res[i];
        }
        return res2;
    }
    void testMotsDifferents () {
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        String[] motsDiff = motsDifferents(mots);
        for (int idx = 0; idx < length(mots); idx = idx+1){
            assertEquals(1, nbFois(motsDiff,mots[idx]));
        }
    }
}