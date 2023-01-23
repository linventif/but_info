class desin extends Program{
    void figure_1(int taille, char charactere){
        for (int i = 0; i <= taille; i++) {
            for (int j = 0; j < i; j++) {
                print(charactere);
            }
            println();
        }
    }
    void figure_2(int taille, char charactere){
        for (int i = 0; i <= taille; i++) {
            if (i >=3 && i <= taille - 1) {
                String space = "";
                for (int j = 0; j < i - 2; j++) {
                    space = space + " ";
                }
                print(charactere + space + charactere);
            } else {
                for (int j = 0; j < i; j++) {
                    print(charactere);
                }
            }
            println();
        }
    }
    void figure_3(int taille, char charactere){
        for (int i = 0; i <= taille; i++) {
            if (i == 0 || i == taille - 1) {
                String space = "";
                for (int j = 0; j < taille - 2; j++) {
                    space = space + ".";
                }
                print(charactere + space + charactere);
            } else {
                String space = "";
                for (int j = 0; j < taille - 2; j++) {
                    space = space + ".";
                }
                print(charactere + space + charactere);
            }
            println();
        }
    }
    void algorithm(){
        print(" Figure -> ");
        int figure = readInt();
        print(" Taille -> ");
        int taille = readInt();
        print(" Charactere -> ");
        char charactere = readChar();
        if (figure == 1) {
            figure_1(taille, charactere);
        } else if (figure == 2) {
            figure_2(taille, charactere);
        } else if (figure == 3) {
            figure_3(taille, charactere);
        }
    }
}