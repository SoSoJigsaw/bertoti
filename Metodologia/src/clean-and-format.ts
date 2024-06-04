import * as fs from 'fs'
import * as prettier from 'prettier'
import { glob } from 'glob-promise'

// Função para substituir tags HTML por Markdown
function convertHtmlToMarkdown(content: string): string {
    const replacements: { [key: string]: string } = {
      '<br>': '  \n',
      '<strong>': '**',
      '</strong>': '**',
      '<b>': '**',
      '</b>': '**',
      '<em>': '*',
      '</em>': '*',
      '<i>': '*',
      '</i>': '*',
      '<h1>': '# ',
      '</h1>': '\n',
      '<h2>': '## ',
      '</h2>': '\n',
      '<h3>': '### ',
      '</h3>': '\n',
      '<h4>': '#### ',
      '</h4>': '\n',
      '<h5>': '##### ',
      '</h5>': '\n',
      '<h6>': '###### ',
      '</h6>': '\n',
      '<ul>': '',
      '</ul>': '\n',
      '<ol>': '',
      '</ol>': '\n',
      '<li>': '- ',
      '</li>': '\n',
      '<p>': '',
      '</p>': '\n',
      '<code>': '`',
      '</code>': '`',
      '<pre>': '```\n',
      '</pre>': '\n```',
      '<blockquote>': '> ',
      '</blockquote>': '\n',
      '<hr>': '\n\n---\n\n'
    };
  
    let converted = content;
    for (const [html, markdown] of Object.entries(replacements)) {
      if (html.startsWith('<a') || html === '<a>' || html.startsWith('</a') || html === '</a>') continue;
      if (html.startsWith('<img') || html === '<img>' || html.startsWith('</img') || html === '</img>') continue;
      converted = converted.split(html).join(markdown);
    }
    return converted;
  }
  
  // Função para adicionar espaçamento hierárquico
  function addHierarchicalSpacing(content: string): string {
    return content
      .replace(/(#+)([^\s#])/g, '$1 $2') // Espaçamento após cabeçalhos
      .replace(/(\*|\-|\+)([^\s\*])/g, '$1 $2') // Espaçamento após itens de lista
      .replace(/(\d+\.\s)([^\s\d])/g, '$1 $2') // Espaçamento após listas ordenadas
      .replace(/(```\w*\s*)/g, '\n$1') // Nova linha antes de blocos de código
      .replace(/(\n\s*\n)+/g, '\n\n'); // Remover múltiplas linhas em branco
  }
  
  // Função para formatar arquivo Markdown
  async function formatMarkdown(file: string): Promise<void> {
    const content = fs.readFileSync(file, 'utf8');
    const convertedContent = convertHtmlToMarkdown(content);
    const spacedContent = addHierarchicalSpacing(convertedContent);
    const formatted = prettier.format(spacedContent, { parser: 'markdown' });
  
    fs.writeFileSync(file, await formatted);
  }
  
  // Aplicar formatação a todos os arquivos Markdown
  glob('**/*.md', (err: Error | null, files: string[]) => {
    if (err) throw err;
    files.forEach(formatMarkdown);
  });
