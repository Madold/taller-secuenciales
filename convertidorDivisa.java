package CambioDivisa;

public class convertidorDivisa {
    private float cantYuan;
    private float cantDolar;
    private float cantEuro;
    private float cantDolarCanadiense;
    private float cantPeso;

    public float getCantPeso() {
        return cantPeso;
    }

    public void setCantPeso(float cantPeso) {
        this.cantPeso = cantPeso;
    }

    public float getCantYuan() {
        return cantYuan;
    }

    public void setCantYuan(float cantYuan) {
        this.cantYuan = cantYuan;
    }

    public float getCantDolar() {
        return cantDolar;
    }

    public void setCantDolar(float cantDolar) {
        this.cantDolar = cantDolar;
    }

    public float getCantEuro() {
        return cantEuro;
    }

    public void setCantEuro(float cantEuro) {
        this.cantEuro = cantEuro;
    }

    public float getCantDolarCanadiense() {
        return cantDolarCanadiense;
    }

    public void setCantDolarCanadiense(float cantDolarCanadiense) {
        this.cantDolarCanadiense = cantDolarCanadiense;
    }
    
    //Resolver el problema
    public float EuroPeso(){
        return (float) (cantEuro*4788.0);
    }
    
    public float PesoDolar(){
        return (float) (cantPeso*0.00025);
    }
    
    public float PesoYuan(){
        return (float) (cantPeso*9.56);
    }
    
    public float PesoDolarCan(){
        return (float) (cantPeso*0.00044);
    }
    
    public float DolarEuro() {
        return (float) (cantDolar*0.83);
    }
}
