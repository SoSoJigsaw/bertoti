# Geração de PDFs dos gráficos

## downloadPDF.js

```javascript
function jsGraficosPDF(chart1, chart2, tela) {
  const canvas = document.getElementById(chart1);
  const canvas2 = document.getElementById(chart2);

  //criando a imagem a partir do gráfico

  const canvasImage = canvas.toDataURL("image/png", 1);
  const canvasImage2 = canvas2.toDataURL("image/png", 1);

  //variáveis para o texto do PDF

  var estado = document.getElementById("estado");
  var estacao = document.getElementById("estacao");
  var dataMin = document.getElementById("dtMin");
  var dataMax = document.getElementById("dtMax");

  //passando a imagem para o pdf

  let pdf = new jsPDF("landscape");
  pdf.setFontSize(24);
  pdf.setFont("helvetica", "bold");
  pdf.text(15, 15, [
    "Estação " + estacao.innerText + ", Estado de " + estado.innerText,
    " ",
  ]);
  pdf.setFont("helvetica", "");
  pdf.text(15, 15, [
    " ",
    "Dados de " + dataMin.innerText + " até " + dataMax.innerText,
  ]);

  pdf.addImage(canvasImage, "PNG", 10, 35, 275, 150);
  pdf.addPage();
  pdf.addImage(canvasImage2, "PNG", 10, 30, 275, 150);
  pdf.save("Gráficos " + tela + " (" + estacao.innerText + ").pdf");
}
```

O código JavaScript `downloadPDF.js` é uma função chamada `jsGraficosPDF` que é responsável por gerar um arquivo PDF a partir de dois gráficos gerados em um página da web.

A função recebe três parâmetros: `chart1`, `chart2` e `tela`. `chart1` e `chart2` são os IDs dos elementos HTML que contém os gráficos que serão incluídos no PDF, e tela é um valor de texto que será incluído no nome do arquivo PDF gerado.

A função começa obtendo os elementos HTML canvas que contêm os gráficos a partir dos IDs passados como parâmetro. Em seguida, ela usa o método `toDataURL` do objeto canvas para gerar uma imagem em formato PNG a partir do conteúdo do gráfico.

Em seguida, a função obtém outros elementos HTML que contém informações sobre a estação, o estado e o intervalo de datas apresentados nos gráficos. Essas informações são usadas para criar um cabeçalho no arquivo PDF que será gerado.

Finalmente, a função usa a biblioteca `jsPDF` para criar um novo objeto PDF e adicionar as imagens dos gráficos e o texto do cabeçalho a ele. O PDF resultante é salvo com um nome de arquivo baseado nas informações da estação e do intervalo de datas, e a função retorna o objeto PDF.

[Voltar ao topo](# voltar)
