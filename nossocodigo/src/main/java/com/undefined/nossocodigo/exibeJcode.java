package com.undefined.nossocodigo;

public class exibeJcode {

    public static String formataDadosJ(String conteudo){
        conteudo = conteudo.replaceAll("<","&lt");
        conteudo = conteudo.replaceAll(">","&gt");
        return conteudo;
     }

    public String mostraJcode(Iterable<jcode> jcode){
        String html = "<head>" +
        "<meta charset=\"UTF-8\">" +
        "<title>Códigos Java</title>" +
        "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">" +
        "<link rel=\"stylesheet\" href=\"/codigos.css\">" +
        "<link href=\"https://fonts.googleapis.com/css2?family=Orbitron:wght@700&display=swap\" rel=\"stylesheet\">" +
    "</head>" +    
    "<body style=\"font-family: \'Orbitron\';background-color: #E0DEDE;\">" +
    
        "<div class=\" row bar \">" + 
            "<div class=\"col-sm-10\">" +
                "<p class=\"tag\">Tags:</p>" +
            "</div>" +
            "<div class=\"col-sm-2\">" +
                "<p class=\"voltar\">Voltar</p>" +
            "</div>" +
        "</div>" +
        "<div class=\"row\">" +
            "<div class=\"col-sm-2 titulo\">" +
                "<h2>JAVA</h2>" +
            "</div>" +
            "<div class=\"col-sm-3\"></div>"+
            "<div class=\"col- newcode\">INSIRA UM NOVO CÓDIGO</div>" +
            "<div class=\"col-sm-4\"></div>" +
        "</div>"  +
        "<div class=\"row\">" +
            "<div class=\"col-sm-5\"></div>"+
            "<div class=\"col-\">"+
                "<form action=\"/nossoCodigo/codigosJ\" method=\"post\">"+
                    "<div class=\"row\">"+
                        "<div class=\"col-sm-12\">"+
                            "<div class=\"row\">"+
                                "<div class=\"col-sm-3\">"+
                                    "<label for=\"nome\">Titulo:</label>" +
                                "</div>"+
                                "<div class=\"col-sm-9\">"+
                                    "<input type=\"text\" id=\"nome\" name=\"nome\">" +
                                "</div>"+
                            "</div>"+
                            "<div class=\"row\">"+
                                "<div class=\"col-sm-3\">"+ 
                                    "<label for=\"conteudo\">Código:</label>"+
                                "</div>" +
                                "<div class=\"col-sm-9\">" +
                                    "<textarea class=\"code\" type=\"text\" id=\"conteudo\" name=\"conteudo\"></textarea>"+
                                "</div>" +
                            "</div>" +
                            "<div class=\"row\">" +
                                "<div class=\"col-sm-3\">" +
                                    "<label for=\"descricao\">Descrição:</label>"+
                                "</div>"+
                                "<div class=\"col-sm-9\">"+
                                    "<textarea type=\"text\" id=\"descricao\" name=\"descricao\"></textarea>"+"<br>"+
                                "</div>"+
                            "</div>"+
                            "<p style=\"text-align: center;\"><input type=\"submit\" value=\"Enviar\" /></p>"+
                        "</div>"+
                    "</div>"+
                "</form>" +
            "</div>" +
            "<div class=\"col\"></div>"+
        "</div>"+
    "</body>";

        for(jcode j : jcode){
            html = html +
            "<div class=\"row\">" +
                "<div class=\"col-sm-1\"></div>" +
                "<div class=\"col-sm-5 block\">" +
                    "<div class=\"row\">" +
                        "<h2>"+ j.getNome()+"</h2>" +
                    "</div>" +
                    "<div class=\"row\">" +
                        "<div class=\"col codebox block\">" +
                            "<pre>" + formataDadosJ(j.getConteudo()) + "</pre>"+ "<br>"+
                        "</div>" +
                    "</div>" +
                "</div>" +
                "<div class=\"col-sm-5 block\">" +
                    "<div class=\"row\">"+
                        "<h2>Descrição</h2>"+
                    "</div>"+
                    "<div class=\"row\">"+
                        "<div class=\"col descbox block\">" +
                           " <pre>" + formataDadosJ(j.getDescricao()) + "</pre>"+
                        "</div>"+
                    "</div>"+ 
                 "</div>" +
                "<div class=\"col-sm-1\"></div>" +
            "</div>" + 
            "<br>" +
            "<div class=\"row\">"+
                "<div class=\"col\"></div>"+
                "<div class=\"col-\">"+
                    "<form action=\"/nossoCodigo/delete\" method=\"POST\">"+
                        "<p><input type=\"submit\" value=\"Deletar Código\"/></p>"+
                    "</form>"+
                "</div>" +
                "<div class=\"col\"></div>"+
            "</div>" + 
            "<br>"
            ;
        }
        return html;
    }
}