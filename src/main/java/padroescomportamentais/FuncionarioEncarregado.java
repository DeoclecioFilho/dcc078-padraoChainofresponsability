package padroescomportamentais;

public class FuncionarioEncarregado extends Funcionario{

    public FuncionarioEncarregado(Funcionario superior){
       listaDocumentos.add(TipoDocumentoNotaRefeicao.getTipoDocumentoNotaRefeicao());
        setFuncionarioSuperior(superior);

    }
    @Override
    public String getDescricaoCargo() {
        return "Encarregado";
    }
}
