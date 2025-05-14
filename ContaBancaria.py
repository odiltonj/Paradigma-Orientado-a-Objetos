class ContaBancaria:
    # Atributo de classe (compartilhado por todas as instâncias)
    banco = "Banco do Brasil"
    
    # Método construtor (inicializador)
    def __init__(self, titular, saldo=0):
        # Atributos de instância
        self.titular = titular
        self.saldo = saldo
        self.ativo = False
    
    # Método para ativar a conta
    def ativar_conta(self):
        self.ativo = True
        print(f"Conta de {self.titular} ativada com sucesso!")
    
    # Método para depositar
    def depositar(self, valor):
        if self.ativo:
            self.saldo += valor
            print(f"Depósito de R${valor:.2f} realizado. Novo saldo: R${self.saldo:.2f}")
        else:
            print("Conta inativa. Não é possível depositar.")
    
    # Método para sacar
    def sacar(self, valor):
        if self.ativo:
            if valor <= self.saldo:
                self.saldo -= valor
                print(f"Saque de R${valor:.2f} realizado. Novo saldo: R${self.saldo:.2f}")
            else:
                print("Saldo insuficiente.")
        else:
            print("Conta inativa. Não é possível sacar.")
    
    # Método especial para representação em string
    def __str__(self):
        status = "Ativa" if self.ativo else "Inativa"
        return f"Conta de {self.titular} | Saldo: R${self.saldo:.2f} | Status: {status}"

# Herança: Criando uma classe ContaPoupanca que herda de ContaBancaria
class ContaPoupanca(ContaBancaria):
    def __init__(self, titular, saldo=0, taxa_rendimento=0.005):
        super().__init__(titular, saldo)
        self.taxa_rendimento = taxa_rendimento
    
    def aplicar_rendimento(self):
        if self.ativo:
            rendimento = self.saldo * self.taxa_rendimento
            self.saldo += rendimento
            print(f"Rendimento aplicado: R${rendimento:.2f}. Novo saldo: R${self.saldo:.2f}")
        else:
            print("Conta inativa. Não é possível aplicar rendimento.")

# Usando as classes
if __name__ == "__main__":
    # Criando instâncias (objetos)
    conta1 = ContaBancaria("João Silva", 1000)
    conta2 = ContaPoupanca("Maria Souza", 500, 0.007)
    
    # Operações com a conta1
    print("\n--- Operações na conta de João ---")
    print(conta1)  # Chama o método __str__
    conta1.depositar(200)  # Não funciona porque a conta está inativa
    conta1.ativar_conta()
    conta1.depositar(200)
    conta1.sacar(50)
    
    # Operações com a conta2
    print("\n--- Operações na conta de Maria ---")
    conta2.ativar_conta()
    conta2.depositar(300)
    conta2.aplicar_rendimento()
    print(conta2)
    
    # Acessando atributo de classe
    print(f"\nTodas as contas pertencem ao {ContaBancaria.banco}")