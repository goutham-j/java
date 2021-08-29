package com.examportal;

import java.util.*;
import java.time.*;

enum Etype {ONLINE, IN_PERSON};
enum Category {EASY, MEDIUM, DIFFICULT};
enum Topic {GENERAL, CURRENT_AFFAIRS, NATIONAL};
enum Qtype {MCQ, FILL, PARAGRAPH, CONCEPT, AUDIO, VIDEO};

// Base Class Question
class Question { 

	Category 	category; //Question HAS A Category
	Topic 		topic; //Question HAS A Topic
	Qtype 		qType;
	String 		question;
	Double 		time;
	Double 		marks;
	
	public Question() {}
	
	public Question(Category category, Topic topic, Qtype qType, String question, Double time, Double marks) {
		this.category = category;
		this.topic = topic;
		this.qType = qType;
		this.question = question;
		this.time = time;
		this.marks = marks;
	}
	
	public void setQuestion(Category category, Topic topic, Qtype qType, String question, Double time, Double marks) {
		this.category = category;
		this.topic = topic;
		this.qType = qType;
		this.question = question;
		this.time = time;
		this.marks = marks;
	}
	
	public void setOptions(String... options) {}
	
	public void setKey(String key) {}
	
	public String toString() {
		return category +  " " + topic +  " " +  qType +  " " + question +  " " + time + " " + marks;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public Topic getTopic() {
		return topic;
	}
	
	public Qtype getQtype() {
		return qType;
	}
}

//Sub Class MCQ_Question
class MCQ_Question extends Question { // MCQ IS A Question
	
	List<String> 	options = new ArrayList<String>();
	String 			key;
	
	public MCQ_Question() {}
	
	public MCQ_Question(Category category, Topic topic, Qtype qType, String question, Double time, 
			Double marks) {
		this.category = category;
		this.topic = topic;
		this.qType = qType;
		this.question = question;
		this.time = time;
		this.marks = marks;
	}
	
	public MCQ_Question(Category category, Topic topic, Qtype qType, String question, Double time, 
			Double marks, List<String> options, String key) {
		this.category = category;
		this.topic = topic;
		this.qType = qType;
		this.question = question;
		this.time = time;
		this.marks = marks;
		this.options = options;
		this.key = key;
	}
	
	public void setOptions(String... options) {
		for (String option: options) {
			this.options.add(option);
		}
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String toString() {
		return question +  " : " + options;
	}
}

//Sub Class Para_Question
class Para_Question extends Question { // Paragraph IS A Question
	
	StringBuffer key;
	
	public Para_Question() {}
	
	public Para_Question(Category category, Topic topic, Qtype qType, String question, Double time, 
			Double marks) {
		this.category = category;
		this.topic = topic;
		this.qType = qType;
		this.question = question;
		this.time = time;
		this.marks = marks;
	}
	
	public Para_Question(Category category, Topic topic, Qtype qType, String question, Double time, 
			Double marks, StringBuffer key) {
		this.category = category;
		this.topic = topic;
		this.qType = qType;
		this.question = question;
		this.time = time;
		this.marks = marks;
		this.key = key;
	}
	
	public void setKey(StringBuffer key) {
		this.key = key;
	}
	
	public String toString() {
		return question;
	}
}

//Base Class Exam
class Exam { 
	
	String 			examName;
	Etype 			examType;
	Integer 		totalTime;
	Integer 		maxMarks;
	Boolean 		negativeMarking;
	List<Topic> 	allowedTopics = new ArrayList<Topic>(); //what topics are present?
	List<Qtype> 	allowedQTypes = new ArrayList<Qtype>(); //what q types are permitted?
	List<Question> 	questions = new ArrayList<Question>(); // list of questions
	
	public Exam(){}
	
