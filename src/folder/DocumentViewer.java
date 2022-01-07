package folder;

public class DocumentViewer implements Viewer<Document> {

	
	private static final ViewerType viewerType = ViewerType.DOCUMENT;
	
	@Override
	public ViewerType getType() {
		// TODO Auto-generated method stub
		return this.viewerType;
	}



	@Override
	public void view(Document object) {
	System.out.println("Document is showed");
		
	}

}
