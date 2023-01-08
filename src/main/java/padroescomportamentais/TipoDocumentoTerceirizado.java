package padroescomportamentais;

public class TipoDocumentoTerceirizado implements TipoDocumento{

    private static TipoDocumentoTerceirizado tipoDocumentoTerceirizado = new TipoDocumentoTerceirizado();
    private TipoDocumentoTerceirizado(){};

    public static TipoDocumentoTerceirizado getTipoDocumentoTerceirizado() {
        return tipoDocumentoTerceirizado;
    }
}
