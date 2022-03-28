package sesstion5.lab1;

public class main {
    public static void main(String args[]){
        News n = new News();
        n.ID = 18;
        n.Title = "Được";
        n.PublishDate = "abc";
        n.Author = "ig387w";
        n.Content = "sdgbses";
        n.AverageRate = 999999;
        n.Display();

        System.out.println("Trung bình cộng của ba số = " + n.Calculate());
    }
}
