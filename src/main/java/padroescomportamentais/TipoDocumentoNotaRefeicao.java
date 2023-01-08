package padroescomportamentais;

public class TipoDocumentoNotaRefeicao implements TipoDocumento{

    private static TipoDocumentoNotaRefeicao tipoDocumentoNotaRefeicao = new TipoDocumentoNotaRefeicao();
    private TipoDocumentoNotaRefeicao(){};

    public static TipoDocumentoNotaRefeicao getTipoDocumentoNotaRefeicao() {
        return tipoDocumentoNotaRefeicao;
    }
}
