package org.comit.course.Static;

class ScoreBoared{
	
	static int score;
	
	static int addnumbers(int a , int b) {
		return a+b;
	}
	
	/*
	void print(int a , int b) {
		System.out.println(a+b);
	}
	*/
	
}


public class Static {

	public static void main(String[] args) {
		
		ScoreBoared latestscore1=new ScoreBoared();
		latestscore1.score=2;
		
		ScoreBoared latestscore2=new ScoreBoared();
		latestscore1.score=5;
		
		ScoreBoared latestscore3=new ScoreBoared();
		latestscore1.score=10;
		
		
		System.out.println(latestscore1.score);
		
		int result= ScoreBoared.addnumbers(2,3);
		System.out.println(result);
		
		
		}
	}


