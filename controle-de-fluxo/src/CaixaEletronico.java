public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double balance = 25.0;
        double withdrawValue = 26.0;

        if ( withdrawValue <  balance){
            balance = balance - withdrawValue;
            System.out.println("Novo Saldo " + balance);
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
}
