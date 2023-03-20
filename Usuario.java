public class Usuario {
    
    public static void main (String [] args) throws Exception {
        SistemaSmartTV smartTV = new SistemaSmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);
        
        smartTV.ligar ();
        System.out.println("Novo status -> TV Ligada? " + smartTV.ligada);
       
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println("Novo status -> Volume atual? " + smartTV.volume);
    }
}
