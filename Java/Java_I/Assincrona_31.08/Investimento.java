class Investimento {
    public static void main(String[] args)
    {
        /**
         * Turma ADS 371
         * 
         * Nomes: Anderson Silva da Conceição.
         *        Renato Santos
         */
       
        double dividendPorAcao; 
        double precoPorAcao; 
        String result;
        boolean ENAT3 = false;
        boolean ITSA4 = false;
        boolean WEGE3 = true;
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
            System.out.println("ENAT3 Dividend Yield: " + result);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */

            result = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println("ENAT3 P/L: " + result);

            /*
            *P/VP
            * VPO = Patrimonio liquido(2.910.699.000)/ Numero de papeis(265.806.905) = 10.95
            */
            result = String.format("%.2f", (precoPorAcao / 10.95));
            System.out.println("ENAT3 P/VP: " + result);
        }

        /**Calcular ITSA4 
            *
            * Site pego como base https://statusinvest.com.br/acoes/itsa4.
            * Preço da ação usado como base é do dia 07.09.2020;
            *             
        */
        
        if(!ITSA4)
        {
            /**Dividend Yield */
            ITSA4 = true;
            dividendPorAcao = 0.5494;
            precoPorAcao = 9.77;

            LPA = 0.83;
            
            result = String.format("%.2f", ((dividendPorAcao / precoPorAcao ) * 100));
            System.out.println(" ITSA4 Dividend Yield: " + result);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */
            result = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println(" ITSA4 P/L: " + result);

            /*
            *P/VP
            * VPO = Patrimonio liquido(52.896.000.000)/ Numero de papeis(8.410.814.930) = 10.95
            */
            result = String.format("%.2f", (precoPorAcao / 6.29));
            System.out.println(" ITSA4 P/VP: " + result);
        }

        /**Calcular WEGE3 
            *
            * Site pego como base https://statusinvest.com.br/acoes/wege3. 
            * Preço da ação usado como base é do dia 07.09.2020;
            *             
        */
        if(WEGE3)
        {
            /**Dividend Yield */
          
            dividendPorAcao = 0.4422;
            precoPorAcao = 64.49;

            LPA = 0.89;
            
            result = String.format("%.2f", ((dividendPorAcao / precoPorAcao ) * 100));
            System.out.println("WEGE3 Dividend Yield: " + result);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */

            result = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println("WEGE3 P/L: " + result);

            /*
            *P/VP
            * VPO = Patrimonio liquido(10.362.308.000)/ Numero de papeis(2.098.658.999) = 4.94
            */
            result = String.format("%.2f", (precoPorAcao / 4.94));
            System.out.println("WEGE3 P/VP: " + result);
        }
    }
}