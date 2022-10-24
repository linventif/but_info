class exo2 extends Program{
    int nbFois(String tab[], String mot){
        int nb = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i].equals(mot)){
                nb++;
            }
        }
        return nb;
    }
    int[] frequences (String[] motsCles, String[] mots){
        int[] freq = new int[length(motsCles)];
        for (int i = 0; i < length(motsCles); i++){
            freq[i] = nbFois(mots, motsCles[i]);
        }
        return freq;
    }
    void testFrequences () {
        String[] motsCles = new String[]{"je", "tu", "elle"};
        int[] freq = new int[]{3, 2, 1};
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        assertArrayEquals(freq, frequences(motsCles, mots));
    }
}