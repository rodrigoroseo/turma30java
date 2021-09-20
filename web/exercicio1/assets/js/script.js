let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let mapa = document.querySelector('#mapa')

let nomeOk = false
let emailOk = false
let assuntoOk = false

function validaNome() {
    let txtNome = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
        txtNome.style.color = "red"
        txtNome.innerHTML = 'Nome deve conter pelo menos 3 letras'
        nomeOk = false
    } else {
        txtNome.style.color = "green"
        txtNome.innerHTML = '✔'
        nomeOk = true
    }
}

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')
    
    //fonte algorítmo: https://www.devmedia.com.br/validando-e-mail-em-inputs-html-com-javascript/26427
    usuario = email.value.substring(0, email.value.indexOf("@"));                       //usuario = antes do @
    dominio = email.value.substring(email.value.indexOf("@")+ 1, email.value.length);   //domino = depois do @

    if ((usuario.length >=1) &&                         //Tamanho de usuário maior ou igual a 1 caracter.
    (dominio.length >=3) &&                             //Tamanho do domínio maior ou igual a 3 caracteres.
    (usuario.search("@")==-1) &&                        //Usuário não pode conter o @
    (dominio.search("@")==-1) &&                        //Domínio não pode conter o @
    (usuario.search(" ")==-1) &&                        //Usuário não pode conter o “ ” espaço em branco
    (dominio.search(" ")==-1) &&                        //Domínio não pode conter o “ ” espaço em branco
    (dominio.search(".")!=-1) &&                        //Domínio tem que possuir “.” Ponto
    (dominio.indexOf(".") >=1)&&                        //A posição do primeiro ponto em domínio tem que ser maior ou igual a 1
    (dominio.lastIndexOf(".") < dominio.length - 1)) {  //A posição do ultimo ponto em domínio tem que ser menor que o ultimo caracter
        txtEmail.style.color = "green"
        txtEmail.innerHTML = '✔'
        emailOk = true
    } else {
        txtEmail.style.color = "red"
        txtEmail.innerHTML = 'E-mail inválido'
        emailOk = false
    }
    //FIM da fonte
}

function validaAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')

    if(assunto.value.length <= 0){
        txtAssunto.style.color = "red"
        txtAssunto.innerHTML = 'Precisa conter uma mensagem'
        assuntoOk = false
    } else if (assunto.value.length < 280 ) {
        txtAssunto.style.color = "green"
        txtAssunto.innerHTML = (280  - assunto.value.length) + ' caracteres restantes'
        assuntoOk = true
    } else if (assunto.value.length == 280 ) {
        txtAssunto.style.color = "yellow"
        txtAssunto.innerHTML = 'Limite de caracteres atingido'
        assuntoOk = true
    } else {
        txtAssunto.style.color = "red"
        txtAssunto.innerHTML = 'Limite de caracteres ultrapassado (' + (280  - assunto.value.length) + ')'
        assuntoOk = false
    }
}

function enviar() {
    let erroEnvio = document.querySelector('#erroEnvio')
    let listaErros = document.querySelector('#listaErros')
    let erros = ''
    listaErros.innerHTML = ''
    
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
        let resp = confirm(nome.value + ' - ' + email.value + '\n\n' + assunto.value + '\n\n--------------------------------------------------------------------------------Confirmar mensagem?')
        if (resp) {
            window.open("mensagemEnviada.html?nome="+nome.value+"&email="+email.value+"&assunto="+assunto.value)
        } else {
            alert('Envio cancelado')
        }
        
    } else {
        erroEnvio.style.display = "inline"
        if (!nomeOk) {
            erros += "<li style='color: red; font-size: 0.7vw'>Nome inválido</li>"
        }
        if (!emailOk) {
            erros += "<li style='color: red; font-size: 0.7vw'>E-mail inválido</li>"
        }
        if (!assuntoOk) {
            erros += "<li style='color: red; font-size: 0.7vw'>Assunto inválido</li>"
        }
        listaErros.innerHTML = erros
    }
}

function minimizarSpamErro() {
    let erroEnvio = document.querySelector('#erroEnvio')
    erroEnvio.style.display = "none"
}

function mapaZoom() {
    mapa.style.width = "53vw"
    mapa.style.height = "45vw"
    mapa.style.border = "0.2vw solid #222"
}

function mapaNormal() {
    mapa.style.width = "26.5vw"
    mapa.style.height = "12.5vw"
}

function mensagemEnviada() {
    let searchParams = new URLSearchParams(window.location.search)
    let uNome = searchParams.get('nome')
    let uEmail = searchParams.get('email')
    let uAssunto = searchParams.get('assunto')

    let eNome = document.querySelector('#nome')
    let eEmail = document.querySelector('#email')
    let eAssunto = document.querySelector('#assunto')

    eNome.innerHTML = uNome
    eEmail.innerHTML = uEmail
    eAssunto.innerHTML = uAssunto
}