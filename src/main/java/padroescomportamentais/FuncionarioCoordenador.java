package padroescomportamentais;

public class FuncionarioCoordenador extends Funcionario  {

    public FuncionarioCoordenador(Funcionario superior){
        listaDocumentos.add(TipoDocumentoInvestimento.getTipoDocumentoInvestimento());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Coordenador";
    }
}
