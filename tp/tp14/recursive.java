class recursive extends Program{
    int CompteLettre(String phrase, char lettre){
        if(phrase.length() == 0){
            return 0;
        }
        else{
            if(phrase.charAt(0) == lettre){
                return 1 + CompteLettre(phrase.substring(1), lettre);
            }
            else{
                return CompteLettre(phrase.substring(1), lettre);
            }
        }
    }
    void algorithm(){
        print("Entrez une phrase : ");
        String phrase = readString();
        print("Entrez une lettre : ");
        char lettre = readChar();
        print("La lettre " + lettre + " apparait " + CompteLettre(phrase, lettre) + " fois dans la phrase " + phrase);
        println();
    }
}