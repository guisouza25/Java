
public class TesteIR2 {

    public static void main(String[] args) {

        // De 1900.0 at� 2800.0 o IR � de 7.5% e pode deduzir R$ 142
        // De 2800.01 at� 3751.0 o IR � de 15% e pode deduzir R$ 350
        // De 3751.01 at� 4664.00 o IR � de 22.5% e pode deduzir R$ 636
    	
    	double salario = 3300.0;
    	
    	boolean grupo1 = salario >= 1900.0 && salario <= 2800.0;
    	boolean grupo2 = salario >= 2800.01 && salario <= 3751.0;
    	boolean grupo3 = salario >= 3751.01 && salario <= 4664.0;

        if(grupo1) {
            System.out.println("A sua aliquota � de 7%");
            System.out.println("Voc� pode deduzir at� R$ 142");
        } else if(grupo2) {
            System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir at� R$ 350");
        } else if(grupo3) {
            System.out.println("A sua aliquota � de 22.5%");
            System.out.println("Voc� pode deduzir at� R$ 636");
        }
    }
}