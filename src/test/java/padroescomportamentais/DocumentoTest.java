package padroescomportamentais;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {
    FuncionarioAdminPagamento adminPgt;
    FuncionarioEncarregado encarregado;
    FuncionarioSupervisor supervisor;
    FuncionarioCoordenador coordenador;
    FuncionarioGerente gerente;

    @BeforeEach
    void setUp() {
        gerente = new FuncionarioGerente(null);
        coordenador = new FuncionarioCoordenador(gerente);
        supervisor = new FuncionarioSupervisor(coordenador);
        encarregado = new FuncionarioEncarregado(supervisor);
        adminPgt = new FuncionarioAdminPagamento(encarregado);
    }

    @Test
    void deveRetornarEncarregadoParaAssinarNotaRefeicao(){
        assertEquals("Encarregado",adminPgt.assinarDocumento(new Documento(TipoDocumentoNotaRefeicao.getTipoDocumentoNotaRefeicao())));
    }

    @Test
    void deveRetornarSupervisorParaAssinarDespesa(){
        assertEquals("Supervisor",adminPgt.assinarDocumento(new Documento(TipoDocumentoDespesa.getTipoDocumentoDespesa())));
    }

    @Test
    void deveRetornarCoordenadorParaAssinarInvestimento(){
        assertEquals("Coordenador",adminPgt.assinarDocumento(new Documento(TipoDocumentoInvestimento.getTipoDocumentoInvestimento())));
    }

    @Test
    void deveRetornarGerenteParaAssinarTerceirizado(){
        assertEquals("Gerente",adminPgt.assinarDocumento(new Documento(TipoDocumentoTerceirizado.getTipoDocumentoTerceirizado())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinarLicitacao() {
        assertEquals("Sem assinatura", adminPgt.assinarDocumento(new Documento(TipoDocumentoLicitacao.getTipoDocumentoLicitacao())));
    }
}