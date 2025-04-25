# BankAccount Java Application

Este projeto é uma aplicação Java simples que simula operações bancárias, como criação de contas, depósitos e saques. Ele utiliza conceitos básicos de programação orientada a objetos, como encapsulamento, construtores e métodos.

## Funcionalidades

1. **Criar uma conta bancária**:
   - O usuário pode criar uma conta informando o número da conta, o nome do titular e, opcionalmente, um depósito inicial.

2. **Exibir os dados da conta**:
   - Após a criação, os dados da conta são exibidos, incluindo o número, o titular e o saldo.

3. **Realizar depósitos**:
   - O usuário pode adicionar um valor ao saldo da conta.

4. **Realizar saques**:
   - O usuário pode retirar um valor do saldo da conta. Uma taxa fixa de $5.00 é aplicada a cada saque.

## Exemplo de Execução

Enter account number: 1234
Enter account holder: John Doe
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 1234, Holder: John Doe, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 1234, Holder: John Doe, Balance: $ 700.00

Enter a withdraw value: 100.00
Updated account data:
Account 1234, Holder: John Doe, Balance: $ 595.00