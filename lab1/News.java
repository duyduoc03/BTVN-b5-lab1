package sesstion5.lab1;

import java.util.Scanner;

public class News implements INews{
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }
    public void Display(){
        System.out.println(ID);
        System.out.println(Title);
        System.out.println(PublishDate);
        System.out.println(Author);
        System.out.println(Content);
        System.out.println(AverageRate);
    }
    int[]RateList = new int[3];
    Scanner sc = new Scanner(System.in);
    public int Calculate(){
        System.out.println("Nhập số nguyên 1, 2, 3:");
        RateList[0] = sc.nextInt();
        sc.nextLine();
        RateList[1] = sc.nextInt();
        sc.nextLine();
        RateList[2] = sc.nextInt();
        return  (RateList[0] + RateList[1] + RateList[2]) / 3;
    }
}
