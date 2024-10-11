import flet as ft
from models import Produto
from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker

CONN = "sqlite:///project.db"

engine = create_engine(CONN, echo = True)
Session = sessionmaker(bind=engine)
session = Session()


def main (page: ft.Page):
    page.title ="Cadastro App"
    lista_produtos = ft.ListView()

    def execute (e):
        try:
            novo_produto = Produto(titulo=produto.value, preco=preco.value)
            session.add(novo_produto)
            session.commit()
            lista_produtos.controls.append(ft.Container(
                    ft.Text(produto.value),
                    bgcolor=ft.colors.BLACK12,
                    padding=12,
                    alignment=ft.alignment.center,
                    margin=3,
                    border_radius=10
                ))
            txt_erro.visible = False
            txt_acerto.visible = True
        except:
            txt_erro.visible = True
            txt_acerto.visible = False

        page.update()
        print("Produto Salvo Com Sucesso!")


    txt_erro = ft.Container(ft.Text('Erro ao Salvar o produto!'), visible=False, bgcolor=ft.colors.RED, padding=10, alignment=ft.alignment.center)
    txt_acerto = ft.Container(ft.Text('Produto Salvo com Suceso!'), visible=False, bgcolor=ft.colors.GREEN, padding=10, alignment=ft.alignment.center)
    txt_titulo = ft.Text('Titulo Produto')
    produto= ft.TextField(label="Digite o produto...", text_align=ft.TextAlign.LEFT)
    txt_preco = ft.Text('Preço do Produto')
    preco= ft.TextField(value="0", label="Digite o preço do produto", text_align=ft.TextAlign.LEFT)
    btn_action = ft.ElevatedButton('Cadastrar', on_click=execute)
    page.add(
        txt_erro,
        txt_acerto,
        txt_titulo,
        produto,
        txt_preco,
        preco,
        btn_action
    )

    for p in session.query(Produto).all():
        lista_produtos.controls.append(
            ft.Container(
                ft.Text(p.titulo),
                bgcolor=ft.colors.BLACK12,
                padding=12,
                alignment=ft.alignment.center,
                margin=3,
                border_radius=10
            )
            )
        
    page.add(
        lista_produtos
    )
ft.app(target=main)