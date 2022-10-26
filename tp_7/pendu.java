class pendu extends Program{
    // Variables declaration
    String[] words = new String[]{"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta", "iota", "kappa", "lambda", "mu", "nu", "xi", "omicron", "pi", "rho", "sigma", "tau", "upsilon", "phi", "chi", "psi", "omega"};
    char[] letters = new char[26];
    String word = words[(int)(random()*length(words))];

    boolean in_tab(char[] tab, char letter){
        for (int i = 0; i < length(tab); i++){
            if (tab[i] == letter){
                return true;
            }
        }
        return false;
    }
    boolean in_word(String word, char letter){
        for (int i = 0; i < length(word); i++){
            if (charAt(word, i) == letter){
                return true;
            }
        }
        return false;
    }
    boolean is_min_letter(char c){
        if (c >= 'a' && c <= 'z'){
            return true;
        }
        return false;
    }
    String word(){
        String res = "";
        for (int i = 0; i < length(word); i++){
            if (in_tab(letters, charAt(word, i))){
                res = res + charAt(word, i);
            } else {
                res = res + "_";
            }
        }
        return res;
    }
    String print_word(){
        String res = "";
        String word = word();
        for (int i = 0; i < length(word); i++){
            res = res + charAt(word, i) + " ";
        }
        return res;
    }
    boolean validAnser(String answer){
        if ((length(answer) == 1 && is_min_letter(charAt(answer, 0))) || (length(answer) == length(word))){
            return true;
        }
        return false;
    }
    void algorithm(){
        int vie = 5;
        boolean trv = false;
        // Print start informations
        println();
        println("Bienvenue dans le jeu du pendu !");
        println();
        println(" - Vous devez trouver un word en 5 coups maximum.");
        println(" - Vous avez 26 letters à votre disposition.");
        println(" - Vous pouvez choisir de deviner une letter ou le word entier.");
        println(" - Vous ne pouvez utuliser que des minuscules.");
        println();
        println("Bonne chance !");
        println();

        // Main
        while (vie > 0 && (!word().equals(word) && !trv)){
            println("Il vous reste " + vie + " tentatives : " + print_word());
            print(" -> ");
            String read_str = readString();
            while (!validAnser(read_str)){
                println(" ");
                println("Vous devez entrer une lettre ou un mot en minuscule !");
                print(" -> ");
                read_str = readString();
            }
            if (length(read_str) == 1){
                char letter = charAt(read_str, 0);
                if (in_tab(letters, letter)){
                    println(" ");
                    println("Vous avez déjà utilisé cette letter !");
                } else{
                    if (!in_word(word, letter)){
                        vie--;
                    }
                    letters[letter - 'a'] = letter;
                }
                println(" ");
            } else {
                if (read_str.equals(word)){
                    trv = true;
                } else {
                    vie--;
                }
                println(" ");
            }
        }
        if (vie == 0){
            println("Vous avez perdu !");
        } else {
            println("Vous avez gagné !");
        }
        println("Le word était : " + word);
        println(" ");
    }
}