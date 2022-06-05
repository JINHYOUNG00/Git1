package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("책이름1", "작가1");
		library[1] = new Book("책이름2", "작가2");
		library[2] = new Book("책이름3", "작가3");
		library[3] = new Book("책이름4", "작가4");
		library[4] = new Book("책이름5", "작가5");
	
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo();
	 }
	}
}
