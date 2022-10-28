class exo_4 extends Program {
    int[] minMax(int[] tab){
        int min = 0;
        int max = 0;
        for (int i = 0; i < length(tab); i++){
            if (tab[i] < min){
                min = tab[i];
            } else if (tab[i] > max){
                max = tab[i];
            }
        }
        return new int[]{min, max};
    }
    void testMinMax() {
        assertArrayEquals(new int[]{1,3}, minMax(new int[]{2,1,3}));
        assertArrayEquals(new int[]{2,2}, minMax(new int[]{2,2,2}));
        assertArrayEquals(new int[]{-1,3}, minMax(new int[]{3,-1,2}));
    }
}