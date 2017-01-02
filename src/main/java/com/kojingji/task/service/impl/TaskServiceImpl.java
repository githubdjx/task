package com.kojingji.task.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kojingji.task.base.Page;
import com.kojingji.task.beans.TaskDetailResultBean;
import com.kojingji.task.beans.TaskListResultBean;
import com.kojingji.task.beans.TaskParamBean;
import com.kojingji.task.dao.TaskMapper;
import com.kojingji.task.models.Task;
import com.kojingji.task.service.intf.TaskService;


@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
    private TaskMapper taskMapper;


    
    public Page<TaskListResultBean> getTaskPage(TaskParamBean taskParam,Page<TaskListResultBean> page) {
    	
    	Map<String, Object> paramMap = new HashMap<String, Object>();
    	paramMap.put("category",taskParam.getCategory());
    	
    	int count = taskMapper.selectByPageCount(paramMap);
		page.setCount(count);
		paramMap.put("start", page.getStart());
		paramMap.put("end", page.getPageSize());
		
		List<Task> tasks = taskMapper.selectByPageList(paramMap);
		List<TaskListResultBean> resultList = new ArrayList<TaskListResultBean>();
		for(Task task:tasks){
			TaskListResultBean resultBean  = new TaskListResultBean();
			BeanUtils.copyProperties(task, resultBean);
			resultList.add(resultBean);
		}
		page.setList(resultList);
        return page;
        
    }
    
	public TaskDetailResultBean getTaskDetail(TaskParamBean taskParam){
		Task task =  taskMapper.selectByPrimaryKey(taskParam.getId());
		TaskDetailResultBean resultBean  = new TaskDetailResultBean();
		BeanUtils.copyProperties(task, resultBean);
		return resultBean;
	}

	@Override
	public Task getTaskByTId(Long tId) {
		return taskMapper.selectByPrimaryKey(tId);
	}


}