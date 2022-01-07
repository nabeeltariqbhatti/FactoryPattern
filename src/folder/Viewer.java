package folder;

public interface Viewer<T extends Object> {
	ViewerType getType();
	void view(T object);

}
