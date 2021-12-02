public class Main {
    public static void main(String[] args)
    {
        System.out.println(rps("rock", "paper")); //p2 wins
        System.out.println(rps("paper", "rock")); //p1 wins
        System.out.println(rps("paper", "scissors")); //p2 wins
        System.out.println(rps("scissors", "scissors")); //tie
        System.out.println(rps("scissors", "paper")); //p1 wins
    }

    public static String rps(String player1, String player2)
    {
        if(player1.equals("rock"))
        {
            if(player2.equals("paper"))
                return "Player 2 wins";
            if(player2.equals("scissors"))
                return "Player 1 wins";
            if(player2.equals("rock"))
                return "TIE";
        }

        if(player1.equals("paper"))
        {
            if(player2.equals("scissors"))
                return "Player 2 wins";
            if(player2.equals("rock"))
                return "Player 1 wins";
            if(player2.equals("paper"))
                return "TIE";
        }

        if(player1.equals("scissors"))
        {
            if(player2.equals("rock"))
                return "Player 2 wins";
            if(player2.equals("paper"))
                return "Player 1 wins";
            if(player2.equals("scissors"))
                return "TIE";
        }

        return "Invalid Game";
    }
}
