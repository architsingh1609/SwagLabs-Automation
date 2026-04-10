package annotationhiarky;

import org.testng.annotations.AfterSuite;

public class aftersuite {
	
	@AfterSuite
    public void afterSuite() {
        System.out.println("After Suite Execution");
    }

}
