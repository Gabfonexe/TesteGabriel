import json
from pathlib import Path
import locale

locale.setlocale(locale.LC_ALL, 'pt_BR.UTF-8')

def buscar_dados():
    caminho_arquivo = Path('C:/Users/bielf/OneDrive/Documentos/testando/Teste/dados.json')
    if caminho_arquivo.exists():
        with caminho_arquivo.open('r', encoding='utf-8') as arquivo:
            dados = json.load(arquivo)
            manipular_dados(dados)
    else:
        print("Arquivo não encontrado.")

def manipular_dados(dados):
    total = obter_elemento_por_id('Total')
    dia_maior = obter_elemento_por_id('Dia mais lucrativo')
    dia_menor = obter_elemento_por_id('Dia menos lucrativo')
    media_mensal = obter_elemento_por_id('Quantidade de dias onde o valor foi maior que a média mensal')

    numeros = [elemento['valor'] for elemento in dados]
    maior = max(numeros)
    numeros_positivos = [numero for numero in numeros if numero > 0]
    menor = min(numeros_positivos)
    soma = sum(numeros)
    media = soma / 30
    maior_que_media = [numero for numero in numeros if numero > media]

    maior = locale.format_string('%.2f', maior, grouping=True)
    menor = locale.format_string('%.2f', menor, grouping=True)
    soma = locale.format_string('%.2f', soma, grouping=True)
    media = locale.format_string('%.2f', media, grouping=True)
    maior_que_media = [locale.format_string('%.2f', numero, grouping=True) for numero in maior_que_media]


    total.set_text_content(soma)
    dia_maior.set_text_content(maior)
    dia_menor.set_text_content(menor)
    media_mensal.set_text_content(str(len(maior_que_media)))

class Elemento:
    def __init__(self, id):
        self.id = id
        self.text_content = ""

    def set_text_content(self, text_content):
        self.text_content = text_content
        print(f" {self.id} : {text_content}")

def obter_elemento_por_id(id):
    return Elemento(id)

if __name__ == "__main__":
    buscar_dados()
