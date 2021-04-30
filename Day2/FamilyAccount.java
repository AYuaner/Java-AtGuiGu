class FamilyAccount{
    public static void main(String[] args){
        boolean quiteFlag = true;
        String accountDetail = "操作类型\t剩余金额\t收支金额\t备注\n",remarks;
        int changedMoney,totalMoney = 10000;

        while(quiteFlag) {
            //主界面
            System.out.println("---------------------------------------");
            System.out.println("       1.查看账单");
            System.out.println("       2.收入登记");
            System.out.println("       3.支出登记");
            System.out.println("       4.退出");
            System.out.print("请输入操作数[1~4]：");
            
            char selection = Tools.readOperation();
            switch(selection) {
                case '1'://“查看账单”功能
                    System.out.println("---------------------------------------");
                    System.out.println(accountDetail);
                    System.out.println("---------------------------------------");
                    break;

                case '2'://“收入登记”功能
                    System.out.print("收入金额：");
                    changedMoney = Tools.readNumber();
                    System.out.print("备注：");
                    remarks = Tools.readRemarks();

                    totalMoney += changedMoney;
                    accountDetail += "收入\t" + totalMoney+"\t" + changedMoney+"\t" + remarks+"\n";
                    System.out.println("-登记完成-");
                    break;

                case '3'://“支出登记”功能
                    System.out.print("支出金额：");
                    changedMoney = Tools.readNumber();
                    System.out.print("备注：");
                    remarks = Tools.readRemarks();

                    totalMoney -= changedMoney;
                    accountDetail += "支出\t" + totalMoney+"\t" + changedMoney+"\t" + remarks+"\n";
                    System.out.println("-登记完成-");
                    break;
                    
                case '4'://“退出”功能
                    System.out.print("请确认是否退出<Y/N>:");
                    char isExit = Tools.readQuite();
                    if(isExit == 'Y' || isExit == 'y') {
                        quiteFlag = false;
                    }
            }
        }
    }
}