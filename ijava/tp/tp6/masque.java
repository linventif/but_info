class Masque extends Program{
    String masque(String phrase, char lettre){
        String nv_phrase = "";
        for (int i = 0; i < length(phrase); i++) {
            if (phrase.charAt(i) == lettre) {
                nv_phrase = nv_phrase + lettre;
            }
            else {
                nv_phrase = nv_phrase + ".";
            }
        }
        return nv_phrase;
    }
    void testMasque(){
        assertEquals("a...a...a....", masque("au bal masqué", 'a'));
        assertEquals("................", masque("Tonari no Totoro", 'u'));
        assertEquals(".o......o..o.o.o", masque("Tonari no Totoro", 'o'));
        assertEquals("", masque("", 'z'));
    }
}