package creationalpattern.factorymethod;

public class WordDocument extends  Document {
	
	WordDocument(){
		this.SetDocumentType(Document.DocumentType.WORD);
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
