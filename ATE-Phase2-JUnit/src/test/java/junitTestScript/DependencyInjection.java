package junitTestScript;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
public class DependencyInjection {
	// write the code to inject test and repeatedTest annotation as an Object
	
		@org.junit.jupiter.api.RepeatedTest(5)
		public void repeatedtestdemo(TestInfo testinfo, RepetitionInfo repInfo)
		{
			
			System.out.println(testinfo.getDisplayName() + ""+ repInfo.getCurrentRepetition() );
			
		}


}
