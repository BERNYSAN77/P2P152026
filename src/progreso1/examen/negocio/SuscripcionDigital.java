package progreso1.examen.negocio;

public class SuscripcionDigital {
    private String nombreCliente;
    private String plan;
    private double costoMensual;
    private int mesesSuscritos;

    public SuscripcionDigital(String nombreCliente, String plan, double costoMensual, int mesesSuscritos) {
        this.nombreCliente = nombreCliente;
        this.plan = plan;
        setCostoMensual(costoMensual);
        setMesesSuscritos(mesesSuscritos);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        if(costoMensual > 0)
            this.costoMensual = costoMensual;
    }

    public int getMesesSuscritos() {
        return mesesSuscritos;
    }

    public void setMesesSuscritos(int mesesSuscritos) {
        if(mesesSuscritos > 0)
            this.mesesSuscritos = mesesSuscritos;
    }
    public double calcularTotalPagado(){
        return costoMensual * mesesSuscritos;
    }

    public String evaluarRentabilidad(){
        if(calcularTotalPagado() > 500)
            return "Cliente rentable";
        else
            return "Cliente nuevo a fidelizar";
    }

    public void mostrarResumen(){
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Plan: "+plan);
        System.out.println("Meses: "+mesesSuscritos);
        System.out.println("Valor mensual: "+costoMensual);
        System.out.println("Total pagado: "+calcularTotalPagado());
        System.out.println(evaluarRentabilidad());
    }
}
