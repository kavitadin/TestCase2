package Runner;

package api.cucumber.runner

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/posts.feature"}, glue = {Steps}
        public class PostRunner {

        }