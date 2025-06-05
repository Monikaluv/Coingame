package Game;

public class Player 
{
    int[] PlayerCoins;
    public Player(DIFFICULTY diff)
    {
        switch(diff)
        {
            case EASY:
                PlayerCoins = new int[2];
                break;
            case NORMAL:
                PlayerCoins = new int[3];
                break;
            case HARD:
                PlayerCoins = new int[4];
                break;
            case IMPOSSIBLE:
                PlayerCoins = new int[5];
                break;            
            default:
                PlayerCoins = new int[1];
                break;
        }
    }
}
