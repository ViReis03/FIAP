nome = input("Digite seu Nome: ")
qtde = int(input("Digite a Quantidade de Produtos Vendidos: "))
total = float(input("Digite Valor Total das Vendas: "))

salario = (1800) + (150 * qtde) + (total * 0.03)

print("Salario Final do " + nome + ": R$" + str(salario))