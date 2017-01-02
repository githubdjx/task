package com.kojingji.task.service.intf;

import com.kojingji.task.base.Page;
import com.kojingji.task.beans.TaskDetailResultBean;
import com.kojingji.task.beans.TaskListResultBean;
import com.kojingji.task.beans.TaskParamBean;
import com.kojingji.task.models.Task;

public interface TaskService {

	public Page<TaskListResultBean> getTaskPage(TaskParamBean campaignParam,Page<TaskListResultBean> page);
	
	public TaskDetailResultBean getTaskDetail(TaskParamBean campaignParam);
	
	public Task getTaskByTId(Long tId);

}