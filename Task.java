import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    
    public static ArrayList<PlayerModel>dataList = new Arraylist<>();
    public static void main(String[] args) {
        
        String select;

        for (int i=0 ;i<3 ;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 = Batsman");
            System.out.println("2 = Bowler");
            System.out.println("Enter selection = ");
            select = sc.nextLine();

            if(select.equals("1")){
                Batsman b = new Batsman();
                b.setBatsmandata();
            }else if(select.equals("2")){
                Bowler b1 = new Bowler();
                b1.setBowlerdata();
            }
        }

        for (int i=0 ;i<dataList.size() ;i++) {
            System.out.println("Name = "+dataList.get(i).name);
            if(dataList.get(i).isbatsman){
                System.out.println("Run = "+dataList.get(i).score);
                System.out.println("SR = "+dataList.get(i).skill);
            }else{
                System.out.println("wicket = "+dataList.get(i).score);
                System.out.println("style = "+dataList.get(i).score);
            }
        }
    }

}

class PlayerModel{

    String name,score,skill;
    boolean isbatsman;

    public PlayerModel(String name, String score, String skill, boolean isBatsman){
        this.name=name;
        this.score = score;
        this.skill = skill;
        this.isbatsman = isBatsman;
    }
}

class Cricket{

    String name,run,sr,wicket,style;

}

class Player extends Cricket{

    void setName(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter player name :");
    name = sc.nextLine();
    }
    void getName(){
    
        System.out.println("Name = "+name);
    }
}
class Batsman extends Player{

    void setBatsmandata(){

    setName();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter player run :");
    run = sc.nextLine();
    System.out.println("Enter player sr : ");
    sr = sc.nextLine();

    PlayerModel model = new PlayerModel(name,run,sr,true);
    Task.dataList.add(model);
    }

}

class Bowler extends Player{

    void setBowlerdata(){

        setName();
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter player wicket :");
        wicket = sc.nextLine();
        System.out.println("Enter player style : ");
        style = sc.nextLine();
        PlayerModel model = new PlayerModel(name,run,name,false);
        Task.dataList.add(model);
    }
}

