package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bookshop {
	public static void printAuthors() {
		System.out.println("[저자 목록]");
		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> authors = dao.getList();
		
		Iterator<AuthorVO> iter = authors.iterator();
		while(iter.hasNext()) {
		AuthorVO author = iter.next();
		System.out.println(author);
		}
		System.out.println(authors.size() + "명의 저자가 있습니다.");
	}
	public static void showAuthor(Long id) {
		// PK가 1인 작가 출력
		AuthorDAO dao = new AuthorDAOImpl();
		AuthorVO author = dao.get(id);
		if (author != null) {
			System.out.println("Author : " + author);
		} else {
			System.out.println("저자를 찾지 못하였습니다.");
		}
	}
	public static void insertAuthor() {
		// Scanner에서 이름과 설명을 입력, author 테이블에 INSERT
		Scanner scanner = new Scanner(System.in);
		System.out.print("저자 이름 : ");
		String name = scanner.nextLine();
		scanner.nextLine(); 
		System.out.print("설명 : ");
		String desc = scanner.nextLine();
		
		// DAO의 insert 메소드에 전달할 AuthorVO 생성
		AuthorVO author = new AuthorVO(null, name, desc);
		AuthorDAO dao = new AuthorDAOImpl();
		boolean isSuccess = dao.insert(author);
		if(isSuccess) {
			System.out.println("입력 성공!");
		} else {
			System.out.println("입력 실패!");
		}
		printAuthors();
		scanner.close();
	}
	public static void deleteAuthor() {
		printAuthors();
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 저자의 ID : ");
		int id = scanner.nextInt();
		
		AuthorDAO dao = new AuthorDAOImpl();
		boolean isSuccess = dao.delete(Long.valueOf(id));
		System.out.println("삭제 성공? : " + isSuccess);
		printAuthors();
		scanner.close();
	}
	public static void updateAuthor() {
		printAuthors();
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 저자의 ID : ");
		int id = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("이름 : ");
		String name = scanner.nextLine(); 
		System.out.print("설명 : ");
		String desc = scanner.nextLine();
		
		AuthorVO author = new AuthorVO(Long.valueOf(id), name, desc);
		AuthorDAO dao = new AuthorDAOImpl();
		boolean isSuccess = dao.update(author);
		System.out.println("수정 성공? : " + isSuccess);
		printAuthors();
		scanner.close();
	}
	public static void main(String[] args) {
//		printAuthors();
//		showAuthor(1L);
//		insertAuthor();
//		deleteAuthor();
		updateAuthor();
	}

}
