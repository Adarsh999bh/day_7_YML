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
    public void print_prop(){
        System.out.println("object properties");
        System.out.println("Element position "+this.cur_value);
        System.out.println("Element ladder value "+this.ladder_val);
        System.out.println("Element snake value "+this.snake_value);
        System.out.println("Element has ladder : "+is_ladder);
        System.out.println("Element has snake : "+is_snake);
    }
}
public class SnakeNLad{
    public static void main(String[] args) {
        System.out.println("Welcome to snake n ladder");
        Board_ele[] ele=new Board_ele[100];
        for(int i=0;i<5;i++){
            ele[i]=new Board_ele(i+1, 0, 0, false, false);
        }
        for(int i=95;i<100;i++){
            ele[i]=new Board_ele(i+1, 0, 0, false, false);
        }
        for(int i=5;i<95;i++){
            int bd_ele_prop=(int) (Math.floor(Math.random()*10)%3);
            if(bd_ele_prop==0){
                ele[i]=new Board_ele(i+1, 0, 0, false, false);
            }
            else if(bd_ele_prop==1){
                int lad_val;
                while(true){
                    lad_val= (int) (Math.floor(Math.random()*100)%100);
                    if(lad_val>i+1){
                        break;
                    }
                    else{
                        continue;
                    }
                }
                ele[i]=new Board_ele(i+1,lad_val, 0, true, false);
            }
            else{
                int snake_val;
                while(true){
                    snake_val= (int) (Math.floor(Math.random()*100)%100);
                    if(snake_val<i){
                        break;
                    }
                    else{
                        continue;
                    }
                }
                ele[i]=new Board_ele(i+1, 0, snake_val, false, true);
            }
        }
    }
}