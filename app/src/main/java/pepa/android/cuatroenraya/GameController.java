package pepa.android.cuatroenraya;

public class GameController {

    /*
        matrix[columna][fila]
        posibles valores:
            0: casilla vacia
            1: casilla ocupada por Jugador 1
            2: casilla ocupada por Jugador 2
    */
    private int matrix[][];


    /*
        a quien le toca jugar:
            1: si le toca al Jugador 1
            2: si le toca al Jugador 2
     */
    private int turno;


    public GameController(){
        initMatrix();
        this.turno = 1;
    }


    /**
     * Inicializa la matiz del tablero a 0 (casilla vacia)
     */
    private void initMatrix(){

        this.matrix = new int[7][6];
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 6; j++){
                this.matrix[i][j] = 0;
            }
        }
    }


    /**
     * Comprueba si añadir una ficha en la columna seleccionada es posible
     * @param id columna seleccionada
     * @return
     */
    private boolean validAction(String id){
        //Solo es necesario ver si la cima de la pila está vacía
        int aux = Integer.parseInt(id);
        return this.matrix[aux][5] == 0;
    }
    
}
