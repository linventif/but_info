class print_iut extends Program{
    void algorithm(){
        print(" -> ");
        int taille = readInt();
        dessinerI(taille);
        dessinerU(taille);
        dessinerT(taille);
    }
    void dessinerI (int taille){
        char lettre = 'I';
        dessineLigne(taille, lettre);
        for (int i = 0; i <(taille-2); i++){
            dessineMillieu(taille, lettre);
        }
        dessineLigne(taille, lettre);
        println();
    }
    void dessinerU (int taille){
        char lettre = 'U';
            dessineExtremiter(taille, lettre);
        for (int i = 0; i <(taille-2); i++){
            dessineExtremiter(taille, lettre);
        }
        dessineLigne(taille, lettre);
        println();
    }
    void dessinerT (int taille){
        char lettre = 'T';
        dessineLigne(taille, lettre);
        for (int i = 0; i <(taille-1); i++){
            dessineMillieu(taille, lettre);
        }
        println();
    }
    void dessineLigne(int n, char c) {
        for (int i=0; i<n; i=i+1) {
            print(c);
        }
        println();
    }
    void dessineMillieu(int n, char c) {
        String space = "";
        for (int i=0; i<(n/2); i=i+1) {
            space = space + " ";
        }
        println("" + space + c);
    }
    void dessineExtremiter(int n, char c) {
        String space = "";
        for (int i=0; i<(n-2); i=i+1) {
            space = space + " ";
        }
        println("" + c + space + c);
    }
}