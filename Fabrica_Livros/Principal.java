public class Principal{
    public static void main(String[] args){
        
        int idCliente = 1;
        Cliente cliente1 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"));
                                 
        System.out.println();
        System.out.println("-------------//------//-------------");
        System.out.println();
        
        idCliente += 1; 
        Cliente cliente2 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"));
                                 
        System.out.println();
        System.out.println("-------------//------//-------------");
        System.out.println();
        
        idCliente += 1;
        Cliente cliente3 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"));
        
        
        System.out.println();
        System.out.println("-------------//------//-------------");
        System.out.println("-------------//------//-------------");
        System.out.println();
        
         int idLivro = 1;
        Livro livro1 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leInt("Informe a quantidade de páginas do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"));
        
        System.out.println();
        System.out.println("-------------//------//-------------");
        System.out.println();
        
         idLivro += 1;
        Livro livro2 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leInt("Informe a quantidade de páginas do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"));
        
        System.out.println();
        System.out.println("-------------//------//-------------");
        System.out.println();
        
          idLivro += 1;
        Livro livro3 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leInt("Informe a quantidade de páginas do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"));
        
        System.out.println();
        System.out.println("-------------//VALORES POR PÁGINAS//-------------");
        System.out.println();
        
        System.out.printf("Preço por página do livro "+livro1.getTitulo()+": R$ %.2f\n",livro1.calcularPrecoPorPagina());
        System.out.printf("Preço por página do livro "+livro2.getTitulo()+": R$ %.2f\n",livro2.calcularPrecoPorPagina());
        System.out.printf("Preço por página do livro "+livro3.getTitulo()+": R$ %.2f\n",livro3.calcularPrecoPorPagina());
        
        System.out.println();
        System.out.println("-------------//INFORMAÇÔES GERAIS//-------------");
        System.out.println();
        
        System.out.println("*** CLIENTES ***");
        cliente1.imprimirInfoCliente();
        cliente2.imprimirInfoCliente();
        cliente3.imprimirInfoCliente();
        
        System.out.println();
        
        System.out.println("*** LIVROS ***");
        livro1.imprimirInfoLivro();
        livro2.imprimirInfoLivro();
        livro3.imprimirInfoLivro();
        
        System.out.println("-------------//FIM DO PROGRAMA//-------------");
        
    }
}