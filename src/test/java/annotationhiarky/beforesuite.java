package annotationhiarky;

import org.testng.annotations.BeforeSuite;

public class beforesuite {
	
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite Execution");
    }

}
