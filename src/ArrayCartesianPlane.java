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
//	private int minimumY;
//	private int maximumY;
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
    	
    	if (maximumX <= minimumX || maximumY <= minimumX) {
    		throw new IllegalArgumentException("")
    	}
        // TODO: implement the constructor
    	
    	this.minimumX = minimumX;
    	this.maximumX = maximumX;
    	this.minimumY = minimumY;
    	this.maximumY = maximumY;
    	data = new Object[][];
    	clear();
    }
    
    
    @Override
    public void add(int x, int y, T element) throws IllegalArgumentException {
    	data[x][y] = element;
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
    
    
    public void resize( ) {
    	
    }

    // TODO: you are to implement all of ArrayCartesianPlanes's methods here
}