	public Exam(String examName, Etype examType, Integer totalTime, Integer maxMarks, Boolean negativeMarking, 
			List<Topic> allowedTopics, List<Qtype> allowedQTypes) {
			
		this.examName = examName;	
		this.examType = examType;
		this.totalTime = totalTime;
		this.maxMarks = maxMarks;
		this.negativeMarking = negativeMarking;
		this.allowedQTypes = allowedQTypes;
		this.allowedTopics = allowedTopics;
	}
	
	public void addQuestion(Category category, Topic topic, Qtype qType, String question, Double time, Double marks) {
		Question q = new Question(category, topic, qType, question, time, marks);
		questions.add(q);
	}
	
	public void loadQuestionBank() {
		List<Question> questions = new ArrayList<Question>();
		
		//MCQ_Question (Category category, Topic topic, Qtype qType, String question, Float time, Integer marks)
		Question mq1 = new MCQ_Question();
		mq1.setQuestion(Category.EASY, Topic.GENERAL, Qtype.MCQ,"What is the captial of India?", 5.0, 2.0);
		mq1.setOptions("Chennai", "Mumbai", "Delhi", "Kolkata");
		mq1.setKey("Delhi");
		questions.add(mq1);
		
		Question mq2 = new MCQ_Question();
		mq2.setQuestion(Category.DIFFICULT, Topic.GENERAL, Qtype.MCQ,"How many states are in India?", 5.0, 2.0);
		mq2.setOptions("35", "29", "32", "30");
		mq2.setKey("29");
		questions.add(mq2);
		
		Question mq3 = new MCQ_Question();
		mq3.setQuestion(Category.MEDIUM, Topic.CURRENT_AFFAIRS, Qtype.MCQ,"Who is the president of the US?", 5.0, 2.0);
		mq3.setOptions("Obama", "Joe Biden", "Trump", "Kennedy");
		mq3.setKey("Joe Biden");
		questions.add(mq3);
		
		Question mq4 = new MCQ_Question();
		mq4.setQuestion(Category.EASY, Topic.NATIONAL, Qtype.MCQ,"Who is the Father of India?", 5.0, 2.0);
		mq4.setOptions("Lal Bahadur Shastri", "Subhash Chandra Bose", "Nehru", "Mahatma Gandhi");
		mq4.setKey("Mahatma Gandhi");
		questions.add(mq4);
		
		Question mq5 = new MCQ_Question();
		mq5.setQuestion(Category.MEDIUM, Topic.NATIONAL, Qtype.MCQ,"What is the naional animal of India?", 5.0, 2.0);
		mq5.setOptions("Elephant", "Tiger", "Lion", "Peocock");
		mq5.setKey("Tiger");
		questions.add(mq5);
		
		//Para_Question (Category category, Topic topic, Qtype qType, String question, Float time, Integer marks)
		Question pq1 = new Para_Question();
		pq1.setQuestion(Category.DIFFICULT, Topic.NATIONAL, Qtype.PARAGRAPH, "How does GST work?", 10.0, 5.0);
		questions.add(pq1);
		
		Question pq2 = new Para_Question();
		pq2.setQuestion(Category.EASY, Topic.GENERAL, Qtype.PARAGRAPH, "Formula for area of a circle?", 10.0, 5.0);
		questions.add(pq2);
		
		Question pq3 = new Para_Question();
		pq3.setQuestion(Category.MEDIUM, Topic.CURRENT_AFFAIRS, Qtype.PARAGRAPH, "Provide vaccination count by states?", 10.0, 5.0);
		questions.add(pq3);
		
		Question pq4 = new Para_Question();
		pq4.setQuestion(Category.EASY, Topic.GENERAL, Qtype.PARAGRAPH, "How to book a train ticket?", 10.0, 5.0);
		questions.add(pq4);
		
		Question pq5 = new Para_Question();
		pq5.setQuestion(Category.DIFFICULT, Topic.CURRENT_AFFAIRS, Qtype.PARAGRAPH, "Why is Israel & Palestine fighting?", 10.0, 5.0);
		questions.add(pq5);
		
		this.questions = questions;
	}
	
