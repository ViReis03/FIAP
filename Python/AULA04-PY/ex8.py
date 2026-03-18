distancia = float(input("Digite o KM percorrido: "))
combustivel = float(input("Quantidade de combustivel gasto: "))

kml = (distancia / combustivel)

print("Seu consumo foi de: " + str(kml) + " Km/L")