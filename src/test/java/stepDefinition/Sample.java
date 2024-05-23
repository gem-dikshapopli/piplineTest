package stepDefinition;

import com.gemini.generic.reporting.GemEcoUpload;
import implementation.SampleImplementation;
import io.cucumber.java.en.Given;


public class Sample extends GemEcoUpload {
    @Given("^search for the shoes$")
    public void searchForTheShoes(){
        try{
            SampleImplementation.shoesSearch();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
