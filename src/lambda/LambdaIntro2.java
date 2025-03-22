package lambda;

//functional interface
@FunctionalInterface
public interface LambdaIntro2 {
    void m1();


}
//functional interface
@FunctionalInterface
interface SumInterface
{
    void sum();


}
@FunctionalInterface
interface SubInterface
{
    void sub(int num1, int num2);

}

interface MultiplyInterface
{
    int product(int num1, int num2);

}

class Stress
{
    public static void main(String[] args) {
//        anonymous class object
        LambdaIntro2 obj = new LambdaIntro2()
        {
            @Override
            public void m1()
            {
                System.out.println("overriding m1 while creating obj using anonympus class");
            }

        };
        obj.m1();
        LambdaIntro2  obj2 = () -> System.out.println("overridden m1 using lambda");
        obj2.m1();
        SumInterface obj3 = new SumInterface() {
            @Override
            public void sum() {
                System.out.println(10+30);
            }
        };

        obj3.sum();
        SumInterface obj4 = () -> System.out.println("overridden  sum using lambda");
        SubInterface obj5 = new SubInterface() {
            @Override
            public void sub(int num1, int num2) {
                System.out.println("sub value"+ (num1-num2));
            }
        };

        obj5.sub(8,9);

     SubInterface obj6 = (num1,num2) -> System.out.println("numbers are(lambdas)"+(num1-num2));
     obj6.sub(9,8);
     MultiplyInterface obj7 = new MultiplyInterface() {
         @Override
         public int product(int num1, int num2) {
             System.out.println("---------");
             return num1*num2;
         }
     };

        int res = obj7.product(9,7);
        System.out.println("res ="+res);
//     Multi

        MultiplyInterface obj8 = (num1,num2) ->  num1*num2;
        int res2 = obj8.product(8,6);
        System.out.println("product is : "+res2);

        MultiplyInterface obj9 = new MultiplyInterface() {
            @Override
            public int product(int num1, int num2) {
                return num1*num2;

            }
        };
        System.out.println(obj9.product(5,6));
      MultiplyInterface obj10 = (num1, num2) -> num1 * num2 *num2;

      int res1 =obj10.product(10,20);
        System.out.println("res"+res1);









    }
}
