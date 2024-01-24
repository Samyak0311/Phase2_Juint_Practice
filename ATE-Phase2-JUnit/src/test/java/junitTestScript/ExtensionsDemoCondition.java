package junitTestScript;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensionsDemoCondition {
	@Test
	@EnabledOnOs(OS.MAC)
	// condition is If the OS is Mac -> run the test else ignore/disable the test
	public void testConditionOS()
	{
		System.out.println("OS is matching and test is exeucted");
	}
	
	
	@Test
	@EnabledOnJre(JRE.JAVA_14)
	// condition is If the java version on laptop is 14 -> run the test else ignore/disable the test
	public void testConditionJRE()
	{
		System.out.println("Java version is matching and test is exeucted");
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_10, max= JRE.JAVA_21)
	// condition is If the java version on laptop is in between 10 to 17 -> run the test else ignore/disable the test
	public void testConditionJRErange()
	{
		System.out.println("Java version is matching and test is exeucted");
	}
	
	@Test
	@EnabledIfSystemProperty(named="java.vm.vendor", matches="Oracle.*")
	// condition is If the java version is provided by oracle-> run the test else ignore/disable the test
	public void testConditionSystemProperty()
	{
		System.out.println("Java version is installed by oracle and test is exeucted");
	}
}
