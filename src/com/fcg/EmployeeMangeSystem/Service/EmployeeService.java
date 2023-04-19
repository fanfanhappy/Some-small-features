package com.fcg.EmployeeMangeSystem.Service;

import com.fcg.EmployeeMangeSystem.domin.Employee;

import java.util.HashMap;

/**
 * @author 好女人蕾赛
 * @version 1.0
 */
public class EmployeeService {
    HashMap<String , Employee> hashMap = new HashMap<>();

    //增加员工
    public void EmployeeInsert(Employee e)
    {
        hashMap.put(e.getId() , e);
    }

    //删除员工  id删除
    public void EmployeeDelect(String id)
    {
        hashMap.remove(id);
    }

}