	public int getNoOfQuestions() {
		return questions.size();
	}
	
	public void printQuestions() {	
		for (int i=0;i<questions.size();i++) {
			System.out.println(questions.get(i));
		}
	}
	
	public long getQuestionCategoryCount(Category category) {
		return questions.stream()
				.filter(q -> (q.getCategory().equals(category)))
				.count();
	}
	
	public void listQuestionCategory(Category category) {
		for (Question q : questions) {
			if (q.getCategory().equals(category)) {
				System.out.println(q);
			}
		}
	}
	
	public long getQuestionCategoryTopicCount(Category category, Topic topic) {
		return questions.stream()
				.filter(q -> (q.getCategory().equals(category) && q.getTopic().equals(topic)))
				.count();
	}
	
	public void listQuestionCategoryTopic(Category category, Topic topic) {
		for (Question q : questions) {
			if (q.getCategory().equals(category) && q.getTopic().equals(topic)) {
				System.out.println(q);
			}
		}
	}
	
	public void printExamDetails() {
		System.out.println("Exam Name: " + examName);
		System.out.println("Exam Type: " + examType);
		System.out.println("Exam Time: " + totalTime);
		System.out.println("Exam Marks: " + maxMarks);
		System.out.println("Negative Marking: " + negativeMarking);
		System.out.println("Allowed Question Types: " + allowedQTypes);
		System.out.println("Allowed Subjects/Topics: " + allowedTopics);	
		//System.out.println("No of Questions: " + getNoOfQuestions());
		//System.out.println("Questions: ");
		//printQuestions();
	}
	
	public String toString() {
		return examName + " " + examType +  " " + totalTime +  " " +  maxMarks +  " " + negativeMarking 
				+  " " + allowedQTypes + " " + allowedTopics + " " + questions;
	}
}

//Sub Class OnlineExam
class OnlineExam extends Exam{ //Online Exam IS A Exam

}

//Sub Class InpersonExam
class InpersonExam extends Exam{ //In Person Exam IS A Exam

}

//Class Portal uses Exam
class Portal{
	
	public void createExam (Exam e) { // Portal USES Exam
	}

}

public class ExamPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Topic> allowedTopics = new ArrayList<Topic>();
		Collections.addAll(allowedTopics, Topic.GENERAL, Topic.CURRENT_AFFAIRS, Topic.NATIONAL);
		
		List<Qtype> allowedQTypes = new ArrayList<Qtype>();
		Collections.addAll(allowedQTypes, Qtype.MCQ, Qtype.PARAGRAPH);

		//Exam(String examName, Etype examType, Integer totalTime, Integer maxMarks, Boolean negativeMarking, 
		//List<Topic> allowedTopics, List<Qtype> allowedQTypes, List<Question> questions)
		Exam e = new Exam("IAS Entrance", Etype.ONLINE, 3, 100, false, allowedTopics, allowedQTypes);
		e.loadQuestionBank();
		
		//System.out.println(e); //check this out
		e.printExamDetails();
		System.out.println("------------------------------------");
		e.printQuestions();
		System.out.println("------------------------------------");
		
		System.out.println("Total no of questions in this exam = " + e.getNoOfQuestions());
		System.out.println("------------------------------------");
		
		System.out.println("The following questions are of Easy Category");
		if (e.getQuestionCategoryCount(Category.EASY) != 0) {
			e.listQuestionCategory(Category.EASY);
		}
		System.out.println("------------------------------------");
		
		System.out.println("The following questions are of Medium Category & Current Affairs Topic");
		if (e.getQuestionCategoryTopicCount(Category.MEDIUM, Topic.CURRENT_AFFAIRS) != 0) {
			e.listQuestionCategoryTopic(Category.MEDIUM, Topic.CURRENT_AFFAIRS);
		}
	}

}
