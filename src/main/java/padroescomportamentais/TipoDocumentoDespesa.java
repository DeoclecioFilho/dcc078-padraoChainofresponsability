package padroescomportamentais;

public class TipoDocumentoDespesa implements TipoDocumento{

    private static TipoDocumentoDespesa tipoDocumentoDespesa = new TipoDocumentoDespesa();
    private TipoDocumentoDespesa(){};

    public static TipoDocumentoDespesa getTipoDocumentoDespesa() {
        return tipoDocumentoDespesa;
    }
}
