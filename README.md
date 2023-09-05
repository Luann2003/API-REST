# API-REST
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Luann2003/API-REST/blob/main/LICENSE) 

**Principais Funcionalidades**:
- Transferência de Fundos: A API permite que os usuários transfiram dinheiro entre duas contas bancárias de forma rápida e segura. Os fundos são transferidos com precisão, garantindo que nenhuma quantia seja perdida no processo.
- Conta Inexistente: Se o usuário informar uma conta que não existe no sistema, a API lançará uma exceção ContaInexistenteException, informando que a conta não foi encontrada.
- Saldo Insuficiente: Caso o saldo da conta de origem seja insuficiente para cobrir a transferência, a API lançará uma exceção SaldoInsuficienteException, indicando que a operação não pode ser concluída devido à falta de fundos.
- Permissões Insuficientes: Se o usuário não tiver permissão para efetuar uma transferência entre as contas especificadas, a API lançará uma exceção 
```bash
# Clone o repositório
git clone https://github.com/Luann2003/API-REST.git

# Navegue até o diretório do projeto
cd API-REST

# Compile e execute o programa
java main.java
```
## Transferência 

![](https://github.com/Luann2003/API-REST/blob/main/transferencia.png)

# Autor
Luan Victor de Ramos Luciano

https://www.linkedin.com/in/luan-luciano-1603b4197/

