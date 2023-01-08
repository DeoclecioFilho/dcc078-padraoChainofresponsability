package padroescomportamentais;

public class FuncionarioGerente extends Funcionario{

    public FuncionarioGerente(Funcionario superior){
        listaDocumentos.add(TipoDocumentoTerceirizado.getTipoDocumentoTerceirizado());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Gerente";
    }
}
