import java.util.ArrayList;

public class lab1 {
	public static void main(String[] args) {
		// part 1
		int[] x = {2, 9, 6, 22, 19};
		int[] y = {15, 8, 3, 6, 26};
		int[] z = new int[5];
		for (int i = 0; i < 5; i++) {
			z[i] = Math.max(x[i],y[i]);
		}
		
		String outX = "";
		String outY = "";
		String outZ = "";
		for (int i = 0; i < 5; i++) {
			outX += x[i];
			outY += y[i];
			outZ += z[i];
			if (i != 4) {
				outX += ", ";
				outY += ", ";
				outZ += ", ";
			}
		}
		
		System.out.println("Array x = {" + outX + "}");
		System.out.println("Array y = {" + outY + "}");
		System.out.println("Array z = x + y = {" + outZ + "}");
		
		// part 2
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Alex");
		myList.add("Bobby");
		myList.add("Cassie");
		myList.add("Devon");
		myList.add("Emilio");
		
		System.out.println();
		System.out.println("Names = " + myList);
		
		for (int i = 0; i < 5; i++) {
			String newName = myList.get(i).toLowerCase();
			char start = newName.charAt(0);
			char end = newName.charAt(newName.length() - 1);		
			newName = newName.substring(1, newName.length() - 1);
			newName = end + newName;
			newName += start;
			newName = newName.substring(0, 1).toUpperCase() + newName.substring(1);
			myList.set(i, newName);
		}
		
		System.out.println("Names (switched) = " + myList);
	}
}

