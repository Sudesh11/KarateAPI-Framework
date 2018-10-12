package karate.test;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(features = "src/test/resources" ) //To run all feature file
//@CucumberOptions(features = "classpath:featureFiles/GETRest_Sample.feature") //To run single feature file
public class testRunner {
	//Test Runner class to run
}












/* List of dummy REST URL used for creating demo project
1	/employee	GET	JSON	http://dummy.restapiexample.com/api/v1/employees	Get all employee data	Details
2	/employee/{id}	GET	JSON	http://dummy.restapiexample.com/api/v1/employee/1	Get a single employee data	Details
3	/create	POST	JSON	http://dummy.restapiexample.com/api/v1/create	Create new record in database	Details
4	/update/{id}	PUT	JSON	http://dummy.restapiexample.com/api/v1/update/21	Update an employee record	Details
5	/delete/{id}	DELETE	JSON	http://dummy.restapiexample.com/api/v1/update/2	Delete an employee record	Details
*/