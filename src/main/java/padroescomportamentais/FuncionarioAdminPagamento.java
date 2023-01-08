package padroescomportamentais;

public class FuncionarioAdminPagamento extends Funcionario{

    public FuncionarioAdminPagamento(Funcionario superior){
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Administração de pagamentos";
    }
}
