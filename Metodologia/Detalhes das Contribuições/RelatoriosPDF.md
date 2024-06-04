# Criação de Relatórios PDF

Foi um arquivo criado para cada variável meteorológica, mas todos seguiram a mesma lógica. Por isso, utilizarei apenas o de Precipitação para ilustrar o que foi feito.

[1. PdfPrecipitacao,java](# pdf)

[2. Método para enviar o relatório à aplicação](# endpoint)

#### PdfPrecipitacao.java

```java
public class PdfPrecipitacao {

public static ByteArrayInputStream exportarPdfPrecipitacao (List viewPrecipitacaoModals) throws IOException {

//Criando o documento PDF

Document document = new Document(PageSize.A4.rotate(), 25, 25, 25, 25);
ByteArrayOutputStream out = new ByteArrayOutputStream();

try {

    //Criando a tabela para o relatório
    PdfPTable table = new PdfPTable(2);
    table.setWidthPercentage(100);
    table.setWidths(new int[] { 4, 4});

    //Criando o cabeçalho da tabela

    Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.WHITE);
    PdfPCell hcell;

    hcell = new PdfPCell(new Phrase("Data/Hora", headFont));
    table.addCell(hcell);

    hcell = new PdfPCell(new Phrase("Precipitação Total (%)", headFont));
    table.addCell(hcell);

```

O código em questão é responsável pela geração de um relatório em formato PDF. O método `exportarPdfPrecipitacao` recebe como parâmetro uma lista de objetos do tipo `ViewPrecipitacaoModal`, que representam os dados a serem exibidos no relatório.

Na implementação, é criado um novo documento PDF. Em seguida, é criada uma tabela para o relatório, com duas colunas para exibir as informações de data/hora e precipitação total, respectivamente. O cabeçalho da tabela é definido com os nomes das colunas.

```java
for (ViewPrecipitacaoModal viewPrecipitacaoModal : viewPrecipitacaoModals) {

//Povoando as células da tabela

Font font = FontFactory.getFont(FontFactory.HELVETICA, 14, BaseColor.BLACK);
Font fontDataHora = FontFactory.getFont(FontFactory.HELVETICA, 14, BaseColor.BLACK);

PdfPCell cell;

cell = new PdfPCell(new Phrase(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(viewPrecipitacaoModal.getDatahoraCaptacao()), fontDataHora));
table.addCell(cell);

cell = new PdfPCell(new Phrase(viewPrecipitacaoModal.getPrecipitacaototal(), font));
table.addCell(cell);

}

```

Então, para cada objeto `ViewPrecipitacaoModal` na lista fornecida, são criadas linhas na tabela com as informações de data/hora e precipitação total correspondentes. Isso foi realizado utilizando um loop. A tabela é estilizada alternando a cor de fundo e da borda das células, definindo uma cor para o cabeçalho e permitindo que ele se repita em todas as páginas do documento gerado.

```java
//Abrindo o documento PDF para ser editado

PdfWriter.getInstance(document, out);
document.open();

//Adicionando imagem

Image img = Image.getInstance("https://raw.githubusercontent.com/fluffyfatec/Iacit/Sprint- 4/API- IACIT/api/images/iacit.png");
img.setAbsolutePosition(635f, PageSize.A4.getHeight() - img.getScaledHeight() - 90);
img.scaleAbsolute(175f, 115f);

//Definindo parágrafos para o título do documento PDF

Paragraph textoEstacao = new Paragraph(new Phrase("Estação " + viewPrecipitacaoModals.get(0).getEstacaoNome() + ", " + "Estado de " + viewPrecipitacaoModals.get(0).getEstacaoEstado(), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24, BaseColor.BLACK)));
textoEstacao.setAlignment(Element.ALIGN_LEFT);

Paragraph textoDataHora = new Paragraph(new Phrase("Dados de " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(viewPrecipitacaoModals.get(0).getDatahoraCaptacao()) + " até " +

new SimpleDateFormat("dd/MM/yyyy HH:mm").format(viewPrecipitacaoModals.get(viewPrecipitacaoModals.size() - 1).getDatahoraCaptacao()), FontFactory.getFont(FontFactory.HELVETICA, 21, BaseColor.BLACK)));
textoDataHora.setAlignment(Element.ALIGN_LEFT);

Paragraph textoDados = new Paragraph(new Phrase("Precipitação", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK)));
textoDados.setAlignment(Element.ALIGN_CENTER);

//Adicionando os parágrafos, imagem e tabela ao documento PDF

document.add(img);
document.add(textoEstacao);
document.add(textoDataHora);
document.add(textoDados);
document.add(table);

document.close();

} catch (DocumentException ex) {

}

return new ByteArrayInputStream(out.toByteArray());

}

}

```

O documento PDF é aberto e são adicionados ao mesmo uma imagem, parágrafos com informações da estação meteorológica, período de dados coletados e o título do relatório, que é "Precipitação". O documento é fechado e retornado como um objeto `ByteArrayInputStream` para que possa ser manipulado posteriormente.

[Voltar ao topo](# voltar)

## Método para enviar o relatório à aplicação

```java
@GetMapping(value = "/Precipitacao/pdf/{estNome}/{estEstado}/{estDTinicial}/{estDTfinal}", produces = MediaType.APPLICATION_PDF_VALUE)

public ResponseEntity relatorioPrecipitacao (HttpServletResponse response, @PathVariable("estNome") String estNome, @PathVariable("estEstado") String estEstado, @PathVariable("estDTinicial") String estDTinicial, @PathVariable("estDTfinal") String estDTfinal) throws IOException {

    List precipitacao = precipitacaorepository.listRange(estEstado,estNome,Timestamp.valueOf(estDTinicial),Timestamp.valueOf(estDTfinal));

    ByteArrayInputStream bis = PdfPrecipitacao.exportarPdfPrecipitacao(precipitacao);

    HttpHeaders headers = new HttpHeaders();

    headers.add("Content- Disposition", "attachment;filename=Relatório Precipitação " + estNome + "(" + new SimpleDateFormat("dd- MM- yyyy").format(precipitacao.get(0).getDatahoraCaptacao()) + " até " + new SimpleDateFormat("dd- MM- yyyy").format(precipitacao.get(precipitacao.size() - 1).getDatahoraCaptacao()) + ").pdf");

    return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));

}

```

Esse é um método de um controller que utiliza a anotação `@GetMapping` para mapear a URL "/Precipitacao/pdf/{estNome}/{estEstado}/{estDTinicial}/{estDTfinal}" para um relatório em formato PDF.

O método retorna um objeto `ResponseEntity` que contém um `InputStreamResource` que representa o arquivo PDF que será retornado ao usuário. Além disso, o método utiliza a anotação `@PathVariable` para obter os valores dos parâmetros `estNome`, `estEstado`, `estDTinicial` e `estDTfinal` a partir da URL e, em seguida, realiza uma série de operações em cima desses parâmetros.

Primeiramente, são realizadas operações de substituição de caracteres "\* " por espaços em branco nos parâmetros do `@PathVariable`.

Em seguida, é realizada uma consulta no banco de dados através do objeto `precipitacaorepository` para recuperar uma lista de dados de precipitação que correspondem aos parâmetros especificados na URL.

A lista de dados é então percorrida para realizar uma verificação e atualização dos valores de precipitação total (caso estejam nulos).

Em seguida, o método utiliza um objeto `PdfPrecipitacao` (o código anterior) para exportar um arquivo PDF a partir da lista de dados de precipitação obtida. Este objeto é responsável por criar e popular o arquivo PDF.

Por fim, são definidos os cabeçalhos HTTP e os metadados do arquivo PDF, e o `InputStreamResource` é retornado no objeto `ResponseEntity`. O arquivo PDF é então baixado pelo cliente em seu navegador com o nome de arquivo especificado nos cabeçalhos HTTP.

[Voltar ao topo](# voltar)
