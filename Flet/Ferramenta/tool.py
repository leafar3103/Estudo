import flet as ft
import os

def main (page: ft.Page):
    page.title="Tools com Flet"
    page.window.width=400
    page.window.height=800
    page.theme_mode = "dark"
    page.vertical_alignment = "center"
    page.horizontal_alignment = "center"
    page.spacing = 20
    # center_title=True
    def mundo(e):
        # dir = os.mkdir
        # mudanca=dir(produto.value)
        # list = os.listdir
        # print(list)
        menubar = ft.MenuBar(
            expand=True,
            style=ft.MenuStyle(
                alignment=ft.alignment.top_left,
                bgcolor=ft.Colors.RED_100,
                mouse_cursor={
                    ft.ControlState.HOVERED: ft.MouseCursor.WAIT,
                    ft.ControlState.DEFAULT: ft.MouseCursor.ZOOM_OUT,
                },
            ),
             controls=[
                ft.SubmenuButton(
                    content=ft.Text("File"),
                    # on_open=handle_on_open,
                    # on_close=handle_on_close,
                    # on_hover=handle_on_hover,
                    controls=[
                        ft.MenuItemButton(
                            content=ft.Text("About"),
                            leading=ft.Icon(ft.Icons.INFO),
                            style=ft.ButtonStyle(
                                bgcolor={ft.ControlState.HOVERED: ft.Colors.GREEN_100}
                            ),
                            on_click=mundo,
                        ),],),],
                        )
        return ft.Row([menubar])        
    # mundo = fc.funcao

    texto = ft.Text("Olá Mundo", theme_style=ft.TextThemeStyle.TITLE_MEDIUM)
    produto= ft.TextField(label="Digite o produto...", text_align=ft.TextAlign.LEFT)
    btn_action = ft.ElevatedButton('Cadastrar', on_click=mundo)
    page.add(
        texto,
        produto,
        btn_action
        # mundo
    )


    page.update()
    print(produto.value)

ft.app(target=main)