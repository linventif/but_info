class suite_de_syracause extends Program {
    void algorithms() {
        print(" -> ");
        int read_int = readInt();
        int read_int_exp = read_int;
        String trajectoire = "Trajectoire : " + read_int + ",";
        int range = 0;
        int dur_alt = 0;
        int max = 0;
        while (read_int != 1) {
            if ((read_int / 2 ) * 2 == read_int) {
                read_int = read_int / 2;
            } else {
                read_int = read_int * 3 + 1;
            }
            if (read_int > max) {
                max = read_int;
            }
            if (read_int > read_int_exp) {
                dur_alt = dur_alt + 1;
            }
            trajectoire = trajectoire + " " + read_int + ",";
            range++;
        }
        println(trajectoire);
        println("Altitude max : " + max);
        println("Durée de vol : " + range);
        println("Durée de vol en altitude : " + dur_alt);
        println("Facteur d'expension : " + (max / read_int_exp));
    }
}