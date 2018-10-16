public class StrideCalculatorComponent {
	private double stridesTracker;
	private final int stepsPerLanding = 2;
	
	public String calculateStrides(int[] stepsPerFlight, int stepsPerStride){
		stridesTracker = (stepsPerFlight.length - 1)*stepsPerLanding;
		
		for (int i = 0; i < stepsPerFlight.length; i++) {
			if (stepsPerFlight[i] % stepsPerStride == 0) {
				stridesTracker = stridesTracker + (stepsPerFlight[i]/stepsPerStride);
	        } else {
	        	stridesTracker = stridesTracker + Math.floor(stepsPerFlight[i]/stepsPerStride);
	        	stridesTracker++;
	        }
		}
		
		return "{ \"leastNumberOfStrides\": " + Double.toString(stridesTracker) + " }";
	}
}
