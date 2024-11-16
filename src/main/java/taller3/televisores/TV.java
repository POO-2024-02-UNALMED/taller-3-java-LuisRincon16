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
        if (this.estado = true && can >= 1 && can <= 120){
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
        if (this.estado = true && vol >= 0 && vol <= 7){
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
        this.setCanal(this.canal + 1);
    }

    public void canalDown(){
        this.setCanal(this.canal - 1);
    }
                                        //Aumentar y disminuir volumen
    public void volumenUp(){
        this.setVolumen(this.volumen + 1);
    }

    public void volumenDown(){
        this.setVolumen(this.volumen - 1);
    }


}