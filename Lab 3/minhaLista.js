const watchlist = document.getElementById('watchlist')
const removeWatchlistBtn = document.getElementsByClassName('remove-watchlist-btn')
const cardWatchlistBtn = document.getElementsByClassName('watchlist-btn')
const chaveFilme = document.getElementsByClassName('chave-filme')
const ChaveslocalStorage = Object.keys(localStorage)


// Função que remove o botão de tirar da lista caso o filme não esteja na lista,
// e que também faz o inverso, mostra o botão de colocar na lista caso não esteja
function removerBotoes(idChaveFilme) {
    for (let filme of chaveFilme) {
        const IdBotaoRemover = filme.id.slice(0, 9) + 'removeBtn'
        const botaoRemover = document.getElementById(IdBotaoRemover)

        const IdMinhaListaBotao = filme.id.slice(0, 9) + 'watchlistBtn'
        const minhaListaBotao = document.getElementById(IdMinhaListaBotao)

        if (ChaveslocalStorage.indexOf(idChaveFilme) === -1) {
            botaoRemover.style.display = 'none'
        }

        ChaveslocalStorage.forEach((key) => {
            if (filme.id === key) {
                botaoRemover.style.display = 'inline'
                minhaListaBotao.style.display = 'none'
            }
        })
    }
}


// Função que adiciona o filme à Minha Lista
function adicionarMinhaLista(idChaveFilme, idFilme, chaveMinhaListaBotao, chaveBotaoRemover) {
    localStorage.setItem(idChaveFilme.innerHTML, idFilme.innerHTML)
    chaveMinhaListaBotao.style.display = 'none'
    chaveBotaoRemover.style.display = 'inline'
}


// Função que remove o filme da Minha Lista
function removerMinhaLista(idChaveFilme, chaveBotaoRemover, chaveMinhaListaBotao, chaveBotaoRemover) {
    localStorage.removeItem(idChaveFilme.innerHTML)

    if (watchlist) {
        localStorage.removeItem(idChaveFilme.innerHTML)

        const apagarGrade = document.getElementById(idChaveFilme.innerHTML + 'Grade')
        const elementoParente = document.getElementById(idChaveFilme.innerHTML).parentElement
        
        elementoParente.remove()
        apagarGrade.remove()
    }

    chaveMinhaListaBotao.style.display = 'inline'
    chaveBotaoRemover.style.display = 'none'

    // Mostrar os elementos default do html se o local storage estiver vazio
    if (watchlist && localStorage.length === 0) {
        if (watchlist.children) {
            const children = watchlist.children
            const childrenArr = Array.prototype.slice.call(children)
            childrenArr.forEach((child) => (child.style.display = 'flex'))
        }
    }
}

// Esconder os elmentos default do html se houver dados no local storage
if (watchlist && localStorage.length > 0) {
    if (watchlist.children) {
        const children = watchlist.children
        const childrenArr = Array.prototype.slice.call(children)
        childrenArr.forEach((child) => (child.style.display = 'none'))
    }
}

for (let i = 0; i < localStorage.length; i++) {
    const getLocalStorage = localStorage.getItem(localStorage.key(i))

    // Mostrar todos as chaves salvas no local storage na minha lista
    if (watchlist) {
        watchlist.innerHTML += `<div class="card">${getLocalStorage}</div>`

        // Esconder o botão de adicionar a minha lista
        for (let button of cardWatchlistBtn) {
            button.style.display = 'none'
        }
        // Mostrar o botão de tirar da minha lista
        for (let button of removeWatchlistBtn) {
            button.style.display = 'inline'
        }
    }
}

