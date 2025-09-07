package Analyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    int retrylimit = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retrylimit) {
            counter++;
            return true; //Retry the test
        }
        return false; // Don't retry the test limit
    }
}
