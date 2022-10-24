class exo1 extends Program{
    int nbFois(String tab[], String mot){
        int nb = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i].equals(mot)){
                nb++;
            }
        }
        return nb;
    }
    void testNbFois () {
        String[] tab = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        // "je" apparait 3 fois dans tab
        assertEquals(3, nbFois(tab, "je"));
        assertEquals(2, nbFois(tab, "tu"));
        assertEquals(0, nbFois(tab, "il"));
    }
}