package com.kojingji.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kojingji.task.base.Page;
import com.kojingji.task.beans.TaskDetailResultBean;
import com.kojingji.task.beans.TaskListResultBean;
import com.kojingji.task.beans.TaskParamBean;
import com.kojingji.task.service.intf.TaskService;
 @Controller
 @RequestMapping("/task")
 public class TaskController {
     
	 @Autowired
	 private TaskService taskService;
     
    
 
     @RequestMapping("/getTaskList")
     public String getTaskList(TaskParamBean taskParam , Model model){
    	Page<TaskListResultBean> page = new Page<TaskListResultBean>();
 		page.setCurrentPage(taskParam.getPageNumber());
 		page.setPageSize(taskParam.getPageSize());
 		 Page<TaskListResultBean> resultPage = taskService.getTaskPage(taskParam,page);
         for(TaskListResultBean task : resultPage.getList()){
        	 System.out.println("["+task.getName()+"]");
         }
         model.addAttribute("page", resultPage);
         return "index";
     }
     
     @RequestMapping("/getTaskDetail")
     public String getTaskDetail(TaskParamBean taskParam,Model model){
 		 TaskDetailResultBean resultBean = taskService.getTaskDetail(taskParam);
         System.out.println("["+resultBean.getName()+"]");
         model.addAttribute("task", resultBean);
         return "index";
     }
 
 }
 
