public class SwitchCasePRac {

    int result=0;

    public int performOperation(String opName, int a, int b){
        switch (opName){
            case "add":
                result = a+b; break;
            case "substract":
                result = a-b; break;
            case "multiply":
                result = a*b; break;
            case "divide":
                result = a/b; break;

            default:
                result = a*b;
        }

       return result;
    }

    public static void main(String[] args) {
        SwitchCasePRac switchCasePRac = new SwitchCasePRac();

        System.out.println("add --" + switchCasePRac.performOperation("add", 10, 40));
        System.out.println("substract --" + switchCasePRac.performOperation("substract", 100, 40));
        System.out.println("multiply --" + switchCasePRac.performOperation("multiply", 10, 40));
        System.out.println("divide --" + switchCasePRac.performOperation("divide", 200, 40));
        System.out.println("default --" + switchCasePRac.performOperation("", 200, 40));
    }
}