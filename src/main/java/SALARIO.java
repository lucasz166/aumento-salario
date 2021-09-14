
import java.util.Scanner;


public class SALARIO {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario=0.0f, aumento=0.0f, salarioNovo=0.0f;
        
        System.out.println("Digite salario: ");
        salario = entrada.nextFloat();
         
        aumento = salario*10/100;
        salarioNovo=salario+aumento;
        
        System.out.printf("O salario novo é %.2f \n", salarioNovo);
        
    }
}
