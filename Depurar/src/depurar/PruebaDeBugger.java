package depurar;

public class PruebaDeBugger {

	public static void main(String[] args) {
    	ClaseParaDepurar clase = new ClaseParaDepurar();
    	double valor = clase.echaCuentas();
    	System.out.println("Sale "+valor);
    }

}
