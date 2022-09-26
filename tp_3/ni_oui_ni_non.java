class ni_oui_ni_non extends Program{
    void algorithm(){
        boolean fini = false;
        while (!fini) {
            print(" -> ");
            String read_str = readString();
            if (((charAt(read_str, 0) == 'O') || (charAt(read_str, 0) == 'o')) && ((charAt(read_str, 1) == 'U') || (charAt(read_str, 1) == 'u')) && ((charAt(read_str, 2) == 'i') || (charAt(read_str, 2) == 'I'))) {
                fini = true;
            }
        }
        println("Perdu");
    }
}