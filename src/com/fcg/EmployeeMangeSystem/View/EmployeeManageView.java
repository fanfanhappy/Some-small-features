package com.fcg.EmployeeMangeSystem.View;

import com.fcg.EmployeeMangeSystem.Service.EmployeeService;
import com.fcg.EmployeeMangeSystem.domin.Employee;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 好女人蕾赛
 * @version 1.0
 */
public class EmployeeManageView {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    EmployeeService employeeService = new EmployeeService();
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
            //用户输入选择,并判断输入的是否为int
            System.out.print("请输入你的选择（1-6）:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1://增加员工
                {
                    EmployeeInsert();
                    break;
                }
                case 2:// 删除员工
                {

                }
                case 3://查找员工
                {

                }
                case 4 ://修改薪水
                {

                }
                case 5 ://打印员工信息列表
                {
                    EmployeeList();
                    break;
                }
                case 6 ://退     出
                {
                    loop = false;
                    break;
                }
            }
        }while(loop);

    }

    //增加员工
    public void EmployeeInsert()
    {
        Employee employee = new Employee();
        System.out.print("员工姓名：");
        employee.setName(scanner.next());
        System.out.print("员工id：");
        employee.setId(scanner.next());
        System.out.print("薪水：");
        employee.setSal(scanner.nextDouble());
        employeeService.add(employee.getId() , employee);
    }

    //打印员工列表
    public void EmployeeList()
    {
        HashMap list = employeeService.List();
        Set set = list.keySet();
        for(Object o : set)
        {
            System.out.println(list.get(o));
        }


    }
}
