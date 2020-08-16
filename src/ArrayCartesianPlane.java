/**
 * A 2D cartesian plane implemented as with an array. Each (x,y) coordinate can
 * hold a single item of type <T>.
 *
 * @param <T> The type of element held in the data structure
 */
public class ArrayCartesianPlane<T> implements CartesianPlane<T> {

	private Object[][] data;
	private int width;
	private int height;
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
    @SuppressWarnings("unchecked")
	public ArrayCartesianPlane(int minimumX, int maximumX, int minimumY,
            int maximumY) throws IllegalArgumentException {
    	
    	if (maximumX <= minimumX || maximumY <= minimumY) {
    		throw new IllegalArgumentException("Max X(Y) is less than Min X(Y)");
    	}
        // TODO: implement the constructor
    	
    	this.minimumX = minimumX;
    	this.maximumX = maximumX;
    	this.minimumY = minimumY;
    	this.maximumY = maximumY;
    	
    	
//    	width = 
//    	height = maximumY - minimumY;
    	
    	this.width = (maximumX - minimumX) + 1;
    	this.height = (maximumY - minimumY) + 1;
    	
    	
    	data = new Object[width][height];
    	System.out.println("data " + data[1][1]);
    	
//		clear();		
    	
//    	if (maximumX <= minimumX || maximumY <= minimumY) {
//    		throw new IllegalArgumentException();
//    	}
//    	
//    	this.minimumX = minimumX;
//    	this.maximumX = maximumX;
//    	this.minimumY = minimumY;
//    	this.maximumY = maximumY;
//    	
//    	data = new Object[minimumX][maximumX][minimumY][maximumY];
    }
    
    @Override
    public void add(int x, int y, T element) throws IllegalArgumentException {
    	
    	if (x < 0 || y < 0 || x >= width || y >= height) {
    		throw new IllegalArgumentException();
    	}
    	
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
    	for (int x = 0; x < width; x++) {
    		for (int y = 0; y < height; y++) {
    			data[x][y] = null;
    		}
    	}
    }

		// TODO Auto-generated method stub

    
    
    
	@Override
	public void resize(int newMinimumX, int newMaximumX, int newMinimumY, int newMaximumY)
			throws IllegalArgumentException {
		
		
//		this.width = (maximumX - minimumX) + 1;
		if (newMaximumX <= newMinimumX || newMaximumY <= newMinimumY) {
    		throw new IllegalArgumentException("Max X(Y) is less than Min X(Y)");
    	} 
		
		int newWidth = (newMaximumX - newMinimumX) + 1;
		int newHeight = (newMaximumY - newMinimumY) + 1;
//		Object[][][][] newData = new Object[newMinimumX][newMaximumX][newMinimumY][newMaximumY];
		Object[][] newData = new Object[newWidth][newHeight];

		
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (data[x][y] != null) {
					if (x >= newWidth || y >= newHeight)
						throw new IllegalArgumentException("Elements Lost");
					
					newData[x][y] = data[x][y];
				}
			}
		}
		// TODO Auto-generated method stub
		data = newData;
	}

    // TODO: you are to implement all of ArrayCartesianPlanes's methods here
}

