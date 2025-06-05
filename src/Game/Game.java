package Game;

import java.util.Random;

public class Game 
{
    int[] coins;
    int[] baseCoins = {1,2,5,10,20,50};

    Player player1;
    Player player2;
    
    public Game(DIFFICULTY diff)
    {
        switch(diff)
        {
            case EASY:
                coins = new int[4];
                break;
            case NORMAL:
                coins = new int[6];
                break;
            case HARD:
                coins = new int[8];
                break;
            case IMPOSSIBLE:
                coins = new int[10];
                break;            
            default:
                coins = new int[2];
                break;
        }
        
        for(int i = 0; i< coins.length; i++)
        {
            coins[i] = getRandom(baseCoins);
        }

        player1 = new Player(diff);
        player2 = new Player(diff);
    }

    public void PlayerMove_Front(Player p)
    {
        p.PlayerCoins[getEmptyIndex(p.PlayerCoins)] = coins[0];
    }
    

    private static int getRandom(int[] array) 
    {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private static int getEmptyIndex(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == 0)
            {
                return i;
            }
        }
        return 0;
    }

    private void ShiftArrLeft(int[] array)
    {
        
    }
}
