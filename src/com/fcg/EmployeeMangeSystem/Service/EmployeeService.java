package com.fcg.EmployeeMangeSystem.Service;

import com.fcg.EmployeeMangeSystem.domin.Employee;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 好女人蕾赛
 * @version 1.0
 */
public class EmployeeService {
    HashMap<String , Employee> hashMap = new HashMap<>();

    //定义add方法 将员工加入Map
    public boolean add(String key , Employee e)
    {
       hashMap.put(key , e);
       return true;
    }

    //得到Map中的key
    public HashMap List()
    {
        return hashMap;
    }


}
