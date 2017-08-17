package com.taogaokao.assessment.modules.Base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taogaokao.assessment.modules.Base.dao.CtOptionDao;
import com.taogaokao.assessment.modules.Base.dao.CtQuestionDao;
import com.taogaokao.assessment.modules.Base.dao.CtTitleDao;
import com.taogaokao.assessment.modules.Base.entity.CtOption;
import com.taogaokao.assessment.modules.Base.entity.CtQuestion;
import com.taogaokao.assessment.modules.Base.entity.CtTitle;

@Service
@Transactional(readOnly=true)
public class CareerPlanningService {

	@Autowired
	private CtTitleDao dao;
	
	@Autowired
	private CtQuestionDao questionDao;
	
	@Autowired
	private CtOptionDao optionDao;
	
	public CtTitle findCtTitle(String id) {
		CtTitle ctTitle = new CtTitle();
		ctTitle = dao.get(id);
		ctTitle.setId(id);
		CtQuestion question = new CtQuestion();
		question.setTitleId(id);
		List<CtQuestion> questions = questionDao.findAllList(question);
		for(CtQuestion q : questions){
			CtOption op = new CtOption();
			op.setQuestionId(q.getQuestionId());
			List<CtOption> options = optionDao.findAllList(op);
			q.setOptions(options);
		}
		
		ctTitle.setQuestions(questions);
		return ctTitle;
	}

	public List<CtTitle> findAllCtT() {
		List<CtTitle> ctTitle = dao.findALL();
		return ctTitle;
	}

}
