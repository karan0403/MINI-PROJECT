 package onlinequiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String [] args){
		String q1="Class is pass by?\n"
				+"(a)value\n(b)Reference\n(c)value or reference,depending on program\n(d)copy\n";
		
		String q2="Which syntax for class definition is wrong?\n"
				+"(a)class student{}\n(b)Student class{}\n(c)Class student{public:Student(int a){}}\n(d)class student{student(int a){}}";
		
		String q3="Abstraction can apply to?\n"
				+"(a)control and data\n(b)only data\n(c)only control\n(d)classes\n";
				
		String q4="Which specifies applies only to the constructrors?\n"
				+"(a)public\n(b)protected\n(c)implicit\n(d)explicit\n";
		
		String q5="If there is an abstract method in a class then,__________?\n"
				+"(a)class must be abstract class\n(b)class may or maynot be abstarct class\n(c)class is generic\n(d)class must be public\n";
				
		String q6="How many basic type of inheritance are provided as oop feature\n"
				+"(a)4\n(b)3\n(c)2\n(d)1\n";
		
		String q7="Which are the two blocks that are used to check error and handle the error?\n"
				+"(a)try and catch\n(b)trying and catching\n(c)Do and while\n(d)try Do and check\n";
		
		String q8="Which class can handle IO class interrept\n"
				+"(a)exception IO\n(b)Interupted IO\n(c)Interupted IO Exception\n(d)IO interupt Exception\n";
		
		
		Question [] questions ={
				new Question(q1,"b"),
				new Question(q2,"b"),
				new Question(q3,"a"),
				new Question(q4,"d"),
				new Question(q5,"a"),
				new Question(q6,"a"),
				new Question(q7,"a"),
				new Question(q8,"c")
		};
		takeTest(questions);
	}
 public static void takeTest(Question [] questions){
	 int score =0;
	 Scanner keyboardInput=new Scanner(System.in);
	 for(int i=0;i<questions.length;i++){
		 System.out.println(questions[i].prompt);
		 String answer=keyboardInput.nextLine();
		 if(answer.equals(questions[i].answer)){
			 score++;
			 
		 }
	 }
	 	System.out.println("You got"+score+"/"+questions.length);
 	}
}
