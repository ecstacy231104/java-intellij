package exceptionhandling;
class AgeNotValid extends Exception
{
    AgeNotValid(String message)
    {
        super(message);
    }
}

public class Throws_ex3 {
    public static void age_verifier(int age) throws AgeNotValid
    {

            if (age < 0) {
                throw new AgeNotValid("error: age can't be negative");

            }



    }

    public static void main(String[] args) {

        try{
            Throws_ex3.age_verifier(-19);

        }catch(Exception e){

        }
    }
}

