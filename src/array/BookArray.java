package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("å�̸�1", "�۰�1");
		library[1] = new Book("å�̸�2", "�۰�2");
		library[2] = new Book("å�̸�3", "�۰�3");
		library[3] = new Book("å�̸�4", "�۰�4");
		library[4] = new Book("å�̸�5", "�۰�5");
	
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo();
	 }
	}
}
