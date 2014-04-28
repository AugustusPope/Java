package creationalpattern.factorymethod;

public class Document implements IDocument {
	
	private DocumentType _DocumentType;
	private String _DocumentName;
	
	
	protected void SetDocumentType(DocumentType dt){
		this._DocumentType = dt;
	}
	
	
	public String GetDocumentName(){
		return this._DocumentName;
	}
	
	public DocumentType GetDocumentType(){
		return this._DocumentType;
	}
	
	public static enum DocumentType{
		PDF,
		EXCEL,
		WORD
	}
	

	@Override
	public void Open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub

	}

}
