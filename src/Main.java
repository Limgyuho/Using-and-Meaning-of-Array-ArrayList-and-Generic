import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
		exam4();
	}

	static void exam4() {
		System.out.println("버전4");
		List<Article> articles = new ArrayList<>();
		// 실제로 ArrayList는 위의 모양으로 사용한다
		// 변수에 제너릭을 사용하면 뒤에 제너릭에 타입을 지정하지 않아도 된다
		// 오류가 나지 않는 이유는 ArrayList가 List의 상속을 받기때문이다
		// ArrayList는스마트한 배열이다 배열보다 훨씬 뛰어나다 배열을 여러개 증가 할때마다 수정할 필요가 없다
		// ArrayList는 방이 없이 만들어 진다
		// 크기를 지정하지 않을 때 사용한다
		articles.add(new Article());
		// 새로운 기능을 추가할때마다 방이 하나씩 생성된다
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) {
			// ArrayList는 .size()를 기본제공해준다
			Article article = articles.get(i);
			// 제너릭을 하면 강제 형변환을 할 필요가 없다
			System.out.println(article.id);
		}
	}

	static void exam3() {
		System.out.println("버전3");
		ArrayList<Article> articles = new ArrayList<Article>();
		// <>는 타입을 지정해준다는 의미이다 Article만 받겠다 이것을 제너릭이라고 한다
		// articles.add(1);과 같은 것을 사용할수 없다
		// ArrayList는 방이 없이 만들어 진다
		// 크기를 지정하지 않을 때 사용한다
		articles.add(new Article());
		// 새로운 기능을 추가할때마다 방이 하나씩 생성된다
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) {
			// ArrayList는 .size()를 기본제공해준다
			Article article = articles.get(i);
			// 제너릭을 하면 강제 형변환을 할 필요가 없다
			System.out.println(article.id);
		}
	}

	static void exam2() {
		System.out.println("버전2");
		ArrayList articles = new ArrayList();
		// ArrayList는 방이 없이 만들어 진다
		// 크기를 지정하지 않을 때 사용한다
		articles.add(new Article());
		// 새로운 기능을 추가할때마다 방이 하나씩 생성된다
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) {
			// ArrayList는 .size()를 기본제공해준다
			Article article = (Article) articles.get(i);
			// 그리고 .get을 사용해주어야 하며 articles의 타입이 Articles 이므로 형변환을 해준다
			System.out.println(article.id);
		}
	}

	static void exam1() {
		System.out.println("버전1");
		int articlesSize = 0;
		// 객체의 크기만큼 달라지기 때문에 articlesSize라는 변수를 만들어 증가 신킨다

		Article[] articles = new Article[10];
		articles[0] = new Article();
		// articles 0번 방에 Article()라는 객체를 넣겠다
		articlesSize++;
		// articlesSize변수의 값을 1씩 증가 시킨다
		articles[1] = new Article();
		articlesSize++;
		articles[2] = new Article();
		articlesSize++;
		articles[3] = new Article();
		articlesSize++;
		articles[4] = new Article();
		articlesSize++;

		for (int i = 0; i < articlesSize; i++) {
			System.out.println(articles[i].id);
		}
	}
}

class Article {
	static int lastId;
	int id;
	String regDate;
	static {
		lastId = 0;
	}

	Article() {
		this(lastId + 1, "2020-12-12 12:12:12");
		lastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}