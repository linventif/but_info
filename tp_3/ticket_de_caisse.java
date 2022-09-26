class ticket_de_caisse extends Program{
    void algorithm(){
        int total = 0;
        boolean finit = false;
        while (!finit) {
            print(" -> ");
            int read_int = readInt();
            if (read_int != 0) {
                total = total + read_int;
            } else {
                finit = true;
                println("Total : " + total);
            }
        }
    }
}