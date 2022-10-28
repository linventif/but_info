class exo_2 extends Program {
    boolean estAdopte(boolean[] tab){
        int rst = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i] == false){
                rst = rst - 1;
            } else {
                rst = rst + 1;
            }
        }
        if (rst > 0){
            return true;
        } else {
            return false;
        }
    }
    void testEstAdopte(){
        assertFalse(estAdopte(new boolean[]{true,false}));
        assertTrue(estAdopte(new boolean[]{true,true,false}));
    }
}