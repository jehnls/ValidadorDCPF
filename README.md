# ValidadorDCPF
Crie um programa para validar CPF (o usuário informa os onze dígitos do documento <br>
e ele informa se o número informado é válido ou não). Um CPF é composto de 11<br>
dígitos, em que os dois últimos são os dígitos verificadores. Para ser válido, o primeiro<br>
e o segundo dígitos do CPF informado devem ser iguais a determinados valores, como<br>
descrito abaixo.<br>
<br>
Para validação do CPF da pessoa, utilize a seguinte estratégia.<br>
Passo 1:<br>
Multiplique o 1° dígito do CPF por 10<br>
Multiplique o 2° dígito do CPF por 9<br>
Multiplique o 3° dígito do CPF por 8<br>
Multiplique o 4° dígito do CPF por 7<br>
Multiplique o 5° dígito do CPF por 6<br>
Multiplique o 6° dígito do CPF por 5<br>
Multiplique o 7° dígito do CPF por 4<br>
Multiplique o 8° dígito do CPF por 3<br>
Multiplique o 9° dígito do CPF por 2<br>
Passo 2:<br>
Some os resultados das multiplicações anteriores.<br>
Passo 3:<br>
Encontre o resto da divisão da soma anterior por 11<br>
Passo 4:<br>
Subtraia o resto obtido no passo anterior de 11.<br>
Passo 5:<br>
Se o resultado da subtração for menor que 10, compare-o com o 10° dígito do CPF; se<br>
não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido e os<br>
passos seguintes podem ser ignorados.<br>
Passo 6:<br>
Multiplique o 1° dígito do CPF por 11<br>
Multiplique o 2° dígito do CPF por 10<br>
Multiplique o 3° dígito do CPF por 9<br>
Multiplique o 4° dígito do CPF por 8<br>
Multiplique o 5° dígito do CPF por 7<br>
Multiplique o 6° dígito do CPF por 6<br>
Multiplique o 7° dígito do CPF por 5<br>
Multiplique o 8° dígito do CPF por 4<br>
Multiplique o 9° dígito do CPF por 3<br>
Multiplique o 10° dígito do CPF por 2<br>
Passo 7:<br>
Some os resultados das multiplicações anteriores do passo anterior<br>
Passo 8:<br>
Encontre o resto da divisão da soma do passo anterior por 11<br>
Passo 9:<br>
Subtraia o resto obtido no passo anterior de 11<br>
Passo 10:<br>
Se o resultado da subtração for menor que 10, compare-o com o 11° dígito do CPF; se<br>
não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido. Se não<br>
for, o CPF é válido.<br>
Exemplo: 111.222.333-44 é válido?<br>
Soma1 = 1*10 + 1*9 + 1*8 +2*7 +2*6 + 2*5 + 3*4 + 3*3 + 3*2 = 90<br>
Digito1 = 11 – (soma % 11) = 11 – 2 = 9<br>
Soma2 = 1*11 + 1*10 + 1*9 + 2*8 + 2*7 + 2*6 + 3*5 + 3*4 + 3*3 + 9*2 = 126<br>
Digito2 = 11 – 5 = 6<br>
111.222.333-44 não é válido! Para ser válido, deveria ser 111.222.333-96. <br>
