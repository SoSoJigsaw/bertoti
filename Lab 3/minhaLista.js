const watchlist = document.getElementById('watchlist')
const removeWatchlistBtn = document.getElementsByClassName('remove-watchlist-btn')
const cardWatchlistBtn = document.getElementsByClassName('watchlist-btn')
const movieKey = document.getElementsByClassName('movie-key')
const localStorageKeys = Object.keys(localStorage)


function displayWatchlistOrRemoveBtn(movieIDkey) {
    for (let movie of movieKey) {
        const removeBtnID = movie.id.slice(0, 9) + 'removeBtn'
        const removeBtn = document.getElementById(removeBtnID)

        const watchlistBtnID = movie.id.slice(0, 9) + 'watchlistBtn'
        const watchlistBtn = document.getElementById(watchlistBtnID)

        if (localStorageKeys.indexOf(movieIDkey) === -1) {
            removeBtn.style.display = 'none'
        }

        localStorageKeys.forEach((key) => {
            if (movie.id === key) {
                removeBtn.style.display = 'inline'
                watchlistBtn.style.display = 'none'
            }
        })
    }
}

function addToWatchlist(movieIDkey, movieID, watchlistBtnKey, removeBtnKey) {
    localStorage.setItem(movieIDkey.innerHTML, movieID.innerHTML)
    watchlistBtnKey.style.display = 'none'
    removeBtnKey.style.display = 'inline'
}

function removeFromWatchlist(movieIDkey, removeBtnKey, watchlistBtnKey, removeBtnKey) {
    localStorage.removeItem(movieIDkey.innerHTML)

    // Get parent element (the movie card div) and remove it
    if (watchlist) {
        localStorage.removeItem(movieIDkey.innerHTML)

        const apagarGrade = document.getElementById(movieIDkey.innerHTML + 'Grade')
        const parentEl = document.getElementById(movieIDkey.innerHTML).parentElement
        
        parentEl.remove()
        apagarGrade.remove()
    }

    watchlistBtnKey.style.display = 'inline'
    removeBtnKey.style.display = 'none'

    // Display default elements if local storage empty
    if (watchlist && localStorage.length === 0) {
        if (watchlist.children) {
            const children = watchlist.children
            const childrenArr = Array.prototype.slice.call(children)
            childrenArr.forEach((child) => (child.style.display = 'flex'))
        }
    }
}

// Hide default elements if data is in local storage
if (watchlist && localStorage.length > 0) {
    if (watchlist.children) {
        const children = watchlist.children
        const childrenArr = Array.prototype.slice.call(children)
        childrenArr.forEach((child) => (child.style.display = 'none'))
    }
}

for (let i = 0; i < localStorage.length; i++) {
    const getLocalStorage = localStorage.getItem(localStorage.key(i))

    // Display every key's value to the watchlist
    if (watchlist) {
        watchlist.innerHTML += `<div class="card">${getLocalStorage}</div>`

        // Hide the 'add to watchlist' button
        for (let button of cardWatchlistBtn) {
            button.style.display = 'none'
        }
        // Display the 'remove from watchlist' button
        for (let button of removeWatchlistBtn) {
            button.style.display = 'inline'
        }
    }
}

