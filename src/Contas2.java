
public class Contas2 {

    private String descrição;
    private String vencimento;
    private String valor;
  

    public Contas2() {

        this.descrição = "";
        this.valor = "";
        this.vencimento= "";
       
    }
    
    public Contas2(String contaPagar, String contaReceber, String dataPagar, String dataReceber) {
        
        this.descrição=descrição;
        this.valor=valor;
        this.vencimento=vencimento;
       
        
    }
    
    public String getdescrição() {
        return descrição;
    }

    public void setdescrição(String descrição) {
        this.descrição=descrição;
    }
    
    
     public String getvalor() {
        return valor;
    }

    public void setvalor(String valor) {
        this.valor=valor;
    }
    
     public String getvencimento() {
        return vencimento;
    }

    public void setvencimento(String vencimento) {
        this.vencimento=vencimento;
    }
    
    
}