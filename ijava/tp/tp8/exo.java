class exo extends Program{
    int nbFois(String tab[], String mot){
        int nb = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i] != null && tab[i].equals(mot)){
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
    String[] motsDifferents (String[] mots){
        String[] res = new String[length(mots)];
        int nb = 0;
        for (int i = 0; i < length(mots); i++){
            if (nbFois(res, mots[i]) == 0){
                res[nb] = mots[i];
                nb++;
            }
        }
        return sousTableau(res, nb);
    }
    String[] sousTableau(String[] tab, int taille){
        if (taille < 0 || taille > length(tab)){
            taille = length(tab);
        }
        String[] res = new String[taille];
        for (int i = 0; i < taille; i++){
            res[i] = tab[i];
        }
        return res;
    }
    boolean estLettre(char c){
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }
        return false;
    }
    char lettreMin(char c){
        if (c >= 'A' && c <= 'Z'){
            return (char)(c + ('a' - 'A'));
        }
        return c;
    }
    String[] lesMots(String texte){
        String mot = "";
        int nb = 0;
        String[] res = new String[length(texte)];
        for(int i = 0; i < length(texte); i++){
            if (estLettre(charAt(texte, i))){
                mot = mot + lettreMin(charAt(texte, i));
            } else if (length(mot) > 1){
                res[nb] = mot;
                nb++;
                mot = "";
            }
        }
        if (length(mot) > 1){
            res[nb] = mot;
            nb++;
        }
        return sousTableau(res, nb);
    }
    String[] tri(String[] tab){
        String[] res = new String[length(tab)];
        for (int i = 0; i < length(tab); i++){
            res[i] = tab[i];
        }
        for (int i = 0; i < length(res); i++){
            for (int j = i + 1; j < length(res); j++){
                if (res[i].compareTo(res[j]) > 0){
                    String tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                }
            }
        }
        return res;
    }
    String[] triSimultane(String[] tab, int[] freq){
        String[] res = new String[length(tab)];
        int[] resFreq = new int[length(freq)];
        for (int i = 0; i < length(tab); i++){
            res[i] = tab[i];
            resFreq[i] = freq[i];
        }
        for (int i = 0; i < length(res); i++){
            for (int j = i + 1; j < length(res); j++){
                if (resFreq[i] < resFreq[j]){
                    String tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                    int tmpFreq = resFreq[i];
                    resFreq[i] = resFreq[j];
                    resFreq[j] = tmpFreq;
                }
            }
        }
        return res;
    }
    void algorithm() {
        String texte =
        "Patience, patience,\n" +
        "Patience dans l'azur !\n" +
        "Chaque atome de silence\n" +
        "Est la chance d'un fruit mur !";
        println(texte);
        println();
        String[] mots = lesMots(texte);
        String[] motsCles = motsDifferents(mots);
        int[] freq = frequences(motsCles, mots);
        int[] order = tri(freq);
        String[] motsClesTries = triSimultane(order, motsCles);
        int[] freqTries = triSimultane(order, freq);
        for (int i = 0; i < length(motsClesTries); i++){
            println(motsClesTries[i] + " : " + freqTries[i]);
        }

    }
    /*
    void testNbFois () {
        String[] tab = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        assertEquals(3, nbFois(tab, "je"));
        assertEquals(2, nbFois(tab, "tu"));
        assertEquals(0, nbFois(tab, "il"));
    }
    void testFrequences () {
        String[] motsCles = new String[]{"je", "tu", "elle"};
        int[] freq = new int[]{3, 2, 1};
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        assertArrayEquals(freq, frequences(motsCles, mots));
    }
    void testSousTableau () {
    assertArrayEquals(new String[]{"a", "b", "c"}, sousTableau(new String[]{"a", "b", "c", "d", "e"}, 3));
    assertArrayEquals(new String[]{"a", "b"}, sousTableau(new String[]{"a", "b"}, 5));
    assertArrayEquals(new String[]{}, sousTableau(new String[]{"a", "b", "c"}, 0));
    assertArrayEquals(new String[]{"a", "b"}, sousTableau(new String[]{"a", "b"}, -5));
    String[] tab = new String[]{"a", "b"};
    assertNotEquals(tab, sousTableau(tab, 2));
    }
    void testMotsDifferentsV2 () {
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        String[] mu = new String[]{"je", "tu", "elle"};
        assertArrayEquals(mu,motsDifferents(mots));
    }
    void testLesMots () {
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"},lesMots("je tu elle je tu"));
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"},lesMots(" je tu, elle . je tu ! "));
    }
    void testLesMotsV2 () {
    assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"},lesMots(" jE tu, Elle je tu "));
    }
    void testTriSimultane () {
        int[] critere = new int[]{1,5,3,2,4};
        String[] tab = new String[]{"un", "cinq", "trois", "deux", "quatre"};
        triSimultane(critere, tab);
        assertArrayEquals(new int[]{5,4,3,2,1}, critere);
        assertArrayEquals(new String[]{"cinq","quatre","trois","deux","un"}, tab);
    }*/
}