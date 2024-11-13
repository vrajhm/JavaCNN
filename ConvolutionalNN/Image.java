package ConvolutionalNN;

public class Image {
	private double[][] data;   //Refers to the co-ord value data from CSV file
	private int label;		   //The label or "character" it is referring to
	
	
	public double[][] getData() {
		return data;
	}


	public int getLabel() {
		return label;
	}


	public Image(double[][] data, int label) {
		this.data = data;
		this.label = label;
	}
	
	public String toString() {
		String s = label + ", \n";
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				s += data[i][j] + ", ";
			}
			s += "\n";
		}
		
		return s;
	}
	
	
	
}
