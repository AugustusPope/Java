package creationalpattern.factorymethod;

public class Test {
	 public static void main(String[] args){
         creationalpattern.factorymethod.DocumentFactory factory = new creationalpattern.factorymethod.DocumentFactory();
         creationalpattern.factorymethod.Document dt = null;
         dt = factory.GetDocument(creationalpattern.factorymethod.Document.DocumentType.EXCEL);
         System.out.println(dt.GetDocumentType());
         dt = factory.GetDocument(creationalpattern.factorymethod.Document.DocumentType.PDF);
         System.out.println(dt.GetDocumentType());
         dt = factory.GetDocument(creationalpattern.factorymethod.Document.DocumentType.WORD);
         System.out.println(dt.GetDocumentType());
  }

}
