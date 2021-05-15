package chap13;

public class ExceptionTester {

    //sum objedt in array
    public static int sum(int[] list)
    {
        int sum = 0 ;
        for (int i = 0; i <= list.length; i++)
        {
            sum += list[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{2,12,32,23,4}));
        }catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("message: " + ex.getMessage());
            System.out.println("to: " + ex.toString());
//            System.out.println("fill " + ex.fillInStackTrace());

            System.out.println("\n Tracing info obtained from getstackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i =0; i < traceElements.length; i++)
            {
                System.out.print("Method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }finally {
            System.out.println("finally init");
        }

        System.out.println("nanan");

    }

}
