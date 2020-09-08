package lab6;

import junit.framework.TestCase;

public class GradebookTester extends TestCase{
	private GradeBook g1;
	private GradeBook g2;
	public void setUp(){
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(60);
		g1.addScore(50);
		g1.addScore(30);

		g2.addScore(90);
		g2.addScore(85);
		g2.addScore(80);
		g2.addScore(79);
		g2.addScore(96);
	}
	public void tearDown(){
		g1 = null;
		g2 = null;
	}
	public void testSum(){
		assertEquals(265, g1.sum(), .0001);
	}
	
	public void testMinimum(){
		assertEquals(30, g1.minimum(), .001);
	}
	public void testAddScore(){
		assertEquals((" 50.0 75.0 60.0 50.0 30.0"), g1.toString());
	}
	
	
}
