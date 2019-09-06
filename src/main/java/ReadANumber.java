import java.util.Scanner;

public class ReadANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        String hundred;
        int tens = (number - hundreds * 100) / 10;
        String ten;
        int ones = number - hundreds * 100 - tens * 10;
        String one;

        switch (ones) {
            case 1:
                one = "one";
                break;
            case 2:
                one = "two";
                break;
            case 3:
                one = "three";
                break;
            case 4:
                one = "four";
                break;
            case 5:
                one = "five";
                break;
            case 6:
                one = "six";
                break;
            case 7:
                one = "seven";
                break;
            case 8:
                one = "eight";
                break;
            case 9:
                one = "nine";
                break;
            default:
                one = "";
        }

        switch (tens) {
            case 2:
                ten = "twenty";
                break;
            case 3:
                ten = "thirty";
                break;
            case 4:
                ten = "forty";
                break;
            case 5:
                ten = "fifty";
                break;
            case 6:
                ten = "sixty";
                break;
            case 7:
                ten = "seventy";
                break;
            case 8:
                ten = "eighty";
                break;
            case 9:
                ten = "ninety";
                break;
            default:
                ten = "teen";
        }

        switch (hundreds) {
            case 2:
                hundred = "two";
                break;
            case 3:
                hundred = "three";
                break;
            case 4:
                hundred = "four";
                break;
            case 5:
                hundred = "five";
                break;
            case 6:
                hundred = "six";
                break;
            case 7:
                hundred = "seven";
                break;
            case 8:
                hundred = "eight";
                break;
            case 9:
                hundred = "nine";
                break;
            default:
                hundred = "one";
        }

        if (number > 999 || number < 0) {
            System.out.println("Out of ability!");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number < 10) {
            System.out.println(one);
        } else if (number < 20) {
            switch (number) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                    System.out.println(one + "teen");
                    break;
                default:
                    System.out.println("ten");
            }
        } else if (number < 100) {
            System.out.println(ten + " " + one);
        } else if (number % 100 == 0) {
            System.out.println(hundred + " hundred");
        } else {
            System.out.print(hundred + " hundred and ");
            if (tens == 0) {
                System.out.println("" + one);
            } else if (tens == 1) {
                switch (ones) {
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(one + "teen");
                        break;
                    default:
                        System.out.println("ten");
                }
            } else {
                System.out.println(ten + " " + one);
            }
        }
    }
}