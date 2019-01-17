import java.lang.reflect.Method;

public class JavaReflectionMethods{
    public static void main(String[] args) {
        
   }
}

class SampleClass {
    private String sampleField;
 
    public String getSampleField() {
       System.out.println("Function 1");
       return sampleField;
    }
 
    public void setSampleField(String sampleField) {
       System.out.println("Function 2");
       this.sampleField = sampleField;
    } 
 }
