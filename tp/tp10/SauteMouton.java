class SauteMouton extends Program{
    void AffichePrairie(char[] prairie){
        int i;
        println("");
        println(" - - - Prairie - - - ");
        println("");
        print("    ");
        for(i=0;i<length(prairie);i=i+1){
            print(prairie[i] + " ");
        }
        println("");
        println("    0 1 2 3 4 5 6 ");
        println("");
        println(" - - - - - - - - - - ");
        println("");
    }
    boolean ValidMove(char[] prairie, int reponse){
        if (reponse >= 0 && reponse <= length(prairie)){
            if (prairie[reponse] == '>' && prairie[reponse+1] == '_'){
                return true;
            } else if (prairie[reponse] == '<' && prairie[reponse-1] == '_'){
                return true;
            } else if (reponse >= 1 && reponse <= length(prairie)-1){
                if (prairie[reponse] == '>' && prairie[reponse+2] == '_'){
                    return true;
                } else if (prairie[reponse] == '<' && prairie[reponse-2] == '_'){
                    return true;
                }
            }
        }
        return false;
    }
    void algorithm(){
        char[] prairie = new char[]{'>','>','>','_','<','<','<'};
        boolean fini = false;
        while (!fini) {
            AffichePrairie(prairie);
            println("Quelle mouton voulez-vous deplacer ?");
            print(" > ");
            int reponse = readInt();
            if (ValidMove(prairie, reponse)){
                if (prairie[reponse] == '>' && prairie[reponse+1] == '_'){
                    prairie[reponse] = '_';
                    prairie[reponse+1] = '>';
                } else if (prairie[reponse] == '>' && prairie[reponse+2] == '_'){
                    prairie[reponse] = '_';
                    prairie[reponse+2] = '>';
                } else if (prairie[reponse] == '<' && prairie[reponse-1] == '_'){
                    prairie[reponse] = '_';
                    prairie[reponse-1] = '<';
                } else if (prairie[reponse] == '<' && prairie[reponse-2] == '_'){
                    prairie[reponse] = '_';
                    prairie[reponse-2] = '<';
                }
            } else {
                println("Deplacement impossible !");
            }
        }
    }
}