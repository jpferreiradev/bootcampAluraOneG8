alert("Boas vindas ao jogo do número secreto");

let numeroMaximo = 5000;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(numeroSecreto)
let chute;
let tentativas = 1;



while( chute != numeroSecreto){
    
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}`);    
    
    if(chute == numeroSecreto){
        break;
    
    } else{
        if(chute > numeroSecreto){
            alert(`O numero secreto é menor ${chute}`);
        } else{
            alert(`O numero secreto é maior que ${chute}`);
        }
        tentativas++;
    
    }
}
    

    let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';

        alert(`Isso ai você acertou o número secreto  ${numeroSecreto} com ${tentativas} ${palavraTentativa} `);

   
    




/*
let senhaSistema = "senhaTeste!";

let senha = prompt("Digite a senha do sistema: ")

//jeifejfiejfi
if(senha == senhaSistema){
    alert("Acesso ao sistema garantido");
    // console.log( "Acesso ao sistema garantido") -> Você pode colocar pra ver o erro
} else{
    alert("Você errou =[")
}
     if(numeroSecreto > 1)   {
        alert(`Isso ai você acertou o número secreto é ${numeroSecreto} com ${tentativas} tentativas `);
    }
        else{
        alert(`Isso ai você acertou o número secreto é ${numeroSecreto} com ${tentativas} tentativa `);
    }
*/
