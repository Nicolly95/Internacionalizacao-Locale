//INTERNACIONALIZANDO O LOCALE:
package Java;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class Datas3 {

    public static void main(String[] args) {

        //"Instancia" o calendário: (Calendar é abstrada e não pode ser instanciada, usamos um método auxiliar para isso).
        Calendar c = Calendar.getInstance();

        //Define uma data através do calendário
        c.set(2024, Calendar.OCTOBER, 30);

        //Recuperar o obj no tipo Date para que possamos formatá-lo como "date":
        Date date = c.getTime();

        
        /* MANIPULAÇÃO DE LOCALE */
        Locale padrao = Locale.getDefault();    
        //Essa é a conf. padrão que o Java faz a partir da localização do nosso pc!
        Locale brasil = Locale.forLanguageTag("pt-BR");  
        //Essa é a forma de declarar um local independente da localização do nosso pc.


        //Usar a classe DateFormat para formatação de datas: Estilo completo (FULL) e Locale brasil
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, brasil);     //criamos Locale brasil em (ln26)
        //(DateFormat é abstrada e não pode ser instanciada, usamos um método auxiliar para isso).
        
        //Método do DateFormat "format" que formata as datas:
        f.format(date);     //Formata data do obj "date" (ln19)
        System.out.println(f.format(date));
        

        //Teste 1: padrão de data indiano:
        Locale india = Locale.forLanguageTag("hi-IN");  //Declara o Locale para formato de datas desejado como parametro.
        DateFormat in = DateFormat.getDateInstance(DateFormat.FULL, india);     //Classe para formatar datas
        in.format(date);                                                         //Método da classe que formata data 
        System.out.println(in.format(date));

        //Teste 2: padrão de data americano:
        Locale eua = Locale.US;  //Declara o Locale para formato de datas (US é uma constante).
        DateFormat us = DateFormat.getDateInstance(DateFormat.FULL, eua);     //Classe para formatar datas
        us.format(date);                                                         //Método da classe que formata data 
        System.out.println(us.format(date));

        //Teste 3: padrão de data japones:
        Locale japao = Locale.JAPAN;  //Declara o Locale para formato de datas (JAPAN é uma constante).
        DateFormat jp = DateFormat.getDateInstance(DateFormat.FULL, japao);     //Classe para formatar datas
        jp.format(date);                                                         //Método da classe que formata data 
        System.out.println(jp.format(date));

        //Teste 4: padrão de data italiano:
        Locale italia = Locale.ITALIAN;  //Declara o Locale para formato de datas (ITALIAN é uma constante).
        DateFormat it = DateFormat.getDateInstance(DateFormat.FULL, italia);     //Classe para formatar datas
        it.format(date);                                                         //Método da classe que formata data 
        System.out.println(it.format(date));








    }

}
