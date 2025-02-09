const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

function input(question) {
    return rl.question(question, answer => {
        return answer
    })
}

input("What is your name? ")