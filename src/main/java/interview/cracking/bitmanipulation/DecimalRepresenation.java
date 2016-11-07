package interview.cracking.bitmanipulation;

public class DecimalRepresenation {

//    100.0100110011

    public static void main(String[] args) {
        String decimalNumber = "4.3";
        System.out.println(convertToBinary(decimalNumber));
    }

    private static String convertToBinary(String decimalNumber) {
        String[] splits = decimalNumber.split("\\.");

        int integerPart = Integer.parseInt(splits[0]);
        int decimalPart = Integer.parseInt(splits[1]);

        StringBuilder resultIntegerPart = new StringBuilder();
        StringBuilder resultDecimalPart = new StringBuilder();


        while (integerPart != 0) {
            resultIntegerPart.append(integerPart & 1);
            integerPart = integerPart >> 1;
        }



        return resultIntegerPart.reverse().toString();
    }

}
