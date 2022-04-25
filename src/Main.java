public class Main {
    public static void main(String[] args) {

        int ticketCost = 18_240;
        int rublesForOneBonusMile = 20;

        int totalBonusMiles = ticketCost / rublesForOneBonusMile;
        System.out.println("Количество бонусных миль со стоимости билета: " + totalBonusMiles);
        
    }
}
