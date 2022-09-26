class deviner_un_nombre extends Program{
    void algorithm(){
        boolean fini = false;
        int nb = 50;
        int precedant = 25;
        while (!fini) {
            println("Le nombre est : " + nb);
            print(" -> ");
            char read_str = readChar();
            if (read_str == '-') {
                nb = nb - precedant;
            } else {
                nb = nb + precedant;
            }
            if (precedant > 1) {
                precedant = precedant / 2;
            }
        }
    }
}