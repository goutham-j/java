package com.javaexamples;

import java.util.ArrayList;
import java.util.List;

class Question { // base class Question
	String description;
	
	public Question() {
	}
	
	public Question(String description, Integer marks) {
		this.description = description;
	}
	
	public void setQuestion(String description) {
		this.description = description;
	} 
	
	public String getDescription() {
		return description;
	} 
	 
	
}

class MCQ extends Question { //sub class of Question
	
	Boolean result;
	
	public MCQ() {
	}
	
	public MCQ(String description, Boolean result) {
		this.description = description;
		this.result = result;
	}
}

class Paragraph extends Question { //sub class of Question
	
	Integer marks;
	
	public Paragraph() {
	}
	
	public Paragraph(String description, Integer marks) {
		this.description = description;
		this.marks = marks;
	}
	
}

class Exam { // base class Exam
	String subject;
	Integer time;
	Integer maxMarks;
	List<Question> questions = new ArrayList<Question>();
	
	public Exam() {
	}
	
	public Exam(String subject, Integer time, Integer maxMarks) {
		this.subject = subject;
		this.time = time;
		this.maxMarks = maxMarks;
	}
	
	
	public void addQuestion(String question, Integer marks) {
		
		Question q = new Question(question, marks);
		questions.add(q);
	}
	
	public void printQuestions() {
		
		for (int i=0;i<questions.size();i++) {
			System.out.println(questions.get(i).getDescription());
		}
	}
	
	public int getNoOfQuestions() {
		return questions.size();
	}
	
	public void getExamDetails() {
		System.out.println("Exam Name: " + subject);
		System.out.println("Exam Time: " + time);
		System.out.println("Exam Total: " + maxMarks);
		System.out.println("No of Questions: " + getNoOfQuestions());
		printQuestions();			
	}
}

class OnlineExam extends Exam{ // sub class of Exam
	
	public OnlineExam(){
	}
}

public class ExamPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MCQ mcq1 = new MCQ("Captial of India",10);	
		//Paragraph pq1 = new Paragraph("When will lockdown lifted", 20);
		
		//System.out.println(mcq1.getQuestion() + " " + mcq1.getMarks());
		//System.out.println(pq1.getQuestion() + " " + pq1.getMarks());
		
		Exam e = new Exam("Computer Science", 5, 100);
		
		e.addQuestion("Captial of India", 10);
		e.addQuestion("How many states in India", 10);
		
		e.getExamDetails();
	}

}
