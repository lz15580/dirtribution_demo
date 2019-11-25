package com.demo.crowd.controller;

import com.demo.crowd.entity.ResultEntity;
import com.demo.crowd.entity.ProjectVO;
import com.demo.crowd.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/save/project/remote/{memberId}")
	public ResultEntity<String> saveProjectRemote(
			@RequestBody ProjectVO projectVO, 
			@PathVariable("memberId") String memberId) {
		
		try {
			projectService.saveProject(projectVO, memberId);
			
			return ResultEntity.successNoData();
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResultEntity.failed(e.getMessage());
		}
		
	}

}
