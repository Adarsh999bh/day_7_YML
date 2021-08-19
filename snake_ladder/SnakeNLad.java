package snake_ladder;
class Board_ele{
    public int cur_value,ladder_val,snake_value;
    public boolean is_ladder,is_snake;
    Board_ele(int cur_value,int ladder_val,int snake_value,boolean is_ladder,boolean is_snake){
        this.cur_value=cur_value;
        this.ladder_val=ladder_val;
        this.snake_value=snake_value;
        this.is_ladder=is_ladder;
        this.is_snake=is_snake;
    }
}
public class SnakeNLad{
    public static void main(String[] args) {
        System.out.println("Welcome to snake n ladder");
        
    }
}