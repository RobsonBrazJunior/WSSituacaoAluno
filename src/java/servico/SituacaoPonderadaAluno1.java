package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import negocio.Nota;

@WebService(serviceName = "SituacaoPonderadaAluno1")
public class SituacaoPonderadaAluno1 {
    
    @WebMethod(operationName = "obterSituacaoPonderadaAluno")
    public String obterSituacaoPonderadaAluno (Nota nota1, Nota nota2, Nota nota3, Nota nota4) {
        String resp;
        
        float media = calcularMedia(nota1, nota2, nota3, nota4);
        
        if (media >= 7) {
            resp = "Aprovado";
        } else if (media >= 4) {
            resp = "Exame Final";
        } else {
            resp = "Reprovado";
        }
        
        return resp + " - " + media;
    }
    
    private float calcularMedia (Nota nota1, Nota nota2, Nota nota3, Nota nota4) {
        return (nota1.getPeso() * nota1.getValor() +
                nota2.getPeso() * nota2.getValor() +
                nota3.getPeso() * nota3.getValor() +
                nota4.getPeso() * nota4.getValor()) /
                (nota1.getPeso()+nota2.getPeso()+nota3.getPeso()+nota4.getPeso());
    }
}
