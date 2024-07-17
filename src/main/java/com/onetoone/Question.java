package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int qid;
	String ques;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")
	Answer ansid;

	public Question() {
		super();

	}

	public Question(String ques) {
		super();
		this.ques = ques;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public Answer getAnsid() {
		return ansid;
	}

	public void setAnsid(Answer ansid) {
		this.ansid = ansid;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", ques=" + ques + ", ansid=" + ansid + "]";
	}

}
