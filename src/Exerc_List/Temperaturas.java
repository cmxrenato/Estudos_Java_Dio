package Exerc_List;

public class Temperaturas {
    private Integer numMes;
    private String mes;
    private Double temp;



    public Temperaturas(Integer numMes, String mes, Double temp) {
        this.numMes = numMes;
        this.mes = mes;
        this.temp = temp;
    }


    public String getMes() {
        return mes;
    }

    public Double getTemp() {
        return temp;
    }

    public Integer getNumMes() {
        return numMes;
    }

    @Override
    public String toString() {
        return "Temperaturas{"+numMes +
                "mes='" + mes + '\'' +
                ", temp=" + temp +
                '}';
    }
}
