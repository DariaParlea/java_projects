package problema2.main;
public class MaximaleSumme {
    MinimaleZahl min = new MinimaleZahl();

    public float maxsumme(int[] zahlen){
        for (int i = 0; i < zahlen.length; i++){
            if(zahlen[i] < 0){
                System.out.println("Zahlen soll positiv sein");
                return 0;
            }
        }
        float minim = min.minzahl(zahlen);
        float sum = 0;
        for(int i = 0; i < zahlen.length; i++){
            sum = sum + zahlen[i];
        }
        sum = sum - minim;
        return sum;
    }
}