package com.fcg.HouseRentSystem.Service;

import com.fcg.HouseRentSystem.domin.House;

public class HouseService {
    private House[] houses;
    private House[] newHouse;
    private int ListCount = 0;//数组长度
    private int idCounter = 0;

    public HouseService(int size)
    {
        houses = new House[size];
        //houses[0] = new House(1,"江西理工","1234567","双港",2000,"未出租");
    }

    //返回所有房屋信息
    public House[] list()
    {
        return houses;
    }

    //add方法，将用户添加新的对象存入数组
    public boolean add(House house)
    {
        //如果大于设定大小，则进行扩容
        if(ListCount >= houses.length)
        {
            //将house数组扩容
            newHouse = new House[houses.length + 1];
            for(int i = 0 ; i < houses.length ; i++)
            {
                newHouse[i] = houses[i];
            }
            houses = newHouse;
        }
        //添加新对象到数组,增加一个新房屋
        houses[ListCount] = house;
        ListCount++;
        //自动产生id，并更新到id
        ++idCounter;
        house.setId(idCounter);
        return true;
    }

    //查找房源
    public House find(int aid)
    {
        //遍历所以房源，找到id相同的
        int indext = -1;
        for(int i = 0 ; i < ListCount ; i++)
        {
            if(aid == houses[i].getId())
            {
                indext = i;
                break;
            }
        }
        return houses[indext];

    }


    //删除用户输入的房屋
    public boolean delect(int id)
    {
        int indext = -1;//这里很有用技巧
        //遍历数组找到编号为id的房子
        for(int i = 0 ; i < ListCount ; i++)//先找到这个数，各司其职
        {
            if(id == houses[i].getId())
            {
                indext = i;
            }
        }
        //没找到id
        if(indext == -1)
        {
            return false;
        }
        //找到了，开始删除，从删除的数往前移动一个
        for(int j = indext ; j < ListCount - 1 ; j++)
        {
            houses[j] = houses[j + 1];
        }
        //将最后一个元素置空
        houses[ListCount - 1] = null;
        ListCount--;
        return true;
    }

    //修改房屋信息
    public void change(House house)
    {
        //遍历数组找到该房屋
        for(int i = 0 ; i < ListCount ; i++)
        {
            if(house.getId() == houses[i].getId())
            {
                houses[i] = house;
            }
        }
    }


}
