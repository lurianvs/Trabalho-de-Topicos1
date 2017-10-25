
public class Contas2 {

    private String contaPagar;
    private String contaReceber;
    private String dataPagar;
    private String dataReceber;

    public Contas2() {

        this.contaPagar = "";
        this.contaReceber = "";
        this.dataPagar = "";
        this.dataReceber = "";
    }
    
    public Contas2(String contaPagar, String contaReceber, String dataPagar, String dataReceber) {
        
        this.contaReceber=contaReceber;
        this.contaPagar=contaPagar;
        this.dataPagar=dataPagar;
        this.dataReceber=dataReceber;
        
    }
    
    public String getcontaPagar() {
        return contaPagar;
    }

    public void setcontaPagar(String contaPagar) {
        this.contaPagar=contaPagar;
    }
    
    
     public String getcontaReceber() {
        return contaReceber;
    }

    public void setcontaReceber(String contaReceber) {
        this.contaReceber=contaReceber;
    }
    
     public String getdataReceber() {
        return dataReceber;
    }

    public void setdataReceber(String dataReceber) {
        this.dataReceber=dataReceber;
    }
    
    
     public String getdataPagar() {
        return dataPagar;
    }

    public void setdataPagar(String dataPagar) {
        this.dataPagar=dataPagar;
    }



}
