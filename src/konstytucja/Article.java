package konstytucja;


public class Article {
    private int articleNumber;
    private String chapterSubtitle;
    private String articlePoints;

    public Article(int n, String s, String t){
        this.articleNumber = n;
        this.articlePoints = s;
        this.chapterSubtitle = t;
    }

    public int getArticleNumber(){
        return this.articleNumber;
    }

    public String getArticlePoints(){
        return this.articlePoints;
    }

    public String getChapterSubtitle(){
        return this.chapterSubtitle;
    }
}
