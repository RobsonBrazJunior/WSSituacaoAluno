package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(serviceName = "ServicoSituacaoAluno")
public class ServicoSituacaoAluno {

    @WebMethod(operationName = "obterSituacaoAluno")
    public String obterSituacaoAluno (float nota1, float nota2, float nota3, float nota4) {
        
        String resp = "";
        
        float media = calcularMedia (nota1, nota2, nota3, nota4);
        
        if (media >= 7) {
            resp = "Aprovado";
        } else if (media >= 4) {
            resp = "Exame final";
        } else {
            resp = "Reprovado";
        }
        
        return resp;
    }
    
    private float calcularMedia (float nota1, float nota2, float nota3, float nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
