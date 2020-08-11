/**
 * A 2D cartesian plane implemented as with an array. Each (x,y) coordinate can
 * hold a single item of type <T>.
 *
 * @param <T> The type of element held in the data structure
 */
public class ArrayCartesianPlane<T> implements CartesianPlane<T> {

	private Object[][] data;
	private int w;
	private int h;
	private int minimumY;
	private int maximumY;
	private int minimumX;
	private int maximumX;
    /**
     * Constructs a new ArrayCartesianPlane object with given minimum and
     * maximum bounds.
     *
     * Note that these bounds are allowed to be negative.
     *
     * @param minimumX A new minimum bound for the x values of
     *         elements.
     * @param maximumX A new maximum bound for the x values of
     *         elements.
     * @param minimumY A new minimum bound for the y values of
     *         elements.
     * @param maximumY A new maximum bound for the y values of
     *         elements.
     * @throws IllegalArgumentException if the x minimum is greater
     *         than the x maximum (and resp. with y min/max)
     */
    public ArrayCartesianPlane(int minimumX, int maximumX, int minimumY,
            int maximumY) throws IllegalArgumentException {
    	
    	if (maximumX <= minimumX || maximumY <= minimumY) {
    		throw new IllegalArgumentException("");
    	}
        // TODO: implement the constructor
    	
    	this.minimumX = minimumX;
    	this.maximumX = maximumX;
    	this.minimumY = minimumY;
    	this.maximumY = maximumY;
//    	this.w = w;
//    	this.h = h;
    	w = maximumX - minimumX;
    	h = maximumY - minimumY;
    	data = new Object[w][h];
    	clear();
    }
    
    @Override
    public void add(int x, int y, T element) throws IllegalArgumentException {
    	data[x][y] = element;
    }
    
    @SuppressWarnings("unchecked")
	@Override
	public T get(int x, int y) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return (T) data[x][y];
	}
    
    @Override
    public boolean remove(int x, int y) throws IndexOutOfBoundsException {
    	if (data[x][y] == null)
    		return false;
    	
    	data[x][y] = null;
    	return true;
    }
    
    @Override
    public void clear() {
    	for (int x = 0; x < w; x++) {
    		for (int y = 0; y < h; y++) {
    			data[x][y] = null;
    		}
    	}
    }
    
    
    
//	@Override
//	public void resize(int newMinimumX, int newMaximumX, int newMinimumY, int newMaximumY)
//			throws IllegalArgumentException {
//		
//		Object[][] newData = new Object[newW][newH];
//		
//		for (int x = 0; x < width; x++) {
//			
//		}
//		// TODO Auto-generated method stub
//		
//	}

    // TODO: you are to implement all of ArrayCartesianPlanes's methods here
}

