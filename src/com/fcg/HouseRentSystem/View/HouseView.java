package com.fcg.HouseRentSystem.View;

import com.fcg.HouseRentSystem.Service.HouseService;
import com.fcg.HouseRentSystem.domin.House;
import com.fcg.HouseRentSystem.utils.Utilitys;
import jdk.nashorn.internal.ir.CallNode;


import java.util.Scanner;

public class HouseView {

    boolean loop = true;
    char key;
    HouseService houseService = new HouseService(3);
    Scanner scanner = new Scanner(System.in);

    //菜单显示
    public void mainMue() {
        do {
            System.out.println("-------------------房屋出租系统------------");
            System.out.println("\t\t\t1      新增房屋");
            System.out.println("\t\t\t2      查找房屋");
            System.out.println("\t\t\t3      删除房屋");
            System.out.println("\t\t\t4      修改房屋信息");
            System.out.println("\t\t\t5      房屋列表");
            System.out.println("\t\t\t6      退    出");
            System.out.print("请输入选项  1-6 ：");
            key = Utilitys.readChar();
            switch (key) {
                case '1'://新增房屋
                {
                    AddHouse();
                    break;
                }
                case '2'://查找房屋
                {
                    FindHouse();
                    break;
                }
                case '3'://删除房屋
                {
                    DelectHouse();
                    break;
                }
                case '4'://修改房屋信息
                {
                    ChangeHouse();
                    break;
                }
                case '5'://房屋列表
                {
                    HoseList();
                    break;
                }
                case '6'://退    出
                {
                    quit();
                    System.out.println("程序退出。。。。");
                    break;
                }
            }
        } while (loop);
    }

    //添加房屋
    public void AddHouse()
    {
        System.out.println("===========添加房屋=========");
        System.out.print("姓名：");
        String name = Utilitys.readString(20);
        System.out.print("电话：");
        String iphonenum = Utilitys.readString(20);
        System.out.print("地址：");
        String address = Utilitys.readString(20);
        System.out.print("月租：");
        double mouthRent = scanner.nextDouble();
        System.out.print("状态：");
        String state = Utilitys.readString(3);
        House house = new House(0, name, iphonenum, address, mouthRent, state);//创建一个新house，储存用户信息
        //调用add方法，将新对象存入数组
        if(houseService.add(house) == true)
        {
            System.out.println("========添加成功=======");
        }
        else
        {
            System.out.println("=========添加失败=======");
        }
    }

    //查找房源
    public void FindHouse()
    {
        System.out.println("-------------查找房屋--------");
        System.out.print("请输入你要查找的id：");
        int findid = Utilitys.readInt();
        //调用find方法找到该id房源
        System.out.println(houseService.find(findid));
    }

    //删除房源
    public void DelectHouse()
    {
        System.out.println("------------删除房源---------");
        System.out.print("请选择删除房屋编号（-1）退出：");
        int aid = Utilitys.readInt();
        if(aid == -1)//输入-1则退出删除房源
        {
            System.out.println("---------退出删除------");
            return;
        }
        System.out.print("确认是否删除（y/n）：请小心选择：");
        String choice = Utilitys.readString(1);
        if(choice.equals("n"))//再次判断是否退出删除
        {
            System.out.println("---------退出删除------");
            return;
        }
        //调用delect方法进行删除
        if(houseService.delect(aid) == true)
        {
            System.out.println("---------删除完成-------");
        }
        else
        {
            System.out.println("-------删除错误--------");
        }

    }

    //房屋列表
    public void HoseList()
    {
        System.out.println("-----------房屋列表--------------");
        System.out.println("编号" + "\t\t" + "房主" + "\t\t" + "电话" + "\t\t" + "地址" + "\t\t" + "月租" + "\t\t" +
                "状态（未出租/已出租）");
        House[] houses = houseService.list();
        for(int i = 0 ; i < houses.length ; i++)
        {
            if(houses[i] == null)
            {
                break;
            }
            System.out.println(houses[i]);
        }
    }

    //修改房屋信息
    public void ChangeHouse()
    {
        System.out.print("请选择修改房屋的编号（-1退出）：");
        int num = scanner.nextInt();
        System.out.print("姓名" + "(" + houseService.find(num).getName() + ")" + ":");
        String changename = scanner.next();
        System.out.print("电话" + "(" + houseService.find(num).getIphonenum() + ")" + ":");
        String changepnumber = scanner.next();
        System.out.print("地址" + "(" + houseService.find(num).getAddress() + ")" + ":");
        String changeaddress = scanner.next();
        System.out.print("租金" + "(" + houseService.find(num).getMouthRent() + ")" + ":");
        double changeMouthRent = scanner.nextDouble();
        System.out.print("状态" + "(" + houseService.find(num).getState() + ")" + ":");
        String changeState = scanner.next();

        //创建一个新房屋存放
        House house = new House(num, changename, changepnumber, changeaddress, changeMouthRent, changeState);
        //调用change方法进行修改
        houseService.change(house);
        System.out.println("---------------修改完成-------------");
    }

    //退出
    public void quit()
    {
        char c = Utilitys.readConfirmSelection();
        if(c == 'y')
        {
            loop = false;
        }
    }
}

