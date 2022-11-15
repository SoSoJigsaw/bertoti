const listaPesquisa = document.getElementById('lista-pesquisa');
const gradeResultado = document.getElementsByClassName('grade-resultado')[0];
const pesquisaFilme = document.getElementById('pesquisa-filme');


// Adicionando evento de click que esconde a lista de pesquisa
window.addEventListener('click', (event) => {
    if(event.target.className != "formulario"){
        listaPesquisa.classList.add('hide-lista-pesquisa');
    }
});


// Function que pega o termo pesquisado, e retorna a lista de correspondências
function jsAcharFilmes() {
    let termoPesquisado = (pesquisaFilme.value).trim();
    if(termoPesquisado.length > 0){
        listaPesquisa.classList.remove('hide-lista-pesquisa');
        jsCarregarFilmes(termoPesquisado);
    } else {
        listaPesquisa.classList.add('hide-lista-pesquisa');
    }
}


// Function que carrega os filmes da API
async function jsCarregarFilmes(termoPesquisado) {
    const link = `https://omdbapi.com/?s=${termoPesquisado}&page=1&apikey=b0202a42`;
    const resposta = await fetch(`${link}`);
    const dados = await resposta.json();
    if(dados.Response == "True") jsMostrarListaFilmes(dados.Search);
}


// Function que gera a lista de pesquisa em uma div
function jsMostrarListaFilmes(titulos) {
    listaPesquisa.innerHTML = "";
    for(let n = 0; n < titulos.length; n++){
        let elementoListaPesquisa = document.createElement('div');
        elementoListaPesquisa.dataset.id = titulos[n].imdbID;
        elementoListaPesquisa.classList.add('lista-pesquisa-item');
        if(titulos[n].Poster != "N/A")
            filmePoster = titulos[n].Poster;
        else 
            filmePoster = "image_not_found.png";

        elementoListaPesquisa.innerHTML = `
        <div class = "item-pesquisa-poster">
            <img src="${filmePoster}">
        </div>
        <div class="item-pesquisa-info">
            <h3>${titulos[n].Title}</h3>
            <p>${titulos[n].Year}</p>
        </div>
        `;
        listaPesquisa.appendChild(elementoListaPesquisa);
    }
    jsCarregarInfosFilme();
}


// Function que gera divs HTML com as informações do filme retornadas pela API
async function jsMostrarInfosFilme(infos) {

    const movieID = infos.imdbID
    const movieIDkey = infos.imdbID + 'key'
    const watchlistBtnKey = infos.imdbID + 'watchlistBtn'
    const removeBtnKey = infos.imdbID + 'removeBtn'

    resultadoContainer = document.getElementsByClassName("container-resultado")[0]
    resultadoContainer.id = movieID;

    gradeResultado.id = movieIDkey + 'Grade'

    gradeResultado.innerHTML = `
    <div class="filme-poster">
        <img src="${(infos.Poster != "N/A") ? infos.Poster : "image_not_found.png"}" alt="filme poster">
    </div>
    <div class="filme-infos">
        <h3 class="filme-titulo">${infos.Title}</h3>
        <span id=${movieIDkey} class="hide chave-filme">${movieIDkey}</span>
        <p class="avaliacao"><i class="fa-sharp fa-solid fa-star"></i></<b>${infos.imdbRating}</b></p>
        <button class="card-btn card-watchlist watchlist-btn" id="${watchlistBtnKey}" onclick="adicionarMinhaLista(${movieIDkey}, ${movieID}, ${watchlistBtnKey}, ${removeBtnKey})"><i class="fa-solid fa-circle-plus"></i></button>
        <button class="card-btn card-watchlist remove-watchlist-btn" id="${removeBtnKey}" onclick="removerMinhaLista(${movieIDkey}, ${removeBtnKey}, ${watchlistBtnKey}, ${removeBtnKey})"><i class="fa-solid fa-circle-minus"></i></button> 
        <ul class="ano-duracao-info">
            <li class="ano"><b>Ano:</b> ${infos.Year}</li>
            <li class="duracao"><b>Duração:</b> ${infos.Runtime}</li>
        </ul>
        <p class="genero"><b>Gênero:</b> ${infos.Genre}</p>
        <p class="sinopse"><b>Sinopse:</b> ${infos.Plot}</p>
        <p class="escritor"><b>Escrito por:</b> ${infos.Writer}</p>
        <p class="atores"><b>Atores:</b> ${infos.Actors}</p>
        <p class="linguagem"><b>Idioma:</b> ${infos.Language}</p>
        <p class="pais"><b>País:</b> ${infos.Country}</p>   
        <p class="premios"><b><i class="fas fa-award"></i></b> ${infos.Awards}</p>
    </div>
    `;

    removerBotoes(movieIDkey)
}


// Function que que carrega as informações do filme, para serem retornadas ao HTML em outra function
function jsCarregarInfosFilme() {
    const listaPesquisaFilmes = listaPesquisa.querySelectorAll('.lista-pesquisa-item');
    listaPesquisaFilmes.forEach(titulo => {
        titulo.addEventListener('click', async () => {
            listaPesquisa.classList.add('hide-lista-pesquisa');
            pesquisaFilme.value = "";
            const result = await fetch(`http://www.omdbapi.com/?i=${titulo.dataset.id}&apikey=b0202a42`);
            const filmeInfos = await result.json();
            jsMostrarInfosFilme(filmeInfos);
        });
    });
}
