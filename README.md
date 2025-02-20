# Sistema de Carro com Composite em Java

Este documento tem como objetivo explicar o funcionamento e a estrutura do sistema de carro implementado com o padrão Composite. O padrão Composite permite compor objetos em estruturas em árvore para representar hierarquias parte-todo. Nele, tanto os objetos individuais (folhas) quanto os compostos (nós) implementam a mesma interface, facilitando o tratamento uniforme.

## Estrutura do Projeto

O sistema é composto pelas seguintes classes:

1. **ComponenteCarro**  
   - **Descrição:** Interface comum para todos os componentes do carro, sejam eles peças individuais ou grupos de peças.  
   - **Métodos:**  
     - `double getValor()` – Retorna o valor do componente.
     - `void mostrarDetalhes()` – Exibe os detalhes do componente.

2. **Peca**  
   - **Descrição:** Classe que representa uma peça simples (folha) do carro.  
   - **Atributos:**  
     - `nome`: Nome da peça.
     - `valor`: Valor da peça.
   - **Implementação:**  
     - Implementa os métodos da interface `ComponenteCarro` para retornar seu valor e mostrar seus detalhes.

3. **GrupoPecas**  
   - **Descrição:** Classe que representa um grupo de peças (composite). Essa classe pode conter tanto peças simples quanto outros grupos de peças, formando uma estrutura hierárquica.  
   - **Atributos:**  
     - `nome`: Nome do grupo.
     - `componentes`: Lista de componentes que pertencem ao grupo.
   - **Métodos:**  
     - `adicionar(ComponenteCarro componente)`: Adiciona um componente ao grupo.
     - `remover(ComponenteCarro componente)`: Remove um componente do grupo.
     - `getValor()`: Soma os valores de todos os componentes do grupo.
     - `mostrarDetalhes()`: Exibe os detalhes de cada componente e o subtotal do grupo.

4. **Carro**  
   - **Descrição:** Classe que estende `GrupoPecas` e funciona como a raiz da hierarquia. Representa o carro completo e agrega todos os grupos de peças (motor, chassi, sistema elétrico, rodas etc.).  
   - **Implementação:**  
     - Sobrescreve o método `mostrarDetalhes()` para exibir os detalhes do carro.

5. **Main**  
   - **Descrição:** Classe de execução onde são instanciados os objetos, criados os grupos e peças, e executado o método para mostrar os detalhes e calcular o valor total do carro.

## Funcionamento do Sistema

- **Composição da Hierarquia:**  
  A estrutura é montada criando um objeto `Carro`, que agrega diversos grupos (por exemplo, Motor, Chassi, Sistema Elétrico, Rodas). Cada grupo pode, por sua vez, conter peças individuais (instâncias da classe `Peca`) ou até mesmo subgrupos (como o Sistema de Injeção dentro do Motor).

- **Cálculo do Valor Total:**  
  Cada componente (peça ou grupo) implementa o método `getValor()`. Para grupos, o método itera sobre seus componentes e soma os valores retornados. Assim, chamando `getValor()` no objeto `Carro`, o sistema calcula recursivamente o valor total de todas as peças inseridas.

- **Exibição dos Detalhes:**  
  O método `mostrarDetalhes()` é responsável por imprimir no console as informações de cada componente. No caso de grupos, ele percorre todos os seus elementos, exibindo o nome e o valor, além de um subtotal para aquele grupo.
