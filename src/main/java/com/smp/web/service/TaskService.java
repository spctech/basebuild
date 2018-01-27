package com.smp.web.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smp.web.dao.TaskDAO;
import com.smp.web.entity.Task;
@Service
public class TaskService implements ITaskService {
	@Autowired
	private TaskDAO taskdao;
	
	@Override
	public long getAllTasks(){
		return taskdao.count();
	}
	/*@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}	
	@Override
	public synchronized boolean addArticle(Article article){
                if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
    	            return false;
                } else {
    	            articleDAO.addArticle(article);
    	            return true;
                }
	}
	@Override
	public void updateArticle(Article article) {
		articleDAO.updateArticle(article);
	}
	@Override
	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}*/
} 


