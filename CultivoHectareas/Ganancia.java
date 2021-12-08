package CultivoHectareas;

public class Ganancia {

    private float numHectareas;
    private float costoBultoSemilla;
    private float costoBultoUrea;
    private float costoGalonFungicida;
    private float precioToneladaMaiz;

    public float getNumHectareas() {
        return numHectareas;
    }

    public void setNumHectareas(float numHectareas) {
        this.numHectareas = numHectareas;
    }

    public float getCostoBultoSemilla() {
        return costoBultoSemilla;
    }

    public void setCostoBultoSemilla(float costoBultoSemilla) {
        this.costoBultoSemilla = costoBultoSemilla;
    }

    public float getCostoBultoUrea() {
        return costoBultoUrea;
    }

    public void setCostoBultoUrea(float costoBultoUrea) {
        this.costoBultoUrea = costoBultoUrea;
    }

    public float getCostoGalonFungicida() {
        return costoGalonFungicida;
    }

    public void setCostoGalonFungicida(float costoGalonFungicida) {
        this.costoGalonFungicida = costoGalonFungicida;
    }

    public float getPrecioToneladaMaiz() {
        return precioToneladaMaiz;
    }

    public void setPrecioToneladaMaiz(float precioToneladaMaiz) {
        this.precioToneladaMaiz = precioToneladaMaiz;
    }

    public float calcCostoTotalBultosDeHectarea() {
        return numHectareas * costoBultoSemilla * 4;
    }

    public float calcCostoTotalArriendo() {
        return (float) 1_000_000 * numHectareas;
    }

    public float calcCostoInsumosAbonos() {
        return (float) 10 * costoBultoUrea;
    }

    public float calcCostoTotalFungicida() {
        return (float) 3 * costoGalonFungicida * numHectareas;
    }

    public float calcCostoSiembra() {
        return (float) 600_000 * numHectareas;
    }

    public float calcCostoRecoleccion() {
        return 500_000 * numHectareas;
    }

    public double calcCostoTotal() {
        return  (calcCostoTotalBultosDeHectarea() + calcCostoTotalArriendo() + calcCostoInsumosAbonos()
                + calcCostoTotalFungicida() + calcCostoSiembra() + calcCostoRecoleccion());
    }

    public double calcIngresos() {
        return calcCostoTotal() * precioToneladaMaiz;
    }

    public double calcGanancias() {
        return calcIngresos() - calcCostoTotal();
    }
}
