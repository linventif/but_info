class AffichageTableau extends Program {
    /*void algorithm() {
        int[] tab = new int[]{1,2,3};
        for (int i = 0; i < length(tab); i++){
            println(tab[i]);
        }
    }*/


    /*

    String toString(int[] tab){
        String to_str = "";
        for (int i = 0; i < length(tab); i++){
            to_str = to_str + tab[i] + " ";
        }
        return to_str;
    }

    void testToString_tabInt () {
        assertEquals("1 2 3 ", toString(new int[]{1,2,3}));
        assertEquals("", toString(new int[0]));
    }

    */

    String toString(String[] tab){
        String to_str = "";
        for (int i = 0; i < length(tab); i++){
            to_str = to_str + tab[i] + " ";
        }
        return to_str;
    }
}