package board.controller;

import java.util.List;
import java.util.Scanner;

import board.dto.Article;
import board.util.Util;

public class ArticleController {
	
	private Scanner sc;
	private List<Article> articles;
	
	
	public ArticleController(Scanner sc, List<Article> articles) {
		this.sc = sc;
		this.articles = articles;
	}


	public void doWrite() {
		
		int id = articles.size() + 1;

		System.out.printf("제목 : ");
		String title = sc.nextLine();

		System.out.printf("내용 : ");
		String body = sc.nextLine();

		String currentDate = Util.getCurrentDate();

		Article article = new Article(id, title, body, currentDate);
		articles.add(article);

		System.out.printf("%d번 게시물 등록이 완료되었습니다.\n", id);
	}


	public void showDetail() {
		
		
		
	}
}