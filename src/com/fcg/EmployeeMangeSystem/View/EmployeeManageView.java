package com.fcg.EmployeeMangeSystem.View;

import java.util.Scanner;

/**
 * @author 好女人蕾赛
 * @version 1.0
 */
public class EmployeeManageView {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    public void mainMue()
    {
        do {
            System.out.println("----------员工薪水管理系统--------");
            System.out.println("\t\t\t1        增加员工");
            System.out.println("\t\t\t2        删除员工");
            System.out.println("\t\t\t3        查找员工");
            System.out.println("\t\t\t4        修改薪水");
            System.out.println("\t\t\t5        打印员工信息列表");
            System.out.println("\t\t\t6        退     出");
        }while(loop);
        //用户输入选择,并判断输入的是否为int

    }
}
}
