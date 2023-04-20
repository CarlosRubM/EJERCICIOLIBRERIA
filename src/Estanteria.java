public class Estanteria {
    private Libro matriz[][];


    public Estanteria(){
        matriz = new Libro[4][8];
    }

    public String toString(){
        String s = new String();

        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0;j<matriz[i].length;j++){
                if(matriz[i][j]!= null){
                    s+= "[" + matriz[i][j].getTitulo().charAt(0) + "]";
                }else s+= "[" + "0" + "]";
            }
            s+="\n";
        }
        return s;
    }


}
