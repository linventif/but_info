class timer extends Program{
    void algorithm(){
        print(getTime());
        boolean success = false;
        long timer = getTime() + 3;
        int compteur = 0;
        while (!success) {
            println(compteur);
            compteur = compteur + 3;
            if (getTime() > timer) {
                success = true;
            }
        }
    }
}