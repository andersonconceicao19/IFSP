class Investimento {
    public static void main(String[] args)
    {
        // System.out.println("Teste");

        //Dividend Yield
        double dividendPorAcao; 
        double precoPorAcao; 
        String result;
        boolean ENAT3 = false;
        double LPA;

        /**Calcular ENAT3 
         *
         * Site pego como base https://statusinvest.com.br/acoes/enat3. 
         * Preço da ação usado como base é do dia 07.09.2020;
         *             
         */
        if(!ENAT3)
        {
            /**Dividend Yield */
            ENAT3 = true;
            dividendPorAcao = 1.1427;
            precoPorAcao = 11.45;

            LPA = 1.31;
            
            result = String.format("%.2f", ((dividendPorAcao / precoPorAcao ) * 100));
            System.out.println("Dividend Yield: " + result);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */

            result = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println("P/L: " + result);

            /*
            *P/VP
            * VPO = Patrimonio liquido(2.910.699.000)/ Numero de papeis(265.806.905) = 10.95
            */
            result = String.format("%.2f", (precoPorAcao / 10.95));
            System.out.println("P/VP: " + result);
        }

    }
}