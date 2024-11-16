package taller3.televisores;

public class TV{
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        tvCreados();
    }

    public static void setNumTV(int numCreados){
        numTV = numCreados;
    }
    public static int getNumTV(){
        return numTV;
    }


    public void setMarca(Marca marc){
        this.marca = marc;
    }
    public Marca getMarca(){
        return marca;
    }

    public void setCanal(int can){
        getEstado();
        if (estado = true){
            this.canal = can;
        }
    }
    public int getCanal(){
        return this.canal;
    }

    public void setPrecio(int prec){
        this.precio = prec;
    }
    public int getPrecio(){
        return precio;
    }

    public void setVolumen(int vol){
        getEstado();
        if (estado = true){
            this.volumen = vol;
        }
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
        this.estado = false;
    }
    public void turnOn(){
        this.estado = true;
    }                                   //Conocer el estado del tv
    public boolean getEstado(){
        return estado;
    }
                                     //Aumentar y disminuir canales
    public void canalUp(){
        getEstado();
        getCanal();
        if (estado = true){
            if (this.canal >= 1 && this.canal <= 120){
                int cana = this.canal + 1;
                this.setCanal(cana);
            }
        }
    }

    public void canalDown(){
        getEstado();
        getCanal();
        if (estado = true){
            if (this.canal >= 1 && this.canal <= 120){
                int canai = this.canal - 1;
                this.setCanal(canai);
            }
        }
    }
                                        //Aumentar y disminuir volumen
    public void volumenUp(){
        getEstado();
        getVolumen();
        if (estado = true){
            if(this.volumen >= 0 && this.volumen <= 7){
                int voln = this.volumen + 1;
                this.setVolumen(voln);
            }
        }
    }

    public void volumenDown(){
        getEstado();
        getVolumen();
        if (estado = true){
            if (this.volumen >= 0 && this.volumen <= 7){
                int volm = this.volumen - 1;
                this.setVolumen(volm);
            }
        }
    }


}