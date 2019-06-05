package unit_03_04_loops;

public class Drill2 {

	public static void main(String[] args) {
        int bytes = 1532300001;
        double bytesMetric = 0;
        String unit = "Byte";
        
        if (bytes / 1000 == 0) {
            bytesMetric = bytes;
        } else if (bytes / 1000000 == 0) {
            bytesMetric = bytes / 1000.0;
            unit = "KByte";
        } else if (bytes / 1000000000 == 0) {
            bytesMetric = bytes / 1000000.0;
            unit = "MByte";            
        } else {
            bytesMetric = bytes / 1000000000.0;
            unit = "GByte";                        
        }
        
        System.out.println(bytes + " Bytes are " + bytesMetric + " " + unit);
	}
}