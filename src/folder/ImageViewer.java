package folder;

public class ImageViewer implements Viewer<Image> {

	
	private static final ViewerType viewerType = ViewerType.IMAGE;
	
	@Override
	public ViewerType getType() {
		// TODO Auto-generated method stub
		return this.viewerType;
	}



	@Override
	public void view(Image object) {
	System.out.println("Document is showed");
		
	}

}
