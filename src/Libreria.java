public class Libreria {

    private Estanteria v[];

    public void añadirLibro(Libro l){

        if(isOcupada()){
            return;
        }

        for(int i=0;i<v.length;i++){
            for (int j=0;j<v[i].matriz.length;j++){
                for (int k = 0;k<v[i].matriz[j].length;k++){
                    if(v[i].matriz[j][k]==null){
                        v[i].matriz[j][k]= l;
                        return;
                    }
                }
            }
        }
    }

    public boolean isOcupada(){
        for(int i=0;i<v.length;i++){
            for (int j=0;j<v[i].matriz.length;j++){
                for (int k = 0;k<v[i].matriz[j].length;k++){
                    if(v[i].matriz[j][k]==null){
                        return false;
                    }
                }
            }
        }
        return true;
    }



}

}
