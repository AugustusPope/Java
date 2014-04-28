package creationalpattern.factorymethod;

public class DocumentFactory {
	
	public DocumentFactory(){
		
	}
	
	public Document GetDocument(Document.DocumentType documentType){
		
		switch(documentType){
			case PDF :
				return new PdfDocument();
			case EXCEL :
				return new ExcelDocument();
			case WORD:
				return new WordDocument();
		    default:
		    	return null;
		}
		
		
	}

}
