 class ContaBancaria {
  constructor(nomeCliente, numConta, saldoInicial = 0) {
    this.nomeCliente = nomeCliente;
    this.numConta = numConta;
    this.saldo = saldoInicial;
  }

  // Método para depositar dinheiro
  depositar(valor) {
    if (valor > 0) {
      this.saldo += valor;
      console.log(`Depósito de R$${valor.toFixed(2)} realizado com sucesso.`);
    } else {
      console.log("Valor de depósito inválido.");
    }
  }

  // Método para sacar dinheiro
  sacar(valor) {
    if (valor > 0 && valor <= this.saldo) {
      this.saldo -= valor;
      console.log(`Saque de R$${valor.toFixed(2)} realizado com sucesso.`);
    } else {
      console.log("Saque não permitido. Saldo insuficiente ou valor inválido.");
    }
  }

  // Método para exibir informações da conta
  mostrarSaldo() {
    console.log(`Cliente: ${this.nomeCliente}`);
    console.log(`Conta Nº: ${this.numConta}`);
    console.log(`Saldo atual: R$${this.saldo.toFixed(2)}`);
  }
}

// Teste da classe
const conta1 = new ContaBancaria("Jota Coelho","14389-11",1000000);
conta1.depositar(500);
conta1.sacar(300);
conta1.mostrarSaldo();
