# ValidadorDCPF
Crie um programa para validar CPF (o usuário informa os onze dígitos do documento
e ele informa se o número informado é válido ou não). Um CPF é composto de 11
dígitos, em que os dois últimos são os dígitos verificadores. Para ser válido, o primeiro
e o segundo dígitos do CPF informado devem ser iguais a determinados valores, como
descrito abaixo.
Para validação do CPF da pessoa, utilize a seguinte estratégia.
Passo 1:
Multiplique o 1° dígito do CPF por 10
Multiplique o 2° dígito do CPF por 9
Multiplique o 3° dígito do CPF por 8
Multiplique o 4° dígito do CPF por 7
Multiplique o 5° dígito do CPF por 6
Multiplique o 6° dígito do CPF por 5
Multiplique o 7° dígito do CPF por 4
Multiplique o 8° dígito do CPF por 3
Multiplique o 9° dígito do CPF por 2
Passo 2:
Some os resultados das multiplicações anteriores.
Passo 3:
Encontre o resto da divisão da soma anterior por 11
Passo 4:
Subtraia o resto obtido no passo anterior de 11.
Passo 5:
Se o resultado da subtração for menor que 10, compare-o com o 10° dígito do CPF; se
não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido e os
passos seguintes podem ser ignorados.
Passo 6:
Multiplique o 1° dígito do CPF por 11
Multiplique o 2° dígito do CPF por 10
Multiplique o 3° dígito do CPF por 9
Multiplique o 4° dígito do CPF por 8
Multiplique o 5° dígito do CPF por 7
Multiplique o 6° dígito do CPF por 6
Multiplique o 7° dígito do CPF por 5
Multiplique o 8° dígito do CPF por 4
Multiplique o 9° dígito do CPF por 3
Multiplique o 10° dígito do CPF por 2
Passo 7:
Some os resultados das multiplicações anteriores do passo anterior
Passo 8:
Encontre o resto da divisão da soma do passo anterior por 11
2
Passo 9:
Subtraia o resto obtido no passo anterior de 11
Passo 10:
Se o resultado da subtração for menor que 10, compare-o com o 11° dígito do CPF; se
não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido. Se não
for, o CPF é válido.
Exemplo: 111.222.333-44 é válido?
Soma1 = 1*10 + 1*9 + 1*8 +2*7 +2*6 + 2*5 + 3*4 + 3*3 + 3*2 = 90
Digito1 = 11 – (soma % 11) = 11 – 2 = 9
Soma2 = 1*11 + 1*10 + 1*9 + 2*8 + 2*7 + 2*6 + 3*5 + 3*4 + 3*3 + 9*2 = 126
Digito2 = 11 – 5 = 6
111.222.333-44 não é válido! Para ser válido, deveria ser 111.222.333-96. 
