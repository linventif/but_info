class prise_de_temperature extends Program{
    void algorithm(){
        int min = 0;
        int con = 1;
        int moy = 0;
        int max = 0;
        boolean finit = false;
        while (!finit) {
            print(" -> ");
            int read_int = readInt();
            if (read_int != -273) {
                if (con != 1) {
                    if (read_int > max) {
                        max = read_int;
                    } else if (read_int < min) {
                        min = read_int;
                    }
                    moy = moy + read_int;
                } else {
                    max = read_int;
                    min = read_int;
                    moy = read_int;
                }
                con = con + 1;
            } else {
                finit = true;
                println("maximum : " + max);
                println("minimum : " + min);
                println("moyen : " + (moy/con));
            }
        }
    }
}