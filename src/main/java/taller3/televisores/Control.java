package taller3.televisores;

public class Control{
    private TV tv;

    public void setTv(TV tv){
        this.tv = tv;
    }
    public TV getTv(){
        return tv;
    }

                                    //Encender o apagar tv
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
                                    //Subir o bajar canal
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
                                    //Subir y bajar volumen
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
                                        //Cmbiar canal y volumen personalmente
    public void setCanal(int canal){
        tv.setCanal(canal);
    }
    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }
                                            //Enlazar control con el televisor
    public void enlazar(TV televisor){
        setTv(televisor);
        tv.setControl(this);
    }
    





}