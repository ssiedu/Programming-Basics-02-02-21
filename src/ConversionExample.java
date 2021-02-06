
public class ConversionExample {

    public static void main(String[] args) {

        //types are same    (converion is not required)
            int v1=10;              //var and value both are of type int
            double v2=2.5;          //var and value both are of type double
        
        //types are diff
            //case-a    (no error)(implicit (automatic) conversion
            long v3=55;     //var long, value int   (int->long)
            double v4=25;   //var double, value int (int->double)
            
            //case-b    (explicit conversion) (force-fully conversion)
            int v5=(int) 5.23;      //converting a double value to int
            float v6=(float) 2.24;  //converting a double value to float
            
            //case-c    (conversion is not possible)
            //double v7=(double)true;
            //boolean v8=(boolean)1;
     
            //assigning a floating point number to integral variable
            long v9=(long) 24.5f;
            
    }
}
