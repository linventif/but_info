class in_string extends Program{
    boolean in_string(String string_1, String string_2){
        return string_1.indexOf(string_2) != -1;
    }
    void algorithm(){
        print(" -> ");
        String string_1 = readString();
        print(" -> ");
        String string_2 = readString();
        if (in_string(string_1, string_2)){
            println("Trouvé");
        } else {
            println("Non Trouvé");
        }
    }
}