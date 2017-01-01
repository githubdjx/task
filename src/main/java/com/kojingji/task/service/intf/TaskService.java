package com.kojingji.task.service.intf;

import com.kojingji.task.base.Page;
import com.kojingji.task.beans.TaskDetailResultBean;
import com.kojingji.task.beans.TaskListResultBean;
import com.kojingji.task.beans.TaskParamBean;

public interface TaskService {

	public Page<TaskListResultBean> getTaskPage(TaskParamBean taskParam,Page<TaskListResultBean> page);
	
	public TaskDetailResultBean getTaskDetail(TaskParamBean taskParam);


}