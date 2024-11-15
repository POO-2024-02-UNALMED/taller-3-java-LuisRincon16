package taller3.televisores;

public class TV{
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        tvCreados();
    }

    public void setMarca(Marca marc){
        this.marca = marc;
    }
    public Marca getMarca(){
        return marca;
    }

    public void setCanal(int can){
        this.canal = can;
    }
    public int getCanal(){
        return canal;
    }

    public void setPrecio(int prec){
        this.precio = prec;
    }
    public int getPrecio(){
        return precio;
    }

    public void setVolumen(int vol){
        this.volumen = vol;
    }
    public int getVolumen(){
        return volumen;
    }

    public void setControl(Control cont){
        this.control = cont;
    }
    public Control getControl(){
        return control;
    }
                                    //metodo de clase para modificar el valor de televisores creados
    public static void tvCreados(){
        numTV = ++numTV;
    }
                                    //Enceder y apagar tv
    public void turnOff(){
        if (estado = true) {
            estado = false;
        }
    }
    public void turnOn(){
        if (estado = false){
            estado = true;
        }
    }                                   //Conocer el estado del tv
    public boolean getEstado(){
        return estado;
    }
                                     //Aumentar y disminuir canales
    public void canalUp(){
        getEstado();
        if (estado = true){
            if (canal >= 1 && canal <= 120){
                canal = ++canal;
            }
        }
    }

    public void canalDown(){
        getEstado();
        if (estado = true){
            if (canal >= 1 && canal <= 120){
                canal = --canal;
            }
        }
    }
                                        //Aumentar y disminuir volumen
    public void volumenUp(){
        getEstado();
        if (estado = true){
            if(volumen >= 0 && volumen <= 7){
                volumen = ++volumen;
            }
        }
    }

    public void volumenDown(){
        getEstado();
        if (estado = true){
            if (volumen >= 0 && volumen <= 7){
                volumen = --volumen;
            }
        }
    }


}