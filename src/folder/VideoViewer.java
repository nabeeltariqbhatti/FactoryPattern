package folder;

public class VideoViewer implements Viewer<Video> {

	
	private static final ViewerType viewerType = ViewerType.VIDEO;
	
	@Override
	public ViewerType getType() {
		// TODO Auto-generated method stub
		return this.viewerType;
	}



	@Override
	public void view(Video object) {
	System.out.println("Video is showed");
		
	}

}
