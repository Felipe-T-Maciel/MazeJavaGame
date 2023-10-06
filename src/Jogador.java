public class Jogador {

    void moverCimaBaixo(int num) {
        for (int i = 0; i < Labirinto.mapa.length; i++) {
            for (int j = 0; j < Labirinto.mapa[i].length; j++) {
                if(i+num>=0 && i+num<Labirinto.mapa.length){
                    if (Labirinto.mapa[i][j] == 'J') {
                        if (Labirinto.mapa[i + num][j] == ' ') {
                            Labirinto.mapa[i + num][j] = 'J';
                            Labirinto.mapa[i][j] = ' ';
                        }
                        break;
                    }
                }
            }
        }
    }

    void moverLadoLado(int num) {
        for (int i = 0; i < Labirinto.mapa.length; i++) {
            for (int j = 0; j < Labirinto.mapa[i].length; j++) {
                if (Labirinto.mapa[i][j] == 'J') {
                    if (Labirinto.mapa[i][j + num] == ' ') {
                        Labirinto.mapa[i][j + num] = 'J';
                        Labirinto.mapa[i][j] = ' ';
                    }
                    break;
                }
            }
        }
    }

    boolean verificaFimDeJogo(){
       for (int i = 0; i < Labirinto.mapa.length; i++) {
           for (int j = 0; j < Labirinto.mapa[i].length; j++) {
               if(i-1>=0 && j-1 >= 0){
                   if (Labirinto.mapa[i-1][j] == 'F' && Labirinto.mapa[i][j] == 'J') {
                       return false;
                   }
               }
           }
        }
        return true;
    }
}
