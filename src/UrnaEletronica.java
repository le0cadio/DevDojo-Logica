//Constroi um sistema de urna eletronica onde 50 pessoas vão votar, e o sistema vai dizer qual foi o vencedor.
//O sistema deve ter 3 candidatos, e deve ter a opção de voto nulo e voto em branco.
//O sistema deve ter a opção de votar em branco e nulo.

public class UrnaEletronica {
    public static void main(String[] args) {
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;
        int blank = 0;
        int nullVote = 0;
        int totalVoters = 50;
        int vote;
        for (int i = 0; i < totalVoters; i++) {
            vote = (int) (Math.random() * 6);
            switch (vote) {
                case 1:
                    candidate1++;
                    break;
                case 2:
                    candidate2++;
                    break;
                case 3:
                    candidate3++;
                    break;
                case 4:
                    blank++;
                    break;
                case 5:
                    nullVote++;
                    break;
            }
        }
        System.out.println("Candidate 1: " + candidate1);
        System.out.println("Candidate 2: " + candidate2);
        System.out.println("Candidate 3: " + candidate3);
        System.out.println("Blank: " + blank);
        System.out.println("Null: " + nullVote);
    }
}
