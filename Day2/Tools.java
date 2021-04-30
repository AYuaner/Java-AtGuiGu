import java.util.Scanner;

public class Tools{
    static Scanner scanner = new Scanner(System.in);

    //功能1 获取操作数
    public static char readOperation(){
        char temp;
        while(true){
            String operation = scanner.next();
            temp = operation.charAt(0);
            if(temp != '1' && temp != '2' && temp != '3' && temp != '4')
                System.out.print("请重新输入：");
            else break;
        }
        return temp;
    }

    //功能2 读取收支金额
    public static int readNumber() {
        int returnNumber;
        while(true) {
            String number = scanner.next();
            try{
                returnNumber = Integer.parseInt(number);
                break;
            }catch(NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return returnNumber;
    }

    //功能3 读取备注
    public static String readRemarks() {
        String returnString = scanner.next();
        return returnString;
    }

    //功能4 判断是否退出
    public static char readQuite() {
        char returnFlag;
        while(true) {
            String flag = scanner.next();
            returnFlag = flag.charAt(0);
            if(returnFlag != 'Y' && returnFlag != 'N' && returnFlag != 'y' && returnFlag != 'n')
                System.out.print("输入有误，请重新输入：");
            else break;
        }
        return returnFlag;
    }
}