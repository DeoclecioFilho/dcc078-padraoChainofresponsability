package padroescomportamentais;

public class FuncionarioSupervisor extends Funcionario{

    public FuncionarioSupervisor(Funcionario superior){
        listaDocumentos.add(TipoDocumentoDespesa.getTipoDocumentoDespesa());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
