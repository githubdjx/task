package com.kojingji.task.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kojingji.task.dao.RegistrationMapper;
import com.kojingji.task.models.Task;
import com.kojingji.task.models.Registration;
import com.kojingji.task.service.intf.TaskService;
import com.kojingji.task.service.intf.RegistrationService;


@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
    private RegistrationMapper registrationMapper;
	
	@Autowired
    private TaskService taskService;


    
    public boolean saveRegistration(Long tId,String qqId) throws Exception {
    	
    	
    	
    	
    	Task task = taskService.getTaskByTId(tId);
    	Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("tId", tId);
		paramMap.put("qqId", qqId);
    	Registration record = registrationMapper.selectByQqIdAndCid(paramMap);
    	
    	if(record==null){
    		record = new Registration();
    	}else{
    		throw new Exception("已经报过名了哦！");
    	}
    	record.settId(tId);
    	record.setQqId(qqId);
    	record.setRegistTime(new Date());
    	if(task.getRegistIsCharge()==1){
	    	record.setStatus(1);//待支�?
	    	record.setIsNeedPay(1);//�?���?
	    	record.setIsPay(0);//未支�?
	    	record.setRegistFee(task.getRegistFee());//报名费用
    	}else{
    		record.setStatus(2);//已支�?
	    	record.setIsNeedPay(0);//无需付款
	    	record.setIsPay(0);//未支�?
	    	record.setRegistFee(0L);
	    	record.setPayTime(new Date());
    	}
        int result = registrationMapper.insertSelective(record);
        if(result>0){
        	return true;
        }else{
        	return false;
        }
    }

}