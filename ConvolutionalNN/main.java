package ConvolutionalNN;

import java.util.List;


public class main {
    public static void main(String[] args) {
        List<Image> images = new DataReader().readData("Data/mnist_test.csv");
        System.out.printf(images.get(0).toString());
    }
}
