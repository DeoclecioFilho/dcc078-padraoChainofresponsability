package padroescomportamentais;

public class TipoDocumentoLicitacao implements TipoDocumento{

    private static TipoDocumentoLicitacao tipoDocumentoLicitacao = new TipoDocumentoLicitacao();

    private TipoDocumentoLicitacao(){};

    public static TipoDocumentoLicitacao getTipoDocumentoLicitacao(){
        return tipoDocumentoLicitacao;
    }
}
