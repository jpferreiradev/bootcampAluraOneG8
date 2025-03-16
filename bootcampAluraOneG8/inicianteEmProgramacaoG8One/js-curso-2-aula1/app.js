let listasDeNumerosSorteados = [];
let numeroLimite = 10;
let tentativas = 1;
let numeroSecreto = gerarNumeroAleatorio();



function exibirTextoNaTela(tag,texto){
    let campo = document.querySelector(tag); // exibir texto na tela
    campo.innerHTML = texto;  
    responsiveVoice.speak(texto,'Brazilian Portuguese Female',{rate:1.2});
}


function exibirMensagemInicical(){
    exibirTextoNaTela('h1','Jogo do número secreto');
    exibirTextoNaTela('p','Escolha um número secreto entre 1 e 10');    
}

exibirMensagemInicical();

function verificarChute(){
    let chute = document.querySelector('input').value;
    //console.log(chute == numeroSecreto);

    if(chute == numeroSecreto){
        exibirTextoNaTela('h1','Acertou');
        let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativas';
        let mensagemTentativas = `Você descobriu o número secreto com ${tentativas} ${palavraTentativa}`;
        exibirTextoNaTela('p',mensagemTentativas);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else{
        if( chute > numeroSecreto){
            exibirTextoNaTela('p', 'O número secreto é menor');
        } else{
            exibirTextoNaTela('p', 'O número secreto é maior');
        }
        //tentativas = tentativas + 1;
        tentativas++;
        limparCampo();
    }
}

function gerarNumeroAleatorio(){
   let numeroEscolhido  = parseInt(Math.random() * numeroLimite + 1);
   let quantidadeDeElementosNalista = listasDeNumerosSorteados.length;

   if(quantidadeDeElementosNalista == numeroLimite){
    listasDeNumerosSorteados = [];
   }
   
   if(listasDeNumerosSorteados.includes(numeroEscolhido)){
        return gerarNumeroAleatorio();
   
    } else{
    listasDeNumerosSorteados.push(numeroEscolhido);
    console.log(listasDeNumerosSorteados);
    return numeroEscolhido;
   }
}

function limparCampo(){
    chute = document.querySelector('input');
    chute.value = '';

}

function reiniciarJogo(){
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicical();
    document.getElementById('reiniciar').setAttribute('disabled',true);
}

//let titulo = document.querySelector('h1');
//titulo.innerHTML = 'Jogo do número secreto';

//let paragrafo = document.querySelector('p')
//paragrafo.innerHTML = 'Escolha um número secreto entre 1 e 10';

//let numeroSecreto = gerarNumeroAleatorio();