/*-->there are majorly 2 types of data types : primitive data type, reference data type
-->primitive data types directly store the values directly allocate/store the values at the assigned memory
space while reference data type store some other memory address where the value has been stored.
-->8 primitive data types are: byte short int long float double char boolean*/
public class ConversionFun {
    public static void main(String[] args)
    {
        double myDouble = 3.14;
        float myFloat = 3.14f;/*not using f at end will show error as 3.14 is taken as double cannot be taken
        as float , here we are trying to fit large into small(shrinkage)*/
        double yourDouble = myFloat;
        //Reverse conversion does not requires any speciality as we go from small to large(expanding)
    }
}
