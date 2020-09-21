/**
* This class demonstrates first java app.
* @author Rozumovsky Dmytro 
* @version 1.2
* @since 2020-09-07
*/
public class Lab_1 {
	/**
	* This method demonstrates short student information
	* @param args Unused
	*/
    public static void main(String[] args) {
        System.out.println("Group -> 545V");
        System.out.println("Student -> Rozumovsky Dmytro Oleksandrovich");
		System.out.println("Variant -> 8");
		String[] Array  = new String[9];
		Array[0] = "********        **********        *********  ";
		Array[1] = "**      **      **        **    **         **";
		Array[2] = "**      **      **         **   **         **";
		Array[3] = "**      **      **          **  **         **";
		Array[4] = "**      **      **          **  **         **";
		Array[5] = "********        **          **  **         **";
		Array[6] = "**      **      **         **   **         **";
		Array[7] = "**       **     **        **    **         **";
		Array[8] = "**        **    **********        *********	 ";
		
		for (int i = 0; i < 9; i++) {
		System.out.println(Array[i]);
			}
		}
}