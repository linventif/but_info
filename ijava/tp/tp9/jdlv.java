class jdlv extends Program{
    int question(String question){
        println(question);
        print(" -> ");
        return readInt();
    }
    void space(int nbr){
        for (int i = 0; i < nbr; i++){
            println(" ");
        }
    }
    int random(int min, int max){
        return (int)(random()*(max-min+1))+min;
    }
    boolean intbl(int[] tbl, int nbr){
        for (int i = 0; i < length(tbl); i++){
            if (tbl[i] == nbr){
                return true;
            }
        }
        return false;
    }
    int nbneighbours(int[][] tbl, int x, int y){
        int nbr = 0;
        for (int i = 0; i < length(tbl, 2); i++){
            for (int j = 0; j < length(tbl, 1); j++){
                if (tbl[i][j] == 1){
                    nbr++;
                }
            }
        }
        if (tbl[x][y] == 1) {
            nbr--;
        }
        return nbr;
    }
    void algorithm(){
        int height = question("What sise did you want ? ( height ) ");
        int width = question("What sise did you want ? ( width ) ");
        space(1);
        int[][] tbl = new int[height][width];
        for (int i = 0; i < length(tbl); i++){
            for (int j = 0; j < length(tbl[i]); j++){
                double random = random(0, 2);
                if (random < 1){
                    tbl[i][j] = 0;
                } else {
                    tbl[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < length(tbl); i++){
            for (int j = 0; j < length(tbl[i]); j++){
                if (tbl[i][j] == 0){
                    print(" [ ]");
                } else {
                    print(" [X]");
                }
            }
            space(2);
        }/*
        boolean valid = false;
        while (!valid){
            space(1);
            int h = question("Position ( height ) ");
            int w = question("Position ( width ) ");
            space(1);
            println("There is " + nbneighbours(tbl, h, w) + " neighbours");
        }*/

        
        println(" ");
        println(" -> " + nbneighbours(tbl, 1, 1));
        println(" ");
    }
}