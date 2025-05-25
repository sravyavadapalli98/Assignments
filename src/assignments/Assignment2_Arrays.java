package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- D Array //
		String [] semester = {"sem1","sem2","sem3","sem4","sem5"};
		//System.out.println(semester[2]);
		
		//2-D Array //

		
		String[][] subjectNames = {{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing","Basic Electrical Eng."},
			               	{"Mathematics II", "Mechanics","Environmental Sci.", "Basic Electronics", "Engineering Physics" ,"Engineering Graphics"},
			                {"Data Structures", "Digital Logic Design", "Algorithms", "Operating Systems", "Microprocessors", "Object-Oriented Prog."},
			                {"Algorithms","ComputerNetworks","DatabaseSystems"," Microprocessors", "Communication Eng.", "Software Engineering"},
			                {"Machine Learning", "Computer Networks", "Compiler Design", "Theory of Computation", "Communication Engg", "Computer Graphics"}};
		//3-D Array///
		
		String[][][] markStatus =  {
	            {{"Pass(78)"}, {"Pass(85)"}, {"Fail(21)"}, {"Pass(91)"}, {"Pass(88)"}, {"Pass(79)"}},
	            {{"Pass(81)"}, {"Pass(76)"}, {"Pass(93)"}, {"Fail(19)"}, {"Pass(40)"}, {"Pass(90)"}},
	            {{"Pass(88)"}, {"Pass(87)"}, {"Pass(75)"}, {"Pass(82)"}, {"Pass(73)"}, {"Pass(77)"}},
	            {{"Pass(93)"}, {"Pass(72)"}, {"Pass(84)"}, {"Pass(91)"}, {"Pass(75)"}, {"Pass(90)"}}
	        };
		System.out.println(semester[1]+ subjectNames[1][3]+ subjectNames[1][4]);
		System.out.println(semester [3]+ subjectNames[3][2]+ subjectNames[3][5] );
		
			            
		}
	}


