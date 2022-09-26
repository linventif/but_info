class pgcd extends Program {
    void algorithm(){
        print(" -> ");
        int nb_1 = readInt();
        print(" -> ");
        int nb_2 = readInt();
        boolean success = false;
        if (nb_2 != 0) {
            while(!success) {
                if ((nb_1%nb_2) != 0) {
                    int tempo = nb_1;
                    nb_1 = nb_2;
                    nb_2 = tempo % nb_2;
                } else {
                    success = true;
                }
            }
        } else {
            nb_2 = nb_1;
        }
        if (nb_2 < 0) {
            nb_2 = nb_2 - 2 * nb_2;
        }
        println("Le GPCD est : " + nb_2);
    }
}