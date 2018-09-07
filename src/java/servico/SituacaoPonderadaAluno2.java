package servico;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import negocio.Nota;

@WebService(serviceName = "SituacaoPonderadaAluno2")
public class SituacaoPonderadaAluno2 {
    
    @WebMethod(operationName = "obterSituacaoPonderadaAluno2")
    public String obterSituacaoPonderadaAluno2 (List<Nota> listaNotas) {
        String resp;
        
        float media = calcularMedia (listaNotas);
        
        if (media >= 7) {
            resp = "Aprovado";
        } else if (media >= 4) {
            resp = "Exame final";
        } else {
            resp = "Reprovado";
        }
        
        return resp + " - " + media;
    }
    
    private float calcularMedia (List<Nota> listaNotas) {
        float somaNotas = 0;
        int somaPesos = 0;
        
        for (Nota nota : listaNotas) {
            somaNotas += nota.getPeso() * nota.getValor();
            somaPesos += nota.getPeso();
        }
        
        return somaNotas / somaPesos;
    }
}
