package creationalpattern.factorymethod;

public class ExcelDocument extends  Document {

	ExcelDocument(){
		this.SetDocumentType(Document.DocumentType.EXCEL);
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
