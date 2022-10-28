class diviseur extends Program{
    void algorithm(){
        print(" -> ");
        int read_int = readInt();
        int parf = read_int;
        String divst = "Diviseurs :";
        for (int cnt = 1; cnt != read_int; cnt = cnt + 1) {
            int divrc = read_int / cnt;
            if (divrc * cnt == read_int) {
                divst = divst + " " + cnt;
                parf = parf + cnt;
            }
        }
        println(divst + " " + read_int);
        if (parf == read_int * 2) {
            println("Nombre parfait !");
        }
    }
}