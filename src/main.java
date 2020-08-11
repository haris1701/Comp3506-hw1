
public class main {
	
	public static void main(String[] args) {
		
		var data = new ArrayCartesianPlane<Integer>(1, 5, 1, 5);
		
		data.add(0, 0, 20);
		data.add(0, 1, 30);
		data.add(1, 0, 40);
		data.add(1, 1, 50);
		
		
		System.out.println(data);
	}
}
