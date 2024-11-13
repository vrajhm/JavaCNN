package ConvolutionalNN;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DataReader {
/* 
 * The point of this class is to turn the data we got from the CSV file and turn it into the double array.
*/
	
	// MNIST Image size is 28x28
	private final int rows = 28;
	private final int cols = 28;
	
	public List<Image> readData(String path){
		List<Image> images = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line;
			while((line = br.readLine()) != null) {
				String[] lineItems = line.split(",");
				double[][] data = new double[rows][cols];
				int label = Integer.parseInt(lineItems[0]);
				
				int i = 1;
				for(int row = 0; row < rows; row++) {
					for(int col = 0; col < cols; col++) {
						data[row][col] = Integer.parseInt(lineItems[i]);
						i++;
						
					}
				}
				
				images.add(new Image(data, label));
				
			}
			
		}
		
		catch (Exception e) {
			
		}
		
		return images;
		
	}

}
